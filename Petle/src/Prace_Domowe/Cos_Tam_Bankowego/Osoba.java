package Prace_Domowe.Cos_Tam_Bankowego;

public class Osoba {
    private String name;
    private String lastName;

    public Osoba(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Imie: " + name +
                ", nazwisko: " + lastName;
    }
}
