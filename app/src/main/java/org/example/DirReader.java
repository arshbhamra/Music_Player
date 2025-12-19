package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;


public class DirReader{

  Scanner scanner = new Scanner(System.in);	
  ArrayList<String> SongPlaylist = new ArrayList<>();

  public String funcGetFilename(int fileIndex){
     return SongPlaylist.get(fileIndex);
  }

  public Arraylist funcGetAllFiles(){
    return SongPlaylist;
  }



  public static void funcSetData(){

		String storageMusic = "/data/data/com.termux/files/home/storage/music/" ;
      String musicFolder = "/data/data/com.termux/files/home/Music/wav-files/wavs/";

		File folder = new File(musicFolder);

		File[] files = folder.listFiles();

		 for( File f : files){
			String filename= f.getName();
			SongPlaylist.add(filename);
    }    
       

    System.out.println();
    System.out.println("*********************");
    System.out.println();
    System.out.println("Data has been added from dir "+musicFolder);
    System.out.println("song 0 is: "+SongPlaylist.get(0));
    System.out.println("song 1 is: "+SongPlaylist.get(1));
    System.out.println(); 
  }
//
//
//
//
//
//   public static void funcSwitch(Scanner scanner, ArrayList<String> SongPlaylist){
//
//     String filenameforall = "allsongsnames.txt"; 
//
//    System.out.println("1 is GTerminal show file");
//    System.out.println("2 is show file in txt file");
//    System.out.println();
//    System.out.println("Enter your choice: ");
//
//
//    int key = scanner.nextInt();
//    int i = 1; 
//       System.out.println();
//       System.out.println();
//
//     switch (key) {
//       case 1:
//
//       if(SongPlaylist.isEmpty()){
//         System.out.println("SongPlaylist list was emppty, so some DummyData has been added. ");
//         SongPlaylist.add("A");
//         SongPlaylist.add("B");
//         SongPlaylist.add("C");
//         SongPlaylist.add("D");
//       }
//       else{
//         System.out.println("************** SongPlaylist has data");
//         for ( String name : SongPlaylist ){
//                 // System.out.println();
//                 System.out.println(i+ " " + name);
//                 i++ ;
//              }
//
//       }
//          break;
//
//
//
//
//      case 2:
//           try (BufferedWriter writer = new BufferedWriter(new FileWriter(filenameforall))){
//
//       if(SongPlaylist.isEmpty()){
//         System.out.println("SongPlaylist list was emppty, so some DummyData has been added. ");
//         SongPlaylist.add("A");
//         SongPlaylist.add("B");
//         SongPlaylist.add("C");
//         SongPlaylist.add("D");
//       }
//       else{
//               System.out.println("Data is going to enter in Allsongsfile txt ");
//           // for (int i=1; i<SongPlaylist.size(); i++){
//                 for(String name : SongPlaylist){
//
//                   writer.write(i+ " " +name);
//                   writer.newLine();
//             i++;
//                 }
//               }
//           } catch(IOException e) {
//              e.printStackTrace();    
//             }
//
//
//      default:
//             System.out.println("Default switch output");
//              break;
//     }
//
//   }
    //
    // public static void main(String[] args) {
    //   try {
    //   int fileIndex = 0;
    //
    //     // funcSetData(SongPlaylist);
    //     // funcSwitch(scanner, SongPlaylist);
    //
    //   } catch (Exception e) {
    //       e.printStackTrace();
    //   }
    // }  // Main Function

}  // Class 

