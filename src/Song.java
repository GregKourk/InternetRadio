package internetradio;
/**
 *
 * @author Γρηγόρης
 */
public class Song {
    private String title;              // song's title
    private String artist;             // song's artist

    // possible music genres of songs
    public static final String[] GENRES = {
        "rock", "pop", "blues", "soul", "disco", "hip-hop"
    };

    // gravity of genres in every song can be from 0 to 100
    // sum of all gravities is 100
    private double[] weights; 
    
    // default constructor
    public Song() {
    }

    // constructor
    public Song(String title, String artist, double[] weights) {
        this.title = title;
        this.artist = artist;
        this.weights = weights;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double[] getWeights() {
        return weights;
    }
    public void setWeights(double[] weights) {
        this.weights = weights;
    }  
}
