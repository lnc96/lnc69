package com.kgc.mapper;

import com.kgc.pojo.Qualities;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QualitiesMapper {
    public int add(Qualities qualities);
    public Qualities getQualities(Integer id);
}
