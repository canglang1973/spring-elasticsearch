package com.winxuan.elasticsearch.model;


/**
 * @author leitao.
 * @category
 * @time: 2018/5/22  16:20
 * @version: 1.0
 * @description: 日志类型枚举
 **/
public enum LogTypeEnum {

    /**
     * 请求
     */
    OPEN_REQUEST("OPEN_REQUEST"),
    /**
     * 响应
     */
    OPEN_RESPONSE("OPEN_RESPONSE"),

    /**
     * 参数异常
     */
    PARAMETER_EXC_TYPE("PARAMETER_EXC_TYPE"),

    /**
     * 远程服务异常
     */
    REMOTE_EXC_TYPE("REMOTE_EXC_TYPE"),

    /**
     * 业务异常
     */
    BUSINESS_EXC_TYPE("BUSINESS_EXC_TYPE"),

    /**
     * 系统异常
     */
    SYSTEM_EXC_TYPE("SYSTEM_EXC_TYPE");


    String value;

    private LogTypeEnum(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
