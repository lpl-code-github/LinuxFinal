package com.lpl.test2.until;

import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * 这里使用前后端分离开发规范，封装了数据返回格式
 * @param <T>
 */
@Data
@Accessors(chain = true)
public class Result<T> implements Serializable {

    private Boolean success;

    private Integer code;

    private String message;

    private T data;

    //成功
    public static<T> Result<T> getSuccessResultBean(String message, T data) {
        return new Result<T>()
                .setSuccess(true)
                .setCode(200)
                .setMessage(message)
                .setData(data);
    }


    public static<T> Result<T> getErrorResultBean(String message, T data) {
        return new Result<T>()
                .setSuccess(false)
                .setCode(403)
                .setMessage(message)
                .setData(data);
    }

    public static<T> Result<T> getUnknownResultBean() {
        return new Result<T>()
                .setSuccess(false)
                .setCode(500)
                .setMessage("错误，拒绝访问！")
                .setData(null);
    }

    public static<T> Result<T> getForbidResultBean(String message) {
        return new Result<T>()
                .setSuccess(false)
                .setCode(403)
                .setMessage(message)
                .setData(null);
    }


}

