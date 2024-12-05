package Zadanie_Piec.Items;

import Zadanie_Piec.LibraryItem;


public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        super(title);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    @Override
    public String toString() {
        return title + "; " + author + "; " + pages;
    }
}
