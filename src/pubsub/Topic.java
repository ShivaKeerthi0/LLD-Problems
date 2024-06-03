package pubsub;


// group of similar kind
public class Topic {
    private  String name;

    Topic(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
