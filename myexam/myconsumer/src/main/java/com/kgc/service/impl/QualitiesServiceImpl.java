package com.kgc.service.impl;

import com.kgc.feign.QualitiesFeignClient;
import com.kgc.pojo.Qualities;
import com.kgc.service.QualitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QualitiesServiceImpl implements QualitiesService {
    @Autowired
    QualitiesFeignClient qualitiesFeignClient;
    @Override
    public int add(Qualities qualities) {
        return qualitiesFeignClient.add(qualities);
    }

    @Override
    public Qualities getQualities(Integer id) {
        return qualitiesFeignClient.getQualities(id);
    }
}
