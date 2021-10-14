package com.xiaoran.mybatis.controller;


import com.xiaoran.mybatis.beans.Employee;
import com.xiaoran.mybatis.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoran
 * @since 2021-10-14
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    public void lonin(){
        Employee employee=new Employee();
        employee.setName("小冉");
        employee.setEmail("@qq123");
        employee.setGender("1");
        employee.setAge(22);
       boolean page= employeeService.save(employee);
    }

}

