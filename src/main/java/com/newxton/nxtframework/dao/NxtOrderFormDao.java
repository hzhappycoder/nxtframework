package com.newxton.nxtframework.dao;

import com.newxton.nxtframework.entity.NxtOrderForm;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (NxtOrderForm)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-19 11:11:05
 */
public interface NxtOrderFormDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NxtOrderForm queryById(Long id);

    /**
     * 通过订单编号查询单条数据
     *
     * @param serialNum 订单编号
     * @return 实例对象
     */
    NxtOrderForm queryBySerialNum(String serialNum);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<NxtOrderForm> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param nxtOrderForm 实例对象
     * @return 对象列表
     */
    List<NxtOrderForm> queryAll(NxtOrderForm nxtOrderForm);

    /**
     * 新增数据
     *
     * @param nxtOrderForm 实例对象
     * @return 影响行数
     */
    int insert(NxtOrderForm nxtOrderForm);

    /**
     * 修改数据
     *
     * @param nxtOrderForm 实例对象
     * @return 影响行数
     */
    int update(NxtOrderForm nxtOrderForm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 用户中心，查询订单
     * @param offset
     * @param limit
     * @param userId
     * @return
     */
    List<NxtOrderForm> queryAllByUserIdAndLimit(@Param("offset") Long offset, @Param("limit") Long limit, @Param("userId") Long userId, @Param("isPaid") Boolean isPaid, @Param("isDelivery") Boolean isDelivery, @Param("isReviews") Boolean isReviews);

    /**
     * 根据id列表查询指定行数据
     * @return
     */
    List<NxtOrderForm> selectByIdSet(@Param("idList") List<Long> idList);

    /**
     * 后台查询订单列表
     * @param offset
     * @param limit
     * @param isPaid
     * @param isDelivery
     * @param dealPlatform
     * @param datelineBegin
     * @param datelineEnd
     * @return
     */
    List<NxtOrderForm> adminOrderFormList(@Param("offset") Long offset, @Param("limit") Long limit, @Param("isPaid") Boolean isPaid, @Param("isDelivery") Boolean isDelivery, @Param("dealPlatform") Integer dealPlatform, @Param("datelineBegin") Long datelineBegin, @Param("datelineEnd") Long datelineEnd);

    /**
     * 后台查询订单统计
     * @param isPaid
     * @param isDelivery
     * @param dealPlatform
     * @param datelineBegin
     * @param datelineEnd
     * @return
     */
    Long adminOrderFormCount(@Param("isPaid") Boolean isPaid, @Param("isDelivery") Boolean isDelivery, @Param("dealPlatform") Integer dealPlatform, @Param("datelineBegin") Long datelineBegin, @Param("datelineEnd") Long datelineEnd);

    /**
     * 查询所有超期等待确认收货的订单
     * @param datelineDeliveryLimit
     * @return
     */
    List<NxtOrderForm> queryAllWaittingReceivedTooLongTime(@Param("datelineDeliveryLimit") Long datelineDeliveryLimit);

}