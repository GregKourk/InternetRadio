
package internetradio;

import static java.lang.Math.*;
/**
 *
 * @author Γρηγόρης
 */
public class ManhattanRadioStation extends RadioStation {

    public ManhattanRadioStation() {
    }

    public ManhattanRadioStation(Song[] songs) {
        super(songs);
    }
    
    @Override
    public double distance(Song s1, Song s2){
        //returns Manhattan distance of 2 songs
        
        double[] song1 = s1.getWeights();                       //table to insert first's song weights
        double[] song2 = s2.getWeights();                       //table to insert second's song weights
        double Manhattan_distance=0;                            //sum of 2 song's weights
        double difference;                                      
        for(int i=0; i<6; i++){                                 //finding sum of abs of difference of weights
            difference = abs(song1[i] - song2[i]);
            Manhattan_distance += difference;
        }
         return Manhattan_distance;                             
    }
    
}
