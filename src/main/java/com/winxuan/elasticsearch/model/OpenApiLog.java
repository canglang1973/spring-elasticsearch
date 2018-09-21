package com.winxuan.elasticsearch.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author leitao.
 * @category
 * @time: 2018/5/23  13:01
 * @version: 1.0
 * @description: 开放平台日志模型
 **/
@Data
@ToString
public class OpenApiLog implements Serializable{

    /**
     * 请求的api
     */
    private String method;

    /**
     * 请求耗时 ms
     */
    private long lossTime;

    /**
     * 日志内容,请求类型日志内容是请求参数,响应类型日志内容是响应参数
     */
    private String request;

    private String response;

    /**
     * 请求是否成功 true:成功  false:失败
     * 接口是否可用
     */
    private boolean success = true;

    /**
     * 店铺号
     */
    private long shopId;

    /**
     * 客户id
     */
    private long customerId;

    /**
     * 异常类型
     */
    private LogTypeEnum exceptionType;

    /**
     * 应用键
     */
    private String appKey;

    /**
     * 请求ip
     */
    private String ip;

}
