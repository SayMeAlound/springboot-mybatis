package com.zjc.bean;/*

    @author  zjc
    @create 2021-02-03-12:11
     
*/

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Department {
    private Integer id;
    private String departmentName;
}
