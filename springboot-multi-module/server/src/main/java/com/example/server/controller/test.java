package com.example.server.controller;

import com.example.common.emnus.testemnu;
import com.example.pojo.entity.appusertable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/get")
    public String common(){
        return testemnu.TEST.getValue();
    }
    @GetMapping("/dao")
    public String dao(){
        appusertable appusertable =new appusertable();
        return appusertable.getDao();
    }
}
