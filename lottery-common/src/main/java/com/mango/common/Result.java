package com.mango.common;

/**
 * @description: 统一结果返回
 * @author: mango
 * @time: 2023/4/15 16:23
 */
public class Result {

    private static final long serialVersionUID = -3826891916021780628L;
    private String code;
    private String message;

    public Result(String code, String info) {
        this.code = code;
        this.message = info;
    }

    public Result buildSuccessResult(){
        return new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getMessage());
    }
    public Result buildFailResult(){
        return new Result(Constants.ResponseCode.FAIL.getCode(), Constants.ResponseCode.FAIL.getMessage());
    }

}
