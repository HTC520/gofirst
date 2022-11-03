package com.gofirst.hello.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Student {
    @ApiModelProperty(value="姓名",required = true)
    private String name;//姓名
    @ApiModelProperty(value="年龄",required = true)
    private int age;//年龄
    @ApiModelProperty(value="生日",required = true)
    private Date birthday;//生日
    @ApiModelProperty(value="钱包",required = true)
    private Float money;//钱包
}
