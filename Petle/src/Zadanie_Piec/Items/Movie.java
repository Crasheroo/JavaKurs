package Zadanie_Piec.Items;

import Zadanie_Piec.LibraryItem;

import java.util.Objects;

public class Movie extends LibraryItem {
    private String director;
    private double time;

    public Movie(String title, String director, double time) {
        super(title);
        this.director = director;
        this.time = time;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return title + "; " + director + "; " + time;
    }
}
