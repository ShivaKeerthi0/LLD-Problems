package musicstreamingsystem;

import java.util.List;

public class Customer {
    Search searchObj;
    List<Playlist> playlistList;
    List<Song> favs;
    StreamingSystem StreamingSystemObj;
    MusicPlayerSystem musicPlayerSystemObj;

    public List<Playlist> getPlaylistList() {
        return playlistList;
    }

    public List<Song> getFavs() {
        return favs;
    }

    public void addSongToFavs(Song song){

    }

    public void removeSongFromFavs(Song song){

    }

    public void createPlayList(String name){
        StreamingSystemObj.createPlayList(this, name);
    }

    public void deletePlayList(Playlist playlist){
        StreamingSystemObj.deletePlayList(this, playlist);
    }

    public void addSongToPlayList(Playlist playlist, Song song){

    }

    public void playSong(Song song){
        musicPlayerSystemObj.playSong(song);
    }

    public void pauseSong(Song song){
        musicPlayerSystemObj.pauseSong(song);
    }

    public void getRecommendation(){
        StreamingSystemObj.recommendSong(this);
    }
}
