package com.xiaoran.mybatis.metaobjectHanndler;

//自定义公共字段填充处理器

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

public class MymetaoobjectHandler implements MetaObjectHandler {

//插入操作自动填充
    @Override
    public void insertFill(MetaObject metaObject) {
        //首先获取到我们需要自动填充的值
        Object fieldValue=getFieldValByName("name",metaObject);
        //判断我们获取到的字段是否有值
        if(fieldValue==null){
            System.out.println("******************插入操作 满足填充条件*******************");
            //设置我们的自动填充
            setFieldValByName("name","小冉向往自由",metaObject);
        }
    }
//修改操作自动填充
    @Override
    public void updateFill(MetaObject metaObject) {
//首先获取到我们需要自动填充的值
        Object fieldValue=getFieldValByName("name",metaObject);
        //判断我们获取到的字段是否有值
        if(fieldValue==null){
            System.out.println("*****************更新操作 满足填充条件*******************");
            //设置我们的自动填充
            setFieldValByName("name","小芳向往自由",metaObject);
        }
    }
}
