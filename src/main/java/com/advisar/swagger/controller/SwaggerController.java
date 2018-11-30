package com.advisar.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class SwaggerController {
    //TODO: Fix this thing for usability
    @GetMapping(path = "/swagger")
    public String redirectToSwagger() {
        return "redirect:http:/localhost:8765/swagger-ui.html";
    }
}