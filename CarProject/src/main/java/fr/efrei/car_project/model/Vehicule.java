package fr.efrei.car_project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Vehicule {
    //------------------------------------------------------------------------------------------------------------------
    @ManyToMany(mappedBy = "vehicules", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Rent> rents = new ArrayList<Rent>();

    @Id
    private String plateNumber;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Vehicule() {
        super();
    }

    public Vehicule(String plateNumber) {
        super();
        this.plateNumber = plateNumber;
    }

    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents){
        this.rents = rents;
    }

    @Override
    public String toString() {
        return "Vehicule [plateNumber=" + plateNumber + ", rents=" + rents + "]";
    }
}

