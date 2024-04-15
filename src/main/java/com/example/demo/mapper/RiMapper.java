package com.example.demo.mapper;

import com.example.demo.vo.Ri;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RiMapper {

    List<Ri> findRi();

    List<Ri> findRiByEummyeondongNumber(int eummyeondongNumber);


}
