### 项目说明
SpringBoot 集成 MybatisPlus 范例工程。


### 路由接口

```bash
# /select
查询所有记录

# /selectById
根据 id 查询
 
# /selectByName
根据名称查询

# /selectPage
使用自带 Page 插件分页

# /insert
插入新记录，里面包括2种模式
1. insertGoods xml 定义 sql 语句，需要写时间字段
2. insert 调用 BaseMapper，不需要写时间字段

# /delete?id=20
删除记录

# /procGoodsDetail
多表连接查询

# /procSelectPage
单表查询分页，传递参数如下：

{
    "size": 10,
    "page":3,
}

```


### 工具模块
utils 路径下集成了第三方插件

- DataHandler: 自动为数据表添加创建和修改时间
- PageConfig: MybatisPlus 分页插件
- RegJsonParser: 将 resquest 请求 body 的参数添加 JSON 支持




