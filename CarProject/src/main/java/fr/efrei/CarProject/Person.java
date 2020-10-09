package fr.efrei.CarProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    //------------------------------------------------------------------------------------------------------------------
    private String name;
    @Id
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //------------------------------------------------------------------------------------------------------------------
}
