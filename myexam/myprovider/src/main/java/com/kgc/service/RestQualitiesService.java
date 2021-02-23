package com.kgc.service;

import com.kgc.pojo.Qualities;

public interface RestQualitiesService {
    public int add(Qualities qualities);
    public Qualities getQualities(Integer id);
}
