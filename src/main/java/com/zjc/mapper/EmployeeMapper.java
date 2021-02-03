package com.zjc.mapper;/*

    @author  zjc
    @create 2021-02-03-13:07
     
*/

import com.zjc.bean.Employee;

//@Mapper 或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);
}
