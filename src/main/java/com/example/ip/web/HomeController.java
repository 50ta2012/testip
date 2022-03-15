package com.example.ip.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  
  @GetMapping("/")
  public String homePage(HttpServletRequest request){
    
    return request.getRemoteAddr() + " " + request.getRemotePort();
  }
}
