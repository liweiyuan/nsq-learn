package nsq.consumer;

import com.sproutsocial.nsq.MessageDataHandler;

/**
 * @author liweiyuan
 * @description
 * @date 2019/7/26
 */
public class MsgHandler implements MessageDataHandler {
    @Override
    public void accept(byte[] bytes) {
        System.err.println(new String(bytes));
    }
}
