package com.kgc.mapper;

import com.kgc.pojo.Products;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductsMapper {
    public List<Products> getAllProducts(Map<String,Object> params);
    public int getcount(Map<String,Object> params);

    public int add(Products products);

    public Products getProductsById(Integer id);
    public int update(Products products);
}
