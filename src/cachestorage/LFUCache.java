package cachestorage;

public class LFUCache extends Storage{
    public void put(int key, int value){
        System.out.println("added!!!");
    }

    public int get(int key){
        return 1;
    }

    @Override
    public void eject(Node node) {
        System.out.println("ejected!!!");
    }

    @Override
    public void print() {
        System.out.println("Printed!!!");
    }
}



