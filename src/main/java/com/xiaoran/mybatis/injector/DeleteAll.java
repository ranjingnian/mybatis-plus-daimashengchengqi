package com.xiaoran.mybatis.injector;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.AbstractSqlInjector;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;

import java.util.List;

public class DeleteAll extends AbstractMethod {
    @Override
    public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
        //创建sql语句
        String sql="delete from "+tableInfo.getTableName();
        //方法名字
        String method="deleteAll";
        SqlSource sqlSource=languageDriver.createSqlSource(configuration,sql,modelClass);
        //addDeleteMappedStatement(接口类型，方法名字，构造好的sqlsource)
        return addDeleteMappedStatement(mapperClass,method,sqlSource);
}
}
