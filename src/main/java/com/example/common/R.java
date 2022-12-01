package com.example.common;

import lombok.Data;

@Data
public class R<T> {

    private Integer code;
    private T data;
    private String msg;

    public static <T>R<T> success(T object){
        R<T> r = new R<T>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T>R<T> error(String msg){
        R<T> r = new R<T>();
        r.msg = msg;
        r.code = 0;
        return r;
    }
}
