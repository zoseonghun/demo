package com.example.demo.service;

import com.example.demo.mapper.RiMapper;
import com.example.demo.vo.Ri;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RiService {

    private final RiMapper riMapper;

    public List<Ri> findRi() {
        return riMapper.findRi();
    }

    public List<Ri> findRiByEummyeondongNumber(int eummyeondongNumber) {
        return riMapper.findRiByEummyeondongNumber(eummyeondongNumber);
    }
}
