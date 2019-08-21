package com.example.blog.controller;

import com.example.blog.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class BlogController {
    @RequestMapping(value="/sayHello",method= RequestMethod.GET)
    public String sayHello() {
        return "Hello, shinwoo.";
    }

    @RequestMapping(value="/getInfo",method= RequestMethod.GET)
    public Member getInfo() {
        Member member = new Member(1,"shinwoo","wjdtlsdn0907@naver.com");

        return member;
    }

    @RequestMapping(value="/list",method= RequestMethod.GET)
    public List<Member> list() {
        List<Member> memberList = Arrays.asList(
                new Member[]{new Member(1, "shinwoo1", "1wjdtlsdn0907@naver.com"),
                        new Member(2, "shinwoo2", "2wjdtlsdn0907@naver.com"),
                        new Member(3, "shinwoo3", "3wjdtlsdn0907@naver.com"),
                        new Member(4, "shinwoo4", "4wjdtlsdn0907@naver.com"),
                        new Member(5, "shinwoo5", "5wjdtlsdn0907@naver.com")}
        );

    }
}
