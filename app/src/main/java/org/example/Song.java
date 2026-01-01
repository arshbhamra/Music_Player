package org.example;

import java.io.File;  
// import TestingDir.Song.*;
// passing a song info to Song class
// Song ( name       ,  Artist         , file-type )
// Song ( Backbone , Karan Aujla , mp3       )

public class Song {

    // private String artistName;
    String songName;
    // private String songLength;
    File songFile;
  
    // private String songExtension;

  // try {
   public Song(File songFile, String songName  ){
        // this.artistName = artistName;
        this.songFile = songFile;
        this.songName = songName;
        // this.songLength = songLength;
        // this.songExtension = songExtension;
    }
    //
    // public String getartistName(){
    //     return artistName;
    // }
    public String getsongName(){
        return songName;
    }
  // public Integer getsongLength(){
  //   return songLength;
  // }
  public File getsongFile(){
    return songFile;
  }
    // public String getsongExtension(){
    //     return songExtension;
    // }
    //
    // public void setartistName(String artistName){
    //     this.artistName = artistName;
    // }
    public void setsongName(String songName){
        this.songName = songName;
    } 
  // public void setsongLength(Integer songLength){
  //   this.songLength = songLength;
  //   }
  public void setsongFile(File songFile){
    this.songFile = songFile;
  }
  
  // public void setsongExtension(String songExtension){
    //     this.songExtension = songExtension;
    // }
    //
}
