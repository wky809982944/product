package com.imooc.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum  ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;
    private Integer code;
    private String message;
}
