package com.fabioperettig.myMusic.Models;
import com.fabioperettig.myMusic.Main.Audio;

public class Music extends Audio{

    private String band;
    private String album;

    //ctor
    public Music(String band, String title, String genre, double duration) {
        super(title, genre, duration);
        this.band=band;
    }

    //GetterSetter
    public String getBand() {
        return band;
    }
    public void setBand(String band) {
        this.band = band;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

}