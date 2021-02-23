package com.kgc.feign.impl;

import com.kgc.feign.ProductFeignClient;
import com.kgc.pojo.Products;
import com.kgc.service.ProductService;
import com.kgc.util.PageUtil;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductFeignClientImpl implements ProductFeignClient {

    @Override
    public PageUtil<Products> getPage(String productName, Integer pageIndex, Integer pageSize) {
        List<Products> list=new ArrayList<>();
        Products products=new Products();
        products.setProductDesc("asdasd");
        products.setProductName("异常");
        products.setProductSum(28);
        list.add(products);
        PageUtil<Products> page=new PageUtil<>();
        page.setList(list);
        return page;
    }

    @Override
    public int add(Products products) {
        return 400;
    }

    @Override
    public Products getProductsById(Integer id) {
        return null;
    }

    @Override
    public int update(Products products) {
        return 400;
    }
}
