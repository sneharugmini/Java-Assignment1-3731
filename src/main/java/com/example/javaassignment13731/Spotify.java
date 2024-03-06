package main.java.com.example.javaassignment13731;

public class Spotify {
    // variables and constants
    private int songId;
    private String trackName;
    private String artist;
    private int year;
    private double streams;

//constructors
    public Spotify(int songId, String trackName, String artist, int year, double streams) {
        setSongId(songId);
        setTrackName(trackName);
        setArtist(artist);
        setYear(year);
        setStreams(streams);
    }

    //method - getter setter

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        if(songId <= 0){
            throw new IllegalArgumentException("Song ID cant be negative");
        } else{
        this.songId = songId;
        }
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        if(trackName.isBlank()){
            throw new IllegalArgumentException("Track name cant be empty");
        } else {
        this.trackName = trackName;
        }
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        if (artist.isBlank()){
            throw new IllegalArgumentException("Artist cant be empty");
        } else {
        this.artist = artist;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 0) {
            throw new IllegalArgumentException("Year cant be negative");
        } else {
        this.year = year;
        }
    }

    public int getStreams() {
        return streams;
    }

    public void setStreams(double streams) {
        if(streams <= 0){
            throw new IllegalArgumentException("Streams cannot be negative");
        } else {
        this.streams = streams;
        }
    }

    // to string

    @Override
    public String toString() {
        return String.format("%d: The streams of %s created by %s on %d + is %f." ,
                songId, trackName, artist, year, streams);
    }
}
