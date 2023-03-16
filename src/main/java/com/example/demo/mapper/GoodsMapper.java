package com.example.demo.mapper;

import com.example.demo.model.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.alibaba.fastjson.JSONObject;

public interface GoodsMapper extends BaseMapper<Goods> {

    int insertGoods(Goods goods);

    Goods selectById(@Param("id") int id);

    List<Goods> selectByName(@Param("name") String name);

    List<JSONObject> procGoodsDetail(@Param("params") String params);
}