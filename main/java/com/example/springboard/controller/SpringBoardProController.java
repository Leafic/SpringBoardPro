package com.example.springboard.controller;

import com.example.springboard.service.SpringBoardProService;
import com.example.springboard.vo.SpringBoardProVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBoardProController {

    @Autowired
    SpringBoardProService springBoardProService;



    @GetMapping("/board/list")
    public SpringBoardProVO selectBoardID(@RequestParam("id") String id) {
        System.out.println(id);
        SpringBoardProVO springBoard = springBoardProService.selectBoardID(id);

        return springBoard;
    }

    @GetMapping("/get/hello")
    public String GetMappingTest (@RequestParam int id) {

        return "Get Mapping : " + id;
    }

}
