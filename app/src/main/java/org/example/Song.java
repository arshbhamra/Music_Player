package org.example;

// passing a song info to Song class
// Song ( name       ,  Artist         , file-type )
// Song ( Backbone , Karan Aujla , mp3       )

public class Song {

    private String artistName;
    private String songName;
    private String songExtension;

  // try {
   public Song(String artistName, String songName, String songExtension ){
        this.artistName = artistName;
        this.songName = songName;
        this.songExtension = songExtension;
    }

    public String getartistName(){
        return artistName;
    }
    public String getsongName(){
        return songName;
    }
    public String getsongExtension(){
        return songExtension;
    }

    public void setartistName(String artistName){
        this.artistName = artistName;
    }
    public void setsongName(String songName){
        this.songName = songName;
    } 
    public void setsongExtension(String songExtension){
        this.songExtension = songExtension;
    }
    
}
