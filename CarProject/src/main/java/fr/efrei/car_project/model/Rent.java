package fr.efrei.car_project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Rent {
    //------------------------------------------------------------------------------------------------------------------
    @ManyToMany
    private List<Vehicule> vehicules;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date beginRent;
    private Date endRent;

    public Rent() {
        super();
    }

    public Rent(Date beginRent, Date endRent){
        super();
        this.vehicules=new ArrayList<>();
        this.beginRent=beginRent;
        this.endRent=endRent;
    }

    public Date getBeginRent() { return beginRent; }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id=id; }

    public List<Vehicule> getVehicules() { return vehicules; }

    public void setVehicules(List<Vehicule> vehicules) { this.vehicules= vehicules; }

    @Override
    public String toString() {
        return "Rent [id=" + id + ", beginRent=" + beginRent + ", endRent=" + endRent + "]";
    }


    /*@OneToMany
    private List<Person> persons;*/
}
