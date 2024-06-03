package musicstreamingsystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Search {

    List<Song> songs;
    List<Album> albumList;
    Map<Artist, List<Song>> artistSongMap;

    public List<Song> getSongs() {
        return songs;
    }

    public Song getSong(Song song){
        return  null;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public Map<Artist, List<Song>> getArtistSongMap() {
        return artistSongMap;
    }
    public Album getAlbum(Album album){
        return  null;
    }

    public List<Song> getSongsByArtistName(Artist artist){
        return  artistSongMap.get(artist);
    }
}
