/**
 * A class to model a digital music track.
 * 
 * @author ian.frame
 */
public class Track {
    
    private String title;
    private String artist;
    
    public Track(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public String getName(){
        return title;
    }
    
    @Override
    public String toString(){
        return "Title: " + this.title + "\nArtist: " + this.artist;
    }
}
