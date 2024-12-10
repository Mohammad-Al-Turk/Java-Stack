package task6.map.of.the.hashmatique;

import java.util.HashMap;
import java.util.Scanner;

public class TrackListDemo {

	public static void main(String[] args) {
		
	 HashMap<String, String> trackList = new HashMap<String,String>();
	 trackList.put("Sunrise", "The sun rises over the hills...");
     trackList.put("Ocean Breeze", "Feel the breeze from the ocean shore...");
     trackList.put("Jowa Beiti", "Under the midnight stars, we dream...");
     trackList.put("Batmna Ansak", "بتمنى أنساك");
     
     
     System.out.println("All Tracks:\n");

     for (String track : trackList.keySet()) {
         System.out.println("Track: " + track);
         System.out.println("Lyrics: " + trackList.get(track));
     }
     
     
     
     System.out.println("-------------------------------------------------------------------:");
     System.out.println("Enter the Track to show Lyrics:");
	    Scanner scanner = new Scanner(System.in); 
	    String Track = scanner.nextLine(); 
	    
	    System.out.println("\nThe Lyrics:\n"+trackList.get(Track));
	}

}
