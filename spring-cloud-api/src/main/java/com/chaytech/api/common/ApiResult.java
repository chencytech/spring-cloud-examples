package com.chaytech.api.common;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiResult<T> {
    
    private Integer code;
    private String message;
    private T data;

    public ApiResult(Integer code, String message) {
        this(code,message,null);
    }

    public ApiResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
