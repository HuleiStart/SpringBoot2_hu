package org.hulei.springboot2_hu.bean;

import lombok.Data;

import java.util.Date;
/**
 * @author Mr.Hu
 * @create 2022/10/20 14:46
 */

@Data
public class Person {

    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;

}