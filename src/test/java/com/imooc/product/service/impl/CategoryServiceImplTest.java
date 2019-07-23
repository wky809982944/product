package com.imooc.product.service.impl;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-23 16:59
 * @Description:
 */
@Component
public class CategoryServiceImplTest extends ProductApplicationTests {
    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(list.size()>0);
    }
}
