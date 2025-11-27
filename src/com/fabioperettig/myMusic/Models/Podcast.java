package com.fabioperettig.myMusic.Models;
import com.fabioperettig.myMusic.Main.*;

public class Podcast extends Audio{

    private String host;
    private String abstr;

    //ctor
    public Podcast(String host, String title, String genre, double duration) {
        super(title, genre, duration);
        this.host=host;
    }

    //getterSetter
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getAbstr() {
        return abstr;
    }
    public void setAbstr(String abstr) {
        this.abstr = abstr;
    }

}