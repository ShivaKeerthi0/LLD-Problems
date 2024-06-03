package musicstreamingsystem;

import java.util.List;
//singleton class
public class StreamingSystem {
    RecommendationSystem recommendationSystemObj;
    AuthenticationSystem authenticationSystemObj;
    List<Song> songsList;
    List<Artist>artistList;
    Search searchObj;
    Playlist playlist;

    public void addSong(Song song){

    }

    public void deleteSong(Song song){

    }

    public void createPlayList(Customer customer, String name){
        playlist = playlist.createPlayList(name);
        customer.playlistList.add(playlist);
    }

    public void deletePlayList(Customer customer, Playlist playlist){

    }

    public void login(User customer){
        authenticationSystemObj.login(customer);
    }

    public void logout(User user){
         authenticationSystemObj.logout(user);
    }

    public void recommendSong(Customer customer){
        recommendationSystemObj.recommendSong(customer);
    }
}
