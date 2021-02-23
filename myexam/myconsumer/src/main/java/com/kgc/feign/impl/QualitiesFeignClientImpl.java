package com.kgc.feign.impl;

import com.kgc.feign.QualitiesFeignClient;
import com.kgc.pojo.Qualities;
import org.springframework.stereotype.Component;

@Component
public class QualitiesFeignClientImpl implements QualitiesFeignClient {
    @Override
    public int add(Qualities qualities) {
        return 0;
    }

    @Override
    public Qualities getQualities(Integer id) {
        return null;
    }
}
