package com.example.demo;

import com.example.demo.repository.MybatisRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private MybatisRepository mybatisRepository;

    public MainController(MybatisRepository mybatisRepository) {
        this.mybatisRepository = mybatisRepository;
    }

    @GetMapping("/abst")
    public String index() throws Exception {
        List<BoardMybatis> all = mybatisRepository.findAll();
        for (BoardMybatis a : all) {
            System.out.println(a.getId() + ", "+ a.getName());
        }
        return "hello";
    }
}
