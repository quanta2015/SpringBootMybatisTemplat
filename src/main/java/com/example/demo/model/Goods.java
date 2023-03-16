package com.example.demo.model;

import lombok.*;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;


@Data
@ToString
@TableName("t_goods")
public class Goods {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private String content;

    private String price;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
