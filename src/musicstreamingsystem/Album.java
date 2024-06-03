package musicstreamingsystem;

import java.util.List;

public class Album {
    List<Song> songs;
    AlbumType type;
    List<Artist> artists;
    int songCount;
    int albumDuration;
    String albumName;

    public AlbumType getType() {
        return type;
    }

    public int getAlbumDuration() {
        return albumDuration;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void addSongToAlbum(Song song){

    }

    public void removeSongFromAlbum(Song song){

    }


}
