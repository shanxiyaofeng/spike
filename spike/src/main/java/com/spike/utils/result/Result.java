package com.spike.utils.result;

/**
 * @Auther: guifang.weng
 * @Date: 2018/11/11 4:07 PM
 * @Description:
 */
public class Result<T> {

    private int code;

    private String msg;

    private T data;

    /**
     * 成功时调用
     * @param <T>
     * @return
     */
    public static <T> Result<T> SUCCESS(T data) {
        return new Result<>(data);
    }

    /**
     * 失败时调用
     * @param <T>
     * @return
     */
    public static <T> Result<T> ERROR(CodeMsg cm) {
        return new Result<>(cm);
    }

    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(CodeMsg cm) {
        if(cm == null) {
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

}
