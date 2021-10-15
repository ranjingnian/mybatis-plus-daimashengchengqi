package com.xiaoran.mybatis.testdemo;


import com.xiaoran.mybatis.beans.Employee;
import com.xiaoran.mybatis.beans.User;
import com.xiaoran.mybatis.mapper.EmployeeMapper;
import com.xiaoran.mybatis.mapper.Usermapper;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
    Usermapper usermapper=applicationContext.getBean("usermapper",Usermapper.class);

    //测试逻辑删除
    @Test
    public void test1(){
        Integer integer=usermapper.deleteById(5);
        System.out.println(integer);
    }
    @Test
    public void test2(){
        User user=usermapper.selectById(2);
        System.out.println(user);
    }

    //自动填充的测试
    @Test
    public void test3(){
        User user=new User();
        user.setLogic_flag(0);
        usermapper.insert(user);
    }
}
