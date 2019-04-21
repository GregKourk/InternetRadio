
package internetradio;

/**
 *
 * @author Γρηγόρης
 */
public class InternetRadio {
    public static void main(String[] args) {
        
        //tables with songs's weights
        //songs creation
        double[] weighs1 = {90,10,0,0,0,0};                                    
        Song S1 = new Song("Wonderwall", "Oasis", weighs1);                    
        
        double[] weighs2 = {80,10,10,0,0,0};                                    
        Song S2 = new Song("Don't look back in anger", "Oasis", weighs2);       
        
        double[] weighs3 = {50,20,10,0,20,0};                                 
        Song S3 = new Song("Money", "Pink Floyd", weighs3);                    
        
        double[] weighs4 = {30,10,30,30,0,0};                                   
        Song S4 = new Song("Catholic girls", "Frank Zappa", weighs4);           
        
        double[] weighs5 = {80,0,20,0,0,0};                                    
        Song S5 = new Song("Stairway to heaven", "Led Zeppelin", weighs5);      
        
        double[] weighs6 = {100,0,0,0,0,0};                                     
        Song S6 = new Song("Perfect strangers", "Deep Purple", weighs6);       
        
        double[] weighs7 = {10,80,10,0,0,0};                                    
        Song S7 = new Song("Purple rain", "Prince", weighs7);                   
        
        double[] weighs8 = {100,0,0,0,0,0};                                     
        Song S8 = new Song("Back in black", "AC DC", weighs8);                  
        
        double[] weighs9 = {0,0,100,0,0,0};                                     
        Song S9 = new Song("The thrill is gone", "BB King", weighs9);           
        
        double[] weighs10 = {0,0,60,40,0,0};                                    
        Song S10 = new Song("I'd rather go blind", "Etta James", weighs10);     
        
        double[] weighs11 = {40,20,40,0,0,0};                                   
        Song S11 = new Song("With or without you", "U2", weighs11);             
        
        double[] weighs12 = {40,10,30,10,10,0};                                     
        Song S12 = new Song("Heroes", "David Bowie", weighs12);                 
        
        double[] weighs13 = {90,0,10,0,0,0};                                    
        Song S13 = new Song("Free bird", "Lynyrd Skynyrd", weighs13);           
        
        double[] weighs14 = {50,30,20,0,0,0};                                   
        Song S14 = new Song("Always", "Bon Jovi",weighs14);                     
        
        double[] weighs15 = {40,60,0,0,0,0};                                    
        Song S15 = new Song("Happy when it rains", "The Jesus and Mary Chain", weighs15);       
        
        Song[] songsadded = {S1,S2,S3,S4,S5,S6,S7,S8,S9,S10,S11,S12,S13,S14,S15};   //table with songs created
        
        RadioStation radiostation1 = new RadioStation(songsadded);                  //create InternetRadio station that includes all songs                  
        System.out.println("RadioStation playlist");
        radiostation1.getSimilar("Heroes");                                         //create song playlist according to Eukleidia distance
    

        
        
        Song[] songsadded1 = {S1,S2,S3,S4,S5,S6,S7,S8,S9,S10,S11,S12,S13,S14,S15};   //table with songs created
        ManhattanRadioStation manhattanradiostation1 = new ManhattanRadioStation(songsadded1);   //create ManhattanRadio station that includes all songs
        System.out.println("Manhattan RadioStation playlist");
        manhattanradiostation1.getSimilar("Heroes");                                //create song playlist according to Manhattan distance

        
        
        
    }
    
}
