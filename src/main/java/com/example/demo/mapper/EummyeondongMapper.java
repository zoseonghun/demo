package com.example.demo.mapper;

import com.example.demo.service.EummyeondongService;
import com.example.demo.vo.Eummyeondong;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EummyeondongMapper {

    List<Eummyeondong> findEummyeondong();

    List<Eummyeondong> findEummyeondongBySigunguNumber(int sigunguNumber);
}
