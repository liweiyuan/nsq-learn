package nsq.consumer.comppnt;

import com.sproutsocial.nsq.Subscriber;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author liweiyuan
 * @description
 * @date 2019/7/26
 */
@Component
public class NsqConsumer {


    @Bean
    public Subscriber subscriber(){
        return new Subscriber("127.0.0.1:4161");
    }
}
