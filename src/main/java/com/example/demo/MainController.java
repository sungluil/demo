package com.example.demo;

import com.example.demo.repository.MybatisRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private MybatisRepository mybatisRepository;

    public MainController(MybatisRepository mybatisRepository) {
        this.mybatisRepository = mybatisRepository;
    }

    @GetMapping("/index")
    public void index() throws Exception {
        mybatisRepository.findAll();
    }
}
