package com.example.demo.controller;


import com.example.demo.mapper.GoodsMapper;
import com.example.demo.mapper.ProdMapper;
//import com.example.demo.service.GoodsService;
import com.example.demo.model.Goods;
import com.example.demo.model.Prod;
import com.example.demo.model.ResultVO;


import com.alibaba.fastjson.JSON;
import com.example.demo.service.GoodsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;


import com.alibaba.fastjson.JSONObject;




@Slf4j
@RestController
public class ProdController extends BaseController {

    @Autowired
    private ProdMapper prodMapper;


    @GetMapping("/prodList")
    public ResponseEntity<ResultVO<List<Prod>>> prodList()  {
        List<Prod> list = prodMapper.selectList(null);
        return success(list);
    }


    @GetMapping("/procBestList")
    public ResponseEntity<ResultVO<List<Prod>>> procBestList()  {
        List<Prod> list = prodMapper.selectBest();
        return success(list);
    }


    @PostMapping("/searchByName")
    public ResponseEntity<ResultVO<List<Prod>>> searchByName(@RequestBody  JSONObject json)  {
        String name = (String) json.get("name");
        List<Prod> list = prodMapper.searchByName(name);
        return success(list);
    }

}
