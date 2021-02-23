package com.kgc.feign;

import com.kgc.feign.impl.ProductFeignClientImpl;
import com.kgc.pojo.Products;
import com.kgc.util.PageUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@FeignClient(name="myprovider",fallback= ProductFeignClientImpl.class)
public interface ProductFeignClient {
    @RequestMapping("/page")
    public PageUtil<Products> getPage(@RequestParam("productName")String productName,
                                      @RequestParam("pageIndex") Integer pageIndex,
                                      @RequestParam("pageSize") Integer pageSize) ;

    @RequestMapping("/add")
    public int add(@RequestBody Products products);

    @RequestMapping("/getProductsById/{id}")
    public Products getProductsById(@PathVariable Integer id);

    @RequestMapping("/update")
    public int update(@RequestBody Products products);
}
