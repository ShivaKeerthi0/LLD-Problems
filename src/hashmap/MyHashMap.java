package hashmap;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K,V>{

    private List<Node<K,V>> bucket;
    private int capacity;
    private final  int INITIAL_CAPACITY = 5;
    private int size =0;

    MyHashMap(){
        this.capacity = INITIAL_CAPACITY;
        bucket = new ArrayList<>();
        // the below code is added because when we generate a hashCode randomly , we need that index to be present, initially there will be no indices in arraylist.
        for(int i =0;i <capacity; i++){
            bucket.add(null);
        }
    }

    public void put(K key, V val){
        int index = getIndexByHashFunction(key);
        Node<K,V> node = bucket.get(index);

        while(node!=null){
            if(node.key.equals(key)){
                node.val = val;
                return;
            }
            node = node.next;
        }

        size ++;

        Node<K,V> newnode= new Node(key,val);
        node = bucket.get(index); // as we iterated above, we need to fetch the node again
        newnode.next = node;
        bucket.set(index,newnode);

        // We will find the loadfactor and rehash to decrease the time complexity of insert and fetch

        double loadFactor = (1.0 * size)/capacity;

        System.out.println("LoadFactor after insertion is:" + loadFactor);

        if(loadFactor > 0.7){
            rehash();
            System.out.println("LoadFactor after rehash is :" + (1.0 * size)/capacity);
        }


    }

    public V get(K key){

        int index = getIndexByHashFunction(key);
        Node<K,V> node = bucket.get(index);
        while(node!=null){
            if(node.key.equals(key)){
                return node.val;
            }

            node =node.next;
        }
        return  null;
    }


    public void remove(K key){
        int index = getIndexByHashFunction(key);
        Node<K,V> node = bucket.get(index);
        Node<K,V> prev = null;

        while(node!=null){

            if(node.key.equals(key)) {
                if(prev == null){
                    bucket.set(index, node.next);
                } else {
                    prev.next = node.next;
                    node.next =null;
                    bucket.set(index, prev);
                }
                size--;
                break;
            }
            prev = node;
            node =node.next;
        }

    }

    private  void rehash(){

        System.out.println("Rehashing the elements");
        capacity = 2* capacity;
        System.out.println("Capacity is :"+capacity);
        List<Node<K,V>> temp = bucket;
        bucket = new ArrayList();

        for(int i = 0 ; i<capacity ;i++){
            bucket.add(null);
        }
        size = 0;

        for(int i =0;i < temp.size() ; i++){
            Node<K,V> node = temp.get(i);
            while(node!=null){
                put(node.key, node.val);
                node = node.next;
            }
        }

    }


    // returns the index to be stored / to be fetched by hasing ans compressing the key
    private int getIndexByHashFunction(K key){
        // we defaultly use the object class hashCode function provided by Java

        int hash = key.hashCode();
        return hashCode() % capacity; // compression function

    }

    private class Node<K,V>{

        K key;
        V val;
        Node<K,V> next;
        Node(K key, V val){
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }
}
