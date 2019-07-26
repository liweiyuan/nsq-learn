package nsq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NsqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NsqConsumerApplication.class, args);
    }

}
