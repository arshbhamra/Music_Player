// import org.example.DirReader.*;
package org.example; 

import java.util.Scanner;

public class Playlist {

    int currentsongIndex = 0;
    DirReader direaderOBJ;

    Playlist(DirReader dir){
    this.direaderOBJ = dir;

                            





  }

// ArrayList<String> sm = playlistOBJ.funcGetAllFiles();

  public static void main(String[] asd) {
    
    
    DirReader dir = new DirReader();
    Playlist playlistOBJ = new Playlist(dir);
 //    ArrayList<String> allSongsList = playlistOBJ.getSongPlaylist(); 
 //    int i = 1;
    playlistOBJ.Controller();
    // direaderOBJ.showAll(); 
 // for(String names : allSongsList){
 //      System.out.println(i + names);
 //      i++;
 //    }
  }






void createPlaylist(){
    System.out.println();
  }










  void Controller(){
    try{
    Scanner scanner = new Scanner(System.in);
    System.out.println("1showAll 2Start 3prevSong 4nextSong");
    // int key = scanner.nextInt();
      int key = 1;

switch (key) {
      case 1:
         direaderOBJ.showAll();
         break;
      case 2:
         // Start();
         break;
      case 3:
         // prevSong();
         break;
      case 4:
         // nextSong();
         break; 
      default:
         System.out.println("***************Default");
         break;
    }
  }catch(Exception e){
    e.printStackTrace();
  }
  }


  //
  // public String prevSong(){
  //   System.out.println("Previous Song ");
  //
  // if(currentsongIndex <= 0){
  //       System.out.println("Cannot goto previous Song");
  // }else{
  //     String returnValue = allSongsList.get(currentsongIndex);
  //     return returnValue;
  // }
  //     return "Else statemnt returned ";
  // }



  //
  // public String nextSong(Song song){
  //   System.out.println("Next Song");
  //
  //   currentsongIndex++ ;
  //    String returnValue = direaderOBJ.SongPlaylist.get(currentsongIndex) ;
  //   return returnValue;
  // }
  
}
