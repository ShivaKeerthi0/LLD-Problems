package pubsub;

public class SendEmailSubscriber implements  Subscriber{

    @Override
    public void receive(Message msg) {
        System.out.println("Sending email with the received message : "+msg.getContent());
    }
}
