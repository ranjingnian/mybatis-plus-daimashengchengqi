package com.xiaoran.mybatis.testdemo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoran.mybatis.beans.Employee;
import com.xiaoran.mybatis.controller.EmployeeController;
import com.xiaoran.mybatis.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {
    //获取我们的application全局配置文件
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
    //获取我们的mapper
    EmployeeMapper employeeMapper=applicationContext.getBean("employeeMapper",EmployeeMapper.class);


    //测试我们的分页插件
    @Test
    public void test1(){
       IPage<Employee> page= employeeMapper.selectPage(new Page<Employee>(1,1),null);
        List<Employee>  list=page.getRecords();
        System.out.println(list);
        System.out.println("总条数"+page.getTotal());
        System.out.println("当前页码："+page.getCurrent());
    }
    //测试我的分析插件
    @Test
    public void test2(){
        employeeMapper.delete(null);
    }
    //测试我们的性能分析插件
    @Test
    public void test3(){
        Employee employee=new Employee();
        employee.setName("小泽老师");
        employee.setEmail("@qq.com");
        employee.setGender("0");
        employee.setAge(28);
        employeeMapper.insert(employee);
    }

    //测试我们的乐观锁
    @Test
    public void test4(){
        Employee employee=new Employee();
        employee.setId(7);
        employee.setName("波多野结衣");
        employee.setEmail("www.6666.com");
        employee.setGender("0");
        employee.setAge(18);
        //记住在进行乐观锁的时候需要加上versio，相当于版本号

        employee.setVersion(1);
        employeeMapper.updateById(employee);
    }
    //测试自定义的全局操作
    @Test
    public void test5(){
    Integer i=employeeMapper.deleteAll();
    System.out.println("删除了 "+i);
    }
}
