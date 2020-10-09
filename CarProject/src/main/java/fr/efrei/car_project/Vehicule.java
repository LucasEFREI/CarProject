package fr.efrei.car_project;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vehicule {
    //------------------------------------------------------------------------------------------------------------------
    private String plateNumber;

    @Id
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
