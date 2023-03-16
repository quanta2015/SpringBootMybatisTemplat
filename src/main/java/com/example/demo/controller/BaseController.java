package com.example.demo.controller;


import com.example.demo.model.ResultVO;
import com.example.demo.constants.CommonConstant;

import org.springframework.http.ResponseEntity;


public class BaseController {

    protected <T> ResponseEntity<ResultVO<T>> success() {
        ResultVO<T> resultDTO = new ResultVO<T>();
        resultDTO.setSuccess(true);
        resultDTO.setCode(CommonConstant.SUCCESS_CODE);
        resultDTO.setMsg("");
        return ResponseEntity.ok(resultDTO);
    }

    protected <T> ResponseEntity<ResultVO<T>> success(T data) {
        ResultVO<T> resultDTO = new ResultVO<T>();
        resultDTO.setSuccess(true);
        resultDTO.setCode(CommonConstant.SUCCESS_CODE);
        resultDTO.setMsg("");
        resultDTO.setData(data);
        return ResponseEntity.ok(resultDTO);
    }

    protected <T> ResponseEntity<ResultVO<T>> error(String errorMsg) {
        ResultVO<T> resultDTO = new ResultVO<T>();
        resultDTO.setSuccess(false);
        resultDTO.setCode(-1);
        resultDTO.setMsg(errorMsg);
        return ResponseEntity.ok(resultDTO);
    }

    protected <T> ResponseEntity<ResultVO<T>> error(Integer errorCode, String errorMsg) {
        ResultVO<T> resultDTO = new ResultVO<T>();
        resultDTO.setSuccess(false);
        resultDTO.setCode(errorCode);
        resultDTO.setMsg(errorMsg);
        return ResponseEntity.ok(resultDTO);
    }

    protected <T> ResponseEntity<ResultVO<T>> error(T data) {
        ResultVO<T> resultDTO = new ResultVO<T>();
        resultDTO.setSuccess(false);
        resultDTO.setCode(CommonConstant.ERROR_CODE);
        resultDTO.setMsg("");
        resultDTO.setData(data);
        return ResponseEntity.ok(resultDTO);
    }

    protected <T> ResponseEntity<ResultVO<T>> failure(Integer code, String message) {
        return error(code, message);
    }


}
