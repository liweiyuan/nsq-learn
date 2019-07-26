package com.nsq.provider.compont;

import com.sproutsocial.nsq.Publisher;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author liweiyuan
 * @description
 * @date 2019/7/26
 */
@Component
public class NsqProvider {


    @Bean
    public Publisher publisher(){
        return new Publisher("127.0.0.1:4150");
    }
}
