package com.zjc.controller;/*

    @author  zjc
    @create 2021-02-03-12:20
     
*/

import com.zjc.bean.Department;
import com.zjc.bean.Employee;
import com.zjc.mapper.DepartmentMapper;
import com.zjc.mapper.EmployeeMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DeptController {
    @Resource
    private DepartmentMapper departmentMapper;

    @Resource
    private EmployeeMapper employeeMapper;


    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDepartById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }
}
