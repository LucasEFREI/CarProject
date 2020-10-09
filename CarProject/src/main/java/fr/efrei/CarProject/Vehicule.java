package fr.efrei.CarProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicule {
    @Id
    private String plateNumber;

    //------------------------------------------------------------------------------------------------------------------
    @Id
    public String getPlateNumber(){
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
