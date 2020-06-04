package com.alix.infosystem.common.frame.result;


public enum  ResultCode{

    SCUESS(200,"操作成功"),
    AuthErr(401,"身份验证错误"),
    FAIL(500,"内部异常");

    private Integer code;
    private String message;

    ResultCode(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer code(){
        return this.code;
    }
    public String message(){
        return this.message;
    }


}
