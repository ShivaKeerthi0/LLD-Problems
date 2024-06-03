package cachestorage;

import java.util.HashMap;

public class LRUCache extends   Storage{



    LRUCache(int cap){
        capacity = cap;
        head.next = tail;
        tail.prev = head;
    }

    public void  put(int key, int value){

        if(hm.containsKey(key)) {
            Node node = hm.get(key);
            eject(node);
            insert(new Node(key,value));
        } else{
            if(hm.size() == capacity) {
                hm.remove(tail.prev.key);
                eject(tail.prev);
            }
                insert(new Node(key,value));
        }

    }
    public int get(int key){
       if(!hm.containsKey(key)) return  -1;
        Node node = hm.get(key);
        eject(node);
        insert(node);
       return hm.get(key).val;
    }
    public void eject(Node node){
        hm.remove(node.key);
        node.prev.next =  node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node newnode){
        newnode.prev = head;
        newnode.next = head.next;
        head.next = newnode;
        newnode.next.prev = newnode;
        hm.put(newnode.key, newnode);
    }

    public void  print(){
        Node temp = head.next;
        while(temp != tail){
            System.out.println("Key is :" + temp.key + " Value is :" + temp.val);
            temp = temp.next;
        }
    }
}
