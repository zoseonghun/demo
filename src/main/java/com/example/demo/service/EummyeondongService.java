package com.example.demo.service;

import com.example.demo.mapper.EummyeondongMapper;
import com.example.demo.vo.Eummyeondong;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EummyeondongService {

    private final EummyeondongMapper eummyeondongMapper;

    public List<Eummyeondong> findEummyeondong() {
        return eummyeondongMapper.findEummyeondong();
    }

    public List<Eummyeondong> findEummyeondongBySigunguNumber(int sigunguNumber) {
        return eummyeondongMapper.findEummyeondongBySigunguNumber(sigunguNumber);
    }
}
