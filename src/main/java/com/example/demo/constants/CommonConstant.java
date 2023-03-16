package com.example.demo.constants;


public class CommonConstant {

    /**
     * 成功响应码
     **/
    public static final Integer SUCCESS_CODE = 0;

    /**
     * 已删除错误码
     **/
    public static final Integer DELETE_CODE = -1;

    /**
     * 统一捕获错误码
     **/
    public static final Integer ERROR_CODE = 9999;

    /**
     * 已删除
     **/
    public static final Integer DB_YES = 1;
    /**
     * 未删除
     **/
    public static final Integer DB_NO = 0;

    public static final String JWT_TOKEN_HEADER = "Authorization";
    public static final String JWT_TOKEN_PREFIX = "Bearer ";
    public static final String JWT_PAYLOAD_KEY = "payload";
    public static final String JWT_USER_ID = "user_id";
    public static final String JWT_CLIENT_ID = "client_id";
    public static final String JWT_ORG_ID = "org_id";
    public static final String JWT_USER_INFO = "user_info";

    public static final String UNKNOWN = "unknown";

    public static final String LOOPBACK_ADDRESS = "127.0.0.1";

    public static final int ADDR_LENGTH = 15;

    public static final String COMMAS = ",";

    public static final String UNDEFINED = "undefined";


}
