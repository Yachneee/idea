package com.kfm.kfmBatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yachne
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private String msg;
    private int code;
    private Object data;

    private static final int SUCCESS_CODE = 1;
    private static final int FAILURE_CODE = 0;

    public static Result success(String msg, int code, Object data) {
        return new Result(msg, code, data);
    }

    public static Result success(String msg) {
        return new Result(msg, SUCCESS_CODE, null);
    }

    public static Result success(String msg, Object data) {
        return new Result(msg, SUCCESS_CODE, data);
    }

    public static Result failure(String msg) {
        return new Result(msg, FAILURE_CODE, null);
    }

    public static Result failure(String msg, int code) {
        return new Result(msg, code, null);
    }
}
