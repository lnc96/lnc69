package com.kgc.service.impl;

import com.kgc.feign.ProductFeignClient;
import com.kgc.pojo.Products;
import com.kgc.service.ProductService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductFeignClient productFeignClient;
    @Override
    public PageUtil<Products> getpage(String productName, Integer pageIndex, Integer pageSize) {
        return productFeignClient.getPage(productName,pageIndex,pageSize);
    }

    @Override
    public int add(Products products) {
        return productFeignClient.add(products);
    }

    @Override
    public Products getProductsById(Integer id) {
        return productFeignClient.getProductsById(id);
    }

    @Override
    public int update(Products products) {
        return productFeignClient.update(products);
    }


}
