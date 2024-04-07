package com.example.demo.controller;

import com.example.demo.service.SigunguService;
import com.example.demo.vo.Sigungu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SigunguController {

    private final SigunguService sigunguService;

    @RequestMapping("/sigungu")
    @ResponseBody
    public List<Sigungu> findSigungu() {
        return sigunguService.findSigungu();
    }

    @GetMapping("/sigungu/{doNumber}")
    @ResponseBody
    public List<Sigungu> findSigunguByDoNumber(@PathVariable int doNumber) {
        return sigunguService.findSigunguByDoNumber(doNumber);
    }
}
