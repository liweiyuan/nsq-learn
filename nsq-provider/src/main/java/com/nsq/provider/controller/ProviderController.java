package com.nsq.provider.controller;

import com.nsq.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liweiyuan
 * @description
 * @date 2019/7/26
 */
@RestController
public class ProviderController {


    @Autowired
    private ProviderService providerService;


    @GetMapping("/send")
    public void send(){
        providerService.send();
    }
}
