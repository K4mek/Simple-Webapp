package com.example.simple.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class ParamController {

    private Param param;

    {  param = new Param("Word"); }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Home(@RequestParam(value = "name", defaultValue = "Word") String name) {
        param.setName(name);
        String html = String.format("Hello %s", param.getName());
        return "<h1 style='color: green; margin-top: 50px; text-align: center;'>"+html+"</h1>";
    }
}
