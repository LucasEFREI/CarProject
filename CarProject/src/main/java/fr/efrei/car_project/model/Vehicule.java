package fr.efrei.car_project;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vehicule {
    //------------------------------------------------------------------------------------------------------------------
    @Id
    private String plateNumber;

    public String getPlateNumber(){
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    //------------------------------------------------------------------------------------------------------------------
    @ManyToMany
    private List<Rent> rentList;
}
