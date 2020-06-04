package com.alix.infosystem.common.frame.result;


import lombok.Data;

import java.io.Serializable;

@Data
public class Result  implements Serializable {

    /** 错误码. */
    private  Integer code;

    /** 提示信息. */
    private String message;

    /** 具体的内容. */
    private Object data;

    public Result(ResultCode resultCode, Object data){
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }

}
