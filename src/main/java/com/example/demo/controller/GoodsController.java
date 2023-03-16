package com.example.demo.controller;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.service.GoodsService;
import com.example.demo.model.Goods;
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
public class GoodsController extends BaseController {

    @Autowired
    private GoodsMapper goodsMapper;

    @GetMapping("/select")
    public ResponseEntity<ResultVO<List<Goods>>> select()  {
        List<Goods> goodsList = goodsMapper.selectList(null);
        return success(goodsList);
    }

    @GetMapping("/selectById")
    public ResponseEntity<ResultVO<Goods>> selectById(@RequestParam("id") int id)  {
        Goods goods = goodsMapper.selectById(id);
        return success(goods);
    }


    @GetMapping("/selectByName")
    public ResponseEntity<ResultVO<List<Goods>>> selectByName(@RequestParam("name") String name)  {
        List<Goods> goodsList = goodsMapper.selectByName(name);
        return success(goodsList);
    }


    @GetMapping("/selectPage")
    public ResponseEntity<ResultVO<Page<Goods>>> selectPage()  {
        Page<Goods> page = new Page<>(3, 10);
        Page<Goods> goodsList = goodsMapper.selectPage(page);
        return success(goodsList);
    }

    @GetMapping("/insert")
    public ResponseEntity<ResultVO<Goods>> insert()  {
        Goods goods = new Goods();
        goods.setName("liyang");
        goods.setContent("today is ok");
        goods.setPrice("200");
        int ret = goodsMapper.insertGoods(goods);

//        int ret = goodsMapper.insert(goods);
//        log.info("query user:{}", goodsMapper.selectById(goods.getId()));
        return success(goods);
    }

    @GetMapping("/delete")
    public ResponseEntity delete(@RequestParam("id") int id)  {
        int ret = goodsMapper.deleteById(id);
        return (ret>0)?success():error("delete error!");
    }


    @GetMapping("/procGoodsDetail")
    public ResponseEntity<ResultVO<List<JSONObject>>> callProcUserList(@RequestParam("age") int age)  {
        JSONObject json = new JSONObject();
        json.put("age", age);
        String params = json.toJSONString();

        List<JSONObject> goodsList = goodsMapper.procGoodsDetail(params);
        return success(goodsList);
    }

    @PostMapping("/procSelectPage")
    public ResponseEntity<ResultVO<List<JSONObject>>> procSelectPage(@RequestBody  JSONObject json)  {
        String params = json.toJSONString();
        List<JSONObject> goodsList = goodsMapper.procSelectPage(params);

        return success(goodsList);
    }

}
