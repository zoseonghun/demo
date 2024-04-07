package com.example.demo.service;

import com.example.demo.mapper.SigunguMapper;
import com.example.demo.vo.Sigungu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SigunguService {

    private final SigunguMapper sigunguMapper;

    public List<Sigungu> findSigungu() {
        return sigunguMapper.findSigungu();
    }

    public List<Sigungu> findSigunguByDoNumber(int doNumber) {
        return sigunguMapper.findSigunguByDoNumber(doNumber);
    }
}
