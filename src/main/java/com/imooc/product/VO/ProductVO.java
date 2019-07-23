package com.imooc.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-23 17:04
 * @Description:
 */
@Data
public class ProductVO {
//     此注解用于属性上，作用是把该属性的名称序列化为另外一个名称
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
}
