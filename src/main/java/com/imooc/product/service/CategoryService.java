package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-23 16:55
 * @Description: 类目
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> CategoryTypeList);
}
