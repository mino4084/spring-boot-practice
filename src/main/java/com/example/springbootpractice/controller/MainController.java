package com.example.springbootpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootpractice.service.SortService;

import java.util.List;

@RestController
//@Controller
public class MainController {

    private final SortService sortService;

    public MainController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")
    public String hello(@RequestParam List<String> list){

        return sortService.doSort(list).toString();
    }
}
