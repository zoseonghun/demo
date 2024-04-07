package com.example.demo.mapper;

import com.example.demo.vo.Do;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoMapper {

    // 조회
    List<Do> findDo();
}
