package com.example.demo.mapper;

import com.example.demo.vo.Sigungu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SigunguMapper {

    List<Sigungu> findSigungu();

    List<Sigungu> findSigunguByDoNumber(int doNumber);
}
