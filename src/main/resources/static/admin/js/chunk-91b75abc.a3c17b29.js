(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-91b75abc"],{"445f":function(t,e,i){},4920:function(t,e,i){"use strict";i.d(e,"b",(function(){return a})),i.d(e,"a",(function(){return n})),i.d(e,"e",(function(){return r})),i.d(e,"d",(function(){return c})),i.d(e,"c",(function(){return o}));i("b775"),i("b83f");var s=i("23f6");function a(t){return Object(s["a"])({url:"/api/admin/product_reviews/list",method:"post",data:t})}function n(t){return Object(s["a"])({url:"/api/admin/product_reviews/detail",method:"post",data:t})}function r(t){return Object(s["a"])({url:"/api/admin/product_reviews/reply",method:"post",data:t})}function c(t){return Object(s["a"])({url:"/api/admin/product_reviews/recommend",method:"post",data:t})}function o(t){return Object(s["a"])({url:"/api/admin/product_reviews/hidden",method:"post",data:t})}},6166:function(t,e,i){"use strict";i("445f")},"9d3a":function(t,e,i){"use strict";i.r(e);var s=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticClass:"app-container"},[i("el-card",{staticStyle:{margin:"10px 0","font-size":"14px","line-height":"30px"}},[i("el-row",{staticStyle:{"font-weight":"800"}},[t._v("\n      操作提示：\n    ")]),t._v(" "),i("el-row",[t._v("\n      1、这个界面看上去像聊天界面，但是买家只可以追评1次，而商家管理员回复次数不受限，都会展示到对应商品详情页。\n    ")])],1),t._v(" "),i("el-card",{attrs:{shadow:"never"}},[i("div",{staticStyle:{padding:"0 0 20px 0"}},[t._v("\n      评论回复\n    ")]),t._v(" "),i("el-card",{staticClass:"bottom",attrs:{shadow:"never"}},[i("div",{staticClass:"itemList"},[i("div",{staticClass:"avatar"},[i("el-image",{staticStyle:{width:"50px",height:"50px"},attrs:{src:t.list.avatar+"?imageView2/1/w/50/h/50/q/75"}})],1),t._v(" "),i("div",{staticClass:"content"},[i("div",{staticClass:"top"},[i("div",{staticClass:"title"},[t._v(t._s(t.list.username))]),t._v(" "),i("div",{staticClass:"time"},[t._v(t._s(t.list.date))])]),t._v(" "),i("div",{staticClass:"desc"},[i("div",{staticClass:"descText"},[t._v(t._s(t.list.content))]),t._v(" "),i("div",{staticClass:"descImg"},t._l(t.list.picUrlList,(function(e,s){return i("div",{key:s,staticStyle:{"margin-right":"10px"}},[i("el-popover",{attrs:{trigger:"hover"}},[i("el-image",{staticStyle:{width:"150px",height:"150px"},attrs:{src:e+"?imageView2/1/w/100/h/100/q/125"}}),t._v(" "),i("el-image",{staticStyle:{width:"50px",height:"50px"},attrs:{slot:"reference",src:e+"?imageView2/1/w/50/h/50/q/75"},slot:"reference"})],1)],1)})),0)])])])]),t._v(" "),t._l(t.list.replyList,(function(e,s){return i("el-card",{key:s,staticClass:"bottom",attrs:{shadow:"never"}},[i("div",{staticClass:"itemList",class:1===e.originType?"reverse":""},[i("div",{staticClass:"avatar"},[i("el-image",{staticStyle:{width:"50px",height:"50px"},attrs:{src:e.avatar+"?imageView2/1/w/50/h/50/q/75"}})],1),t._v(" "),i("div",{staticClass:"content"},[i("div",{staticClass:"top",class:1===e.originType?"reverse":""},[i("div",{staticClass:"title"},[t._v(t._s(e.username))]),t._v(" "),i("div",{staticClass:"time"},[t._v(t._s(e.date))])]),t._v(" "),i("div",{staticClass:"desc"},[i("div",{staticClass:"descText"},[t._v(t._s(e.content))])])])])])})),t._v(" "),i("el-input",{attrs:{type:"textarea",autosize:{minRows:6},placeholder:"请输入内容"},model:{value:t.form.content,callback:function(e){t.$set(t.form,"content",e)},expression:"form.content"}}),t._v(" "),i("el-button",{staticStyle:{"margin-top":"20px"},attrs:{type:"primary"},on:{click:t.handleReply}},[t._v("回复")])],2)],1)},a=[],n=(i("96cf"),i("3b8d")),r=i("4920"),c={data:function(){return{form:{id:"",content:""},id:"",list:{}}},created:function(){this.id=this.$route.params.id,this.getList()},methods:{getList:function(){var t=Object(n["a"])(regeneratorRuntime.mark((function t(){var e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return this.$myLoading.myLoading.loading(),t.next=3,Object(r["a"])({id:parseInt(this.id)});case 3:e=t.sent,this.list=e.result,this.form.id=e.result.id,console.log(this.list),this.$myLoading.myLoading.closeLoading();case 8:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),handleReply:function(){var t=Object(n["a"])(regeneratorRuntime.mark((function t(){var e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,Object(r["e"])(this.form);case 2:e=t.sent,0==e.status&&(this.form.content=""),this.getList();case 5:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}()}},o=c,d=(i("6166"),i("2877")),l=Object(d["a"])(o,s,a,!1,null,"f576fab2",null);e["default"]=l.exports}}]);