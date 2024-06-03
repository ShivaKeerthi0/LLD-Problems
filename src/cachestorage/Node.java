package cachestorage;

public class Node {

    int key,  val;
    Node next, prev;
    Node(int key, int val){
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev =null;
    }
}
