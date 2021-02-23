package com.kgc.service;

import com.kgc.pojo.Products;
import com.kgc.util.PageUtil;

public interface ProductService {
    public PageUtil<Products> getpage(String productName, Integer pageIndex, Integer pageSize);

    public int add(Products products);

    public Products getProductsById(Integer id);
    public int update(Products products);
}
