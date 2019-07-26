package com.nsq.provider.service;

import com.sproutsocial.nsq.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liweiyuan
 * @description
 * @date 2019/7/26
 */
@Service
public class ProviderService {


    @Autowired
    private Publisher publisher;


    public void send(){
        byte[] data = "Hello nsq".getBytes();
        publisher.publishBuffered("test", data);
    }
}
