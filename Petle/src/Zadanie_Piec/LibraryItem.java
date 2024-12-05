package Zadanie_Piec;

import Zadanie_Piec.Exceptions.UnavailableItemException;

public abstract class LibraryItem {
    protected boolean isAvailable = true;
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void borrow() throws UnavailableItemException {
        if (isAvailable) {
            this.isAvailable = false;
        } else {
            throw new UnavailableItemException("Brak takiej rzeczy");
        }
    }

    public void returnItem() {
        if(!isAvailable) {
            this.isAvailable = true;
        } else {
            throw new IllegalStateException("Debil");
        }
    }
}
