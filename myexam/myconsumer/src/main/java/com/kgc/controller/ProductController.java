package com.kgc.controller;

import com.kgc.pojo.Products;
import com.kgc.service.ProductService;
import com.kgc.util.PageUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/page")
    public PageUtil<Products> getPage(@RequestParam(value = "productName",required = false,defaultValue = "") String productName,
                                      @RequestParam(value = "pageIndex",required = false,defaultValue = "1") Integer pageIndex,
                                      @RequestParam(value = "pageSize" ,required = false,defaultValue = "3") Integer pageSize) {
        return productService.getpage(productName, pageIndex, pageSize);
    }

    @RequestMapping("/add")
    public int add(@RequestBody Products products) {
        return productService.add(products);
    }

    @RequestMapping("/getProductsById/{id}")
    public Products getProductsById(@PathVariable Integer id) {
        return productService.getProductsById(id);
    }

    @RequestMapping("/update")
    public int update(@RequestBody Products products) {
        return productService.update(products);
    }
}
