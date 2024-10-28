package br.com.spring.security.teste.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class SpringSecurityTesteController {

    @GetMapping("/teste")
    public String teste(){
        return "teste";
    }
}
