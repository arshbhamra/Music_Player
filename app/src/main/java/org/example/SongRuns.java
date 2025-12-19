//NullPointerException is the error
//accessing a obj which has zero value
//the resouce is not getting the Song File
package org.example;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import javax.sound.sampled.*;

// import javax.sound.sampled.AudioInputStream;
// import javax.sound.sampled.AudioSystem;
// import javax.sound.sampled.UnsupportedAudioFileException;

public class SongRuns {

  // static void UserInput() {
  //   Scanner scan = new Scanner(System.in);
  //   System.out.println("enter value: ");
  //   String value = scan.next();
//
  //   switch (value) {
  //     case "a":
  //       System.out.println("this is a A ");
  //       break;
  //     default:
  //       System.out.println("defauilt");
//
  //       break;
  //   }
  // }

  public static void main(String[] args) {
    try {
      // UserInput();

      // String filepath = "audio.wav";
      // File file = new File("~/New/app/src/main/java/org/example/w.wav");
      InputStream file = SongRuns.class.getResourceAsStream("resources\\audio.wav");

      // InputStream file = SongRuns.class.getResourceAsStream("resources//audio.wav");


      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();

      System.out.println("song is playing. (5sec)");
      Thread.sleep(500);
      clip.stop();

    }catch(NullPointerException e){
      e.printStackTrace();
    } catch (UnsupportedAudioFileException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (LineUnavailableException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
