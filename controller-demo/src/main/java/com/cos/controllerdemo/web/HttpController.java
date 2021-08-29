package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller//File을 응답하는 컨트롤러("클라이언트가 브라우저면 .html파일)
@RestController//Data를 응답하는 컨트롤러("클라이언트가 핸드폰이면 data)
public class HttpController {

    //http://localhost:8080/get
    @GetMapping("/get")
    public String get(){
        return "get 요청됨";
    }

    //http://localhost:8080/post
    @PostMapping("/post")
    public String post(){
        return "post 요청됨";
    }

    //http://localhost:8080/put
    @PutMapping("/put")
    public String put(){
        return "put 요청됨";
    }

    //http://localhost:8080/delete
    @DeleteMapping("/delete")
    public String delete(){
        return "delete 요청됨";
    }
}
