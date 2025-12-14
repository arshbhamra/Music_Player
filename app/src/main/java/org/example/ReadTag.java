package org.example;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.FieldKey;
import java.io.File;

public class ReadTag {
    public static void main(String[] args) {
        try {
            // File file = new File("C:\\hi.mp3");
      
        File file = new File("/data/data/com.termux/files/home/storage/music/skyfall.mp3");
            // File file = new File("mm.wav");
        AudioFile audioFile = AudioFileIO.read(file);

        Tag tag = audioFile.getTag();

        AudioHeader audioheader = audioFile.getAudioHeader();

        String title = tag.getFirst(FieldKey.TITLE);
        String bitrate = audioheader.getBitRate();

      System.out.println("****************************");
      System.out.println("title: "+title);
      System.out.println("bitrate: "+bitrate);
    
    // } catch(CannotReadException e){
            // e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
