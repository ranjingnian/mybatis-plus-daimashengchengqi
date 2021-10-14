package com.xiaoran.mybatis.service.impl;

import com.xiaoran.mybatis.beans.Employee;
import com.xiaoran.mybatis.mapper.EmployeeMapper;
import com.xiaoran.mybatis.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoran
 * @since 2021-10-14
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
