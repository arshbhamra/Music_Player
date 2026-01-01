package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

  int currentsongIndex = 0;
  Dir direaderOBJ;

  Playlist(Dir dir) { this.direaderOBJ = dir; }
  ArrayList<Song> SongsinPlaylist;

  public static void main(String[] asd) {

    Dir dir = new Dir();
    Playlist playlistOBJ = new Playlist(dir);
   playlistOBJ.Controller();
  }


  void showSongs() {
    int i = 1;
    System.out.println("All current songs are showing: ");
    System.out.println();

    SongsinPlaylist = new ArrayList<Song>();
    SongsinPlaylist = direaderOBJ.getSongList();

    for (Song var : SongsinPlaylist) {
      System.out.println(i + " " + var);
    }
  }


  void Controller() {
    try {
      // Scanner scanner = new Scanner(System.in);
      System.out.println("\n\n1showAll \n 2Start\n 3prevSong \n4nextSong\n");
      // int key = scanner.nextInt();
      int key = 1;

      switch (key) {
      case 1:
        showSongs();
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
    } catch (Exception e) {
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
