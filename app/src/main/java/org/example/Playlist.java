package org.example;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.IOException;


public class Playlist {
    public static void main(String[] args) {
    try {
Scanner scanner = new Scanner(System.in);	
		ArrayList<String> SongPlaylist = new ArrayList<>();

    // File fileee = new File("allsongsnames.txt"); 

    // String fileTOwrite = fileee;


		// String folderpath1 = "C:/Program Files/";
      //
    String filename = "allsongsnames"; 
		String folderpath2 = "/data/data/com.termux/files/home/storage/music/" ;

		File folder = new File(folderpath2);

		
		
		// Stroing file-data and not File(song) itself
		File[] files = folder.listFiles();

    // Here all music files are added to ArrayList
		 for( File f : files){
			String filename= f.getName();
			SongPlaylist.add(filename);
    }    

      // adding a switch staatement to ask whether show data in terminal or in a files

   System.out.println("1 is GTerminal show file");
   System.out.println("2 is show file in txt file");

   int key = scanner.nextInt();
    
    switch (key) {
      case 1:
 // D isplaying SongPlaylist Array
         for ( String names : SongPlaylist ){
             for(int i=1 ; i<SongPlaylist.size(); i++){
                System.out.println("i. "+ names);
     
             }
         }
         break;

     case 2:
          try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename)))){
              for (int i=0; i<SongPlaylist.size(); i++){
                for(String names : SongPlaylist){
                  writer.write(names);
                }
              }
          } catch(IOException e) {
             e.printStackTrace();    
            }
     

     default:
            System.out.println("Default switch output");
             break;
     
   
   }// switch
  
} catch (Exception e) {
    e.printStackTrace();
    }
    }
}

