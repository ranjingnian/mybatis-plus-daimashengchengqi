package com.xiaoran.mybatis.injector;

//自定义全局操作

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.AbstractSqlInjector;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import org.apache.ibatis.builder.MapperBuilderAssistant;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Myinjector extends DefaultSqlInjector {
    @Override
    public List<AbstractMethod> getMethodList(Class<?> mapperClass, TableInfo tableInfo) {
        Stream.Builder<AbstractMethod> builder=Stream.<AbstractMethod>builder().add(new DeleteAll());
        return builder.build().collect(Collectors.toList());
    }
}
