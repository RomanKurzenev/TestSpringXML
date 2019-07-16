package ru.kurzenev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private String name;

    private int volume;

    private MusicPlayer(){}

    public static MusicPlayer getMusicPlayer(){
        return new MusicPlayer();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        for(Music music : musicList)
            System.out.println("Playing: " + music.getSong());
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
}
