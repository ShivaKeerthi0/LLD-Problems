package musicstreamingsystem;

public class Admin extends  User{

    StreamingSystem streamingSystemObj;
    public void addSong(Song song){
            streamingSystemObj.addSong(song);
    }

    public void deleteSong(Song song){
        streamingSystemObj.deleteSong(song);
    }

    public void createAlbum(String name){

    }

    public void deleteAlbum(Album album){

    }

    public void addSongTOAlbum(Song song , Album album){

    }
}
