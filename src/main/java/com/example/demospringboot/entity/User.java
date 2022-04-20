package com.example.demospringboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-example-demospringboot-entity-User")
@Data
public class User {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String pwd;

    @ApiModelProperty(value = "")
    private String name;
}