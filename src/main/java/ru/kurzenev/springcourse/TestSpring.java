package ru.kurzenev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
          MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
          musicPlayer.playMusic();
          System.out.println(musicPlayer.getName());
          System.out.println(musicPlayer.getVolume());

          MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
          musicPlayer1.playMusic();
          musicPlayer1.setName("Gramafon");
          System.out.println(musicPlayer1.getName());
          musicPlayer1.setVolume(50);
          System.out.println(musicPlayer1.getVolume());

        context.close();
    }
}
