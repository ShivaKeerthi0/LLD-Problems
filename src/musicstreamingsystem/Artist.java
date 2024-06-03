package musicstreamingsystem;

import java.util.List;

public class Artist extends User{
    List<Song> songsComposed;
    List<Song> songsWritten;

    public List<Song> getSongsComposed() {
        return songsComposed;
    }

    public List<Song> getSongsWritten() {
        return songsWritten;
    }

    public void uploadSong(Song song){

    }
}
