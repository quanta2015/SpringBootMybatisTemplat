package com.example.demo.model;



import com.example.demo.constants.CommonConstant;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回参数
 *
 * @author cx
 * @date 2021/6/22 2:24 下午
 */
@Data
public class ResultVO<T> implements Serializable {

    private boolean success = false;
    /**
     * 结果编码：0 成功
     */
    private Integer code;
    /**
     * 异常信息
     */
    private String msg;

    private T data;

    public ResultVO() {
    }


    public ResultVO(boolean isSuccess, Integer code, T data, String message) {
        this.success = isSuccess;
        this.code = code;
        this.data = data;
        this.msg = message;
    }

    public static <T> ResultVO<T> getSuccessResult(T data) {
        return getSuccessResult(data, "");
    }

    public static <T> ResultVO<T> getSuccessResult(T data, String msg) {
        return new ResultVO<T>(true, CommonConstant.SUCCESS_CODE, data, msg);
    }

    public static <T> ResultVO<T> getErrorResult(String message) {
        return new ResultVO<T>(false, CommonConstant.ERROR_CODE, null, message);
    }

    public static <T> ResultVO<T> getErrorResult(Integer code, String message) {
        return new ResultVO<T>(false, code, null, message);
    }

    public static <T, K> ResultVO<T> getErrorResult(ResultVO<K> result) {
        return new ResultVO<T>(result.isSuccess(), result.getCode(), null, result.getMsg());
    }

    public boolean hasError() {
        return !success;
    }
}
