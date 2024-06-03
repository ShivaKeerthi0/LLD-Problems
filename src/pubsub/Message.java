package pubsub;

public class Message {
    private String content;
    private String topic;

    Message(String content, String topic){
        this.content = content;
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
