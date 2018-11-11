package com.spike.utils.result;

/**
 * @Auther: guifang.weng
 * @Date: 2018/11/11 4:23 PM
 * @Description:
 */
public class CodeMsg {

    private int code;

    private String msg;

     //通用
    public static CodeMsg SUCCESS = new CodeMsg(0,"success");

    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");

    //登录模块 5002xx

    //商品模块 5003xx

    //订单模块 5004xx

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
