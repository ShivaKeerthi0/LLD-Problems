package musicstreamingsystem;

import java.util.List;

public class Playlist {
    int playListId;
    Customer customer;
    List<Song> songList;
    String name;
    int songCount;
    int duration;


    Playlist(String name){
        this.name = name;
    }

    public Playlist createPlayList(String name){
        Playlist playlist = new Playlist(name);
        return playlist;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getSongCount() {
        return songCount;
    }

    public List<Song> getSongList() {
        return songList;
    }
}
