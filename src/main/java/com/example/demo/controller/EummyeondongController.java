package com.example.demo.controller;

import com.example.demo.service.EummyeondongService;
import com.example.demo.vo.Eummyeondong;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class EummyeondongController {

    private final EummyeondongService eummyeondongService;

    @RequestMapping("/eummyeondong")
    @ResponseBody
    public List<Eummyeondong> findEummyeondong() {
        return eummyeondongService.findEummyeondong();
    }

    @GetMapping("/eummyeondong/{sigunguNumber}")
    @ResponseBody
    public List<Eummyeondong> findEummyeondongBySigunguNumber(@PathVariable int sigunguNumber) {
        return eummyeondongService.findEummyeondongBySigunguNumber(sigunguNumber);
    }

}
