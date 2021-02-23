package com.kgc.controller;

import com.kgc.pojo.Qualities;
import com.kgc.service.QualitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class QualitiesController {
    @Autowired
    QualitiesService qualitiesService;

    @RequestMapping("/addQ")
    public int add(@RequestBody Qualities qualities) {
        return qualitiesService.add(qualities);
    }

    @RequestMapping("/getProducts/{id}")
    public Qualities getQualities(@PathVariable Integer id) {
        return qualitiesService.getQualities(id);
    }
}
