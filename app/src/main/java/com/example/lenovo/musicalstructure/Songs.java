package com.example.lenovo.musicalstructure;


public class Songs {


    private String nameOfTheSong;


    private String nameOfTheBand;


    public  Songs (String nameOfTheSong, String nameOfTheBand) {
        this.nameOfTheSong = nameOfTheSong;
        this.nameOfTheBand = nameOfTheBand;
    }

    public String getSongName() {
        return nameOfTheSong;
    }

    public String getBandName() {
        return nameOfTheBand;
    }
}
