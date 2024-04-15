package com.example.demo.controller;

import com.example.demo.service.RiService;
import com.example.demo.vo.Ri;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class RiController {

    private final RiService riService;

    @RequestMapping("/ri")
    @ResponseBody
    public List<Ri> findRi() {
        return riService.findRi();
    }

    @GetMapping("/ri/{eummyeondongNumber}")
    @ResponseBody
    public List<Ri> findRiByEummyeondongNumber(@PathVariable int eummyeondongNumber) {
        return riService.findRiByEummyeondongNumber(eummyeondongNumber);
    }
}
