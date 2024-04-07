package com.example.demo.controller;

import com.example.demo.service.DoService;
import com.example.demo.vo.Do;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DoController {

    private final DoService doService;

    @RequestMapping("/do")
    @ResponseBody
    public List<Do> findDo() {
        return doService.findDo();
    }
}
