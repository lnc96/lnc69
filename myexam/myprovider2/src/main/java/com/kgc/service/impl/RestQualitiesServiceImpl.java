package com.kgc.service.impl;

import com.kgc.mapper.QualitiesMapper;
import com.kgc.pojo.Qualities;
import com.kgc.service.RestQualitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class RestQualitiesServiceImpl implements RestQualitiesService {
    @Autowired
    QualitiesMapper qualitiesMapper;
    @Override
    @RequestMapping("/addQ")
    public int add(@RequestBody Qualities qualities) {
        return qualitiesMapper.add(qualities);
    }

    @Override
    @RequestMapping("/getProducts/{id}")
    public Qualities getQualities(@PathVariable Integer id) {
        return qualitiesMapper.getQualities(id);
    }
}
