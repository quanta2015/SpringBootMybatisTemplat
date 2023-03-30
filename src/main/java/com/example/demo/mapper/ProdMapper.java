package com.example.demo.mapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.model.Prod;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author manqingchen
* @description 针对表【t_prod】的数据库操作Mapper
* @createDate 2023-03-23 14:52:15
* @Entity com.example.demo.model.Prod
*/
public interface ProdMapper extends BaseMapper<Prod> {

    List<Prod> selectBest();

    List<Prod> searchByName(@Param("name") String name);

}


