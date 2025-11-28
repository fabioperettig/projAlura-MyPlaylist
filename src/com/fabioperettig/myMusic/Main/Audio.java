package com.fabioperettig.myMusic.Main;

public abstract class Audio implements Methos {

    private String title;
    private String Genre;
    private double duration;
    private int numPlays;
    private int numLike;
    private double rating;

    //ctor
    public Audio(String title, String genre, double duration) {
        this.title = title;
        Genre = genre;
        this.duration = duration;
    }

    //getterSetter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return Genre;
    }
    public void setGenre(String genre) {
        Genre = genre;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    public int getNumPlays() {
        return numPlays;
    }
    public int getNumLike() {
        return numLike;
    }
    public double getRating() {
        return rating;
    }

    //implements

    @Override
    public void play() {
        this.numPlays++;
    }

    @Override
    public void like(){
        this.numLike++;
    }

    @Override
    public void averageRate(){
        if (this.numPlays == 0) {
            System.out.println("Rating: 0 stars");
            return;
        }

        rating = (double) this.numLike/this.numPlays;
        System.out.printf("Rating: %.2f%n", rating);
        if (rating >= .8) { System.out.println("5 stars"); }
        else if (rating >= .6) { System.out.println("4 stars"); }
        else if (rating >= .4) { System.out.println("3 stars"); }
        else if (rating >= .2) { System.out.println("2 stars"); }
        else { System.out.println("1 stars"); }

    }

}