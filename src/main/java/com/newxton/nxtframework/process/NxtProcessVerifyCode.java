package com.newxton.nxtframework.process;

import com.newxton.nxtframework.entity.NxtUserVerify;
import com.newxton.nxtframework.exception.NxtException;
import com.newxton.nxtframework.service.NxtUserVerifyService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author soyojo.earth@gmail.com
 * @time 2020/11/28
 * @address Shenzhen, China
 */
@Component
public class NxtProcessVerifyCode {

    @Resource
    private NxtUserVerifyService nxtUserVerifyService;

    /**
     * 创建手机或邮箱验证码，并且发送
     * @param phoneOrEmail
     * @param type -1：修改绑定 1：绑定账户 2：找回密码 3：提现验证
     * @return
     */
    public Long createAndSendPhoneOrEmailVerifyCode(String phoneOrEmail,Integer type) throws NxtException {

        //检查格式
        if (phoneOrEmail.contains("@")){
            //检查email格式
            String regEmail = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";//邮箱校验
            Pattern pattern = Pattern.compile(regEmail);
            Matcher matcher = pattern.matcher(phoneOrEmail);
            if (!matcher.matches()) {
                throw new NxtException("请输入正确的邮箱");
            }
        }
        else {
            //检查手机格式
            String regPhone = "^((13[0-9])|(14[0-9])|(15[0-9])|(16[0-9])|(17[0-9])|(18[0-9])|(19[0-9]))\\d{8}$";//手机号校验
            Pattern pattern = Pattern.compile(regPhone);
            Matcher matcher = pattern.matcher(phoneOrEmail);
            if (!matcher.matches()) {
                throw new NxtException("请输入正确的手机号");
            }
        }

        //判断频率限制
        NxtUserVerify nxtUserVerifyLast = nxtUserVerifyService.queryLastByPhoneOrEmail(phoneOrEmail);
        if (nxtUserVerifyLast != null){
            if (nxtUserVerifyLast.getStatus().equals(0)){
                if (nxtUserVerifyLast.getDateline() + 60000L > System.currentTimeMillis()){
                    throw new NxtException("1分钟内只能发送一次，请稍后再发");
                }
            }
        }

        //新手机号验证码
        Long code = this.randomCode();

        NxtUserVerify nxtUserVerify = new NxtUserVerify();
        nxtUserVerify.setPhoneOrEmail(phoneOrEmail);
        nxtUserVerify.setDateline(System.currentTimeMillis());
        nxtUserVerify.setStatus(0);
        nxtUserVerify.setType(type);//-1：修改绑定 1：绑定账户 2：找回密码 3：提现验证
        nxtUserVerify.setCode(code);
        nxtUserVerifyService.insert(nxtUserVerify);

        //发送
        this.sendVerifyCode(phoneOrEmail,code);

        return code;

    }

    /**
     * 第三方发送验证码
     * @param phoneOrEmail
     * @param code
     */
    private void sendVerifyCode(String phoneOrEmail,Long code){

        new Thread(new Runnable() {
            @Override
            public void run() {
                //发送验证码
                if (phoneOrEmail.contains("@")){
                    //邮箱
                }
                else {
                    //手机
                }
            }
        }).start();

    }

    /**
     * 随机数字验证码
     * @return
     */
    private Long randomCode(){
        int max=999999;
        int min=111111;
        Random random = new Random();
        Long code = (long)random.nextInt(max)%(max-min+1) + min;
        return code;
    }

}
