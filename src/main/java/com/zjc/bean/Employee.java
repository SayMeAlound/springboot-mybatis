package com.zjc.bean;/*

    @author  zjc
    @create 2021-02-03-12:09
     
*/

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Employee {
    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer dId;

}
