package cachestorage;

public class CacheFactory {

    public Storage getCacheObject(String param, int capacity){

        if(param.equals("LRU")){
            return new LRUCache(capacity);
        }
        return  new LFUCache();
    }
}
