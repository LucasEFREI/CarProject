package fr.efrei.car_project.model;

import javax.persistence.*;

@Entity
public class Person {
    //------------------------------------------------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId(){ return id;}

    public void setId(long id) { this.id = id; }
    //------------------------------------------------------------------------------------------------------------------
    /*@ManyToOne
    private Rent rent;*/
}
