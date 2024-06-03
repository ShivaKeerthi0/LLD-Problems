package musicstreamingsystem;

public class Song {
    int songId;
    Genere genere;
    boolean isPlaying;
    Artist writtenBy;
    Artist MusicBy;
    double songDuration;
    String language;

    public Artist getMusicBy() {
        return MusicBy;
    }

    public Artist getWrittenBy() {
        return writtenBy;
    }

    public Genere getGenere() {
        return genere;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void songPlayingStatus(boolean status){
        isPlaying = status;
    }

    public double getSongDuration() {
        return songDuration;
    }

    public String getLanguage() {
        return language;
    }
}
