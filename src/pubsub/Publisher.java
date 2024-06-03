package pubsub;

import java.util.LinkedList;
import java.util.Queue;

public class Publisher {
    private Queue<Message> msgqueue = new LinkedList<>();

    public void publish(Message msg){
        msgqueue.add(msg);
    }
}
