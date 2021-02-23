package com.kgc.service;

import com.kgc.pojo.Qualities;
import org.springframework.web.bind.annotation.RequestBody;

public interface RestQualitiesService {
    public int add(@RequestBody Qualities qualities);
    public Qualities getQualities(Integer id);
}
