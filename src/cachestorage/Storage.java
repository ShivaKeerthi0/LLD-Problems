package cachestorage;

import java.util.HashMap;

public abstract class Storage {

    int capacity = 0;
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    HashMap<Integer, Node> hm = new HashMap();
    public abstract void put(int key, int value);

    public abstract int get(int key);

    public abstract void eject(Node node);

    public abstract void print();
}
