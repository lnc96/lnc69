package com.kgc.feign;

import com.kgc.feign.impl.ProductFeignClientImpl;
import com.kgc.feign.impl.QualitiesFeignClientImpl;
import com.kgc.pojo.Qualities;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@CrossOrigin
@FeignClient(name="myprovider",fallback= QualitiesFeignClientImpl.class)
public interface QualitiesFeignClient {
    @RequestMapping("/addQ")
    public int add(@RequestBody Qualities qualities);

    @RequestMapping("/getProducts/{id}")
    public Qualities getQualities(@PathVariable Integer id);
}
