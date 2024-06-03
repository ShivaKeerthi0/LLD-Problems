package cachestorage;

public class Main {

    public static void main(String args[]){

        Storage cacheObject = new CacheFactory().getCacheObject("LRU",3);

        cacheObject.put(1,1);
        cacheObject.put(2,2);
        cacheObject.put(3,3);
        cacheObject.get(2);
        cacheObject.put(4,4);
        cacheObject.get(2);

        cacheObject.print();

    }
}


