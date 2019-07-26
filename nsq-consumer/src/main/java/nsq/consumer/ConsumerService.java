package nsq.consumer;

import com.sproutsocial.nsq.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author liweiyuan
 * @description
 * @date 2019/7/26
 */
@Service
public class ConsumerService {


    @Autowired
    private Subscriber subscriber;

    @PostConstruct
    public void consumer(){
        MsgHandler handler=new MsgHandler();
        subscriber.subscribe("test","channel",this::handler);

        subscriber.subscribe("test","nsq_to_file",handler);
    }


    private void handler(byte[] data){
        System.out.println("Received:" + new String(data));
    }
}
