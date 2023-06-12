package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calc{

    @GetMapping("/sum")
    public double sum (@RequestParam String a, @RequestParam String b){
        return Double.parseDouble(a) + Double.parseDouble(b);
    }

    @GetMapping("/sub")
    public double sub (@RequestParam String a, @RequestParam String b){
        return Double.parseDouble(a) - Double.parseDouble(b);
    }

    @GetMapping("/mul")
    public double mul (@RequestParam String a, @RequestParam String b){
        return Double.parseDouble(a) * Double.parseDouble(b);
    }

    @GetMapping("/div")
    public double div (@RequestParam String a, @RequestParam String b){
        return Double.parseDouble(a) / Double.parseDouble(b);
    }
}