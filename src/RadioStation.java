
package internetradio;

import static java.lang.Math.*;
/**
 *
 * @author Γρηγόρης
 */
public class RadioStation {
    private Song[] songs;

    public RadioStation() {
    }

    public RadioStation(Song[] songs) {
        this.songs = songs;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }
 
    // this method must return a table with radiostation's songs, order by their distance with given song.
    // first will be given song, second will be song with minimun distance etc..
    // if given song can't be found, error message will be shown and method will return null.
    // distance will be calculated by calling internal protected method "distance"
    public Song[] getSimilar(String songTitle) {
        
        String title_of_givensong = songTitle;                  //given song 
        boolean found = false;                                  //boolean to check if given song exists
        Song given_song = new Song();                           //object of type song, that has elements same with given song
        
        //check if given song exists in array of songs. if exists set elements of object song same as existing song
        for (Song song : songs) {                              
            if (title_of_givensong.equals(song.getTitle())) {
                given_song.setTitle(song.getTitle());
                given_song.setArtist(song.getArtist());
                given_song.setWeights(song.getWeights());
                found =true;                                     //if song exists boolean turns into true
            } 
        }
        
        //printing song list before sorting
        System.out.println("---------- Initial form of songs -----------------");
        for (Song song: songs)
           System.out.println("Title: " + song.getTitle() + " - " + "Artist: " + song.getArtist());
        System.out.println("--------------------------------------------------"+"\n");
         
        //if song doesn't exists, message will be shown, else create new song array
        if (found == false){                                    
            System.out.println("Δεν υπάρχει το συγκεκριμένο τραγούδι");
            return null;
        }
        else{ 
            double[] similarity ;           //create table similarity with elements distances of every song with given song
            similarity = new double[15];    //similarity table size
            int m=0;                        //counter to set values into similarity table
            //calculate distance of every song relative with given song and save value into similarity table in order to sort songs   
            for (Song song : songs) {                            
                double distance_of_songs = distance(given_song, song);
                similarity[m] = distance_of_songs;
                m++;   
            }
         
        //sorting songs depending on similarity table
        boolean swapped = true;
        int j = 0;                                          
        Song tmp;                                           
        double tmp1;                                        
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < songs.length - j; i++) {
                if (similarity[i] > similarity[i+1]){
                    tmp = songs[i];
                    songs[i] = songs[i + 1];
                    songs[i + 1] = tmp;
                    tmp1 = similarity[i];
                    similarity[i] = similarity[i + 1];
                    similarity[i + 1] = tmp1;
                    swapped = true;
                }
            }
        } 
       
        //printing sorted playlist       
         System.out.println("---------- Sorted form of songs -----------------");
        for (Song song: songs)
            System.out.println("Title: " + song.getTitle() + " - " + "Artist: " + song.getArtist());
         System.out.println("--------------------------------------------------"+"\n"+"\n");
          
         return songs;   
        }   
    }

    // returns distance of 2 songs, according to Eukleidia distance of their genres 
    protected double distance(Song s1, Song s2) {
        
        double[] song1 = s1.getWeights();                       //table to insert first's song weights
        double[] song2 = s2.getWeights();                       //table to insert second's song weights
        double sum=0;                                           //sum of 2 song's weights
        double difference;                                      
        for(int i=0; i<6; i++){                                 //finding sum of difference of weights
            difference = song1[i] - song2[i];
            difference = pow(difference, 2);
            sum += difference;
        }
        double eukleidia_apostasi = (double) sqrt(sum);         //find Eukleidia distance
        
        return eukleidia_apostasi;                              
    }
    
}
