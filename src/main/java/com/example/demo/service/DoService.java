package com.example.demo.service;

import com.example.demo.mapper.DoMapper;
import com.example.demo.vo.Do;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoService {

    private final DoMapper doMapper;

    public List<Do> findDo() {
        return doMapper.findDo();
    }

}
