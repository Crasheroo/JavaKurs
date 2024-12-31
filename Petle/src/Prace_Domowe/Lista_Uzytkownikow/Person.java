package Prace_Domowe.Lista_Uzytkownikow;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private List<String> roles;

    public Person(String firstName, List<String> roles) {
        this.firstName = firstName;
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
