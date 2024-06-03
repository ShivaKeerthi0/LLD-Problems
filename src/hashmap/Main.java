package hashmap;

public class Main {

    public static  void  main(String args[]){

        MyHashMap<Integer,Integer> hm = new MyHashMap<>();

        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,3);
        hm.put(4,4);
        hm.put(5,5);
        hm.remove(5);
       System.out.println( hm.get(4));
        System.out.println( hm.get(3));
        System.out.println( hm.get(2));
        System.out.println( hm.get(1));







    }
}
