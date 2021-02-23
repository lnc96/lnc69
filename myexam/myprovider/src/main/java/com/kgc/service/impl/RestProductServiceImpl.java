package com.kgc.service.impl;

import com.kgc.mapper.ProductsMapper;
import com.kgc.pojo.Products;
import com.kgc.service.RestProductService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
public class RestProductServiceImpl implements RestProductService {
    @Autowired
    private ProductsMapper productsMapper;
    @RequestMapping("/page")
    @Override
    public PageUtil<Products> getpage(@RequestParam("productName")String productName,
                                      @RequestParam("pageIndex")Integer pageIndex,
                                      @RequestParam("pageSize")Integer pageSize) {
        Map<String ,Object> map=new HashMap<>();
        map.put("productName",productName);
        map.put("from",(pageIndex-1)*pageSize);
        map.put("pageSize",pageSize);

        //创建分页对象
        PageUtil<Products> page=new PageUtil<>();
        page.setPageIndex(pageIndex);
        page.setPageSize(pageSize);
        //调用数据访问层获取当前页的个数、
        int totalcount=productsMapper.getcount(map);
        page.setTotalCount(totalcount);
        //调用数据访问层的获取当前页的员工集合\
        List<Products> list=productsMapper.getAllProducts(map);
        page.setList(list);
        System.out.println("8003启动");

        return page;
    }
    @RequestMapping("/add")
    @Override
    public int add(@RequestBody Products products) {
        return productsMapper.add(products);
    }

    @RequestMapping("/getProductsById/{id}")
    @Override
    public Products getProductsById(@PathVariable Integer id) {
        return productsMapper.getProductsById(id);
    }

    @RequestMapping("/update")
    @Override
    public int update(@RequestBody Products products) {
        return productsMapper.update(products);
    }


}
