// import org.example.DirReader.*;
package org.example; 

import java.util.ArrayList;

public class Playlist extends DirReader{

    int currentsongIndex = 0;


// ArrayList<String> sm = playlistOBJ.funcGetAllFiles();

  public static void main(String[] asd) {

    

    Playlist playlistOBJ = new Playlist();
 //    ArrayList<String> allSongsList = playlistOBJ.getSongPlaylist(); 
 //    int i = 1;
 // for(String names : allSongsList){
 //      System.out.println(i + names);
 //      i++;
 //    }

    playlistOBJ.load();
  }


  public void load() {

    ArrayList<String> allSongsList = playlistOBJ.getSongPlaylist(); 
    
    int i = 0;
    for(String names : allSongsList){
      System.out.println(i + names);
      i++;
    }
System.out.println();
    System.out.println("song at 0 is: "+allSongsList.get(0));
    System.out.println();
    System.out.println("Playlist Program is Running");

    
  }



  public String prevSong(){
    System.out.println("Previous Song ");

  if(currentsongIndex <= 0){

        System.out.println("We cannot go back to previous Song");
    }else{

    String returnValue = allSongsList.get(currentsongIndex);
    return returnValue;
  }
    return "Else statemnt returned ";
  }




  public String nextSong(Song song){
    System.out.println("Next Song");

    currentsongIndex++ ;
     String returnValue = allSongsList.get(currentsongIndex) ;
    return returnValue;
  }
  
}
