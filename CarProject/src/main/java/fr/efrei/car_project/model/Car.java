package fr.efrei.car_project.model;

import fr.efrei.car_project.model.Vehicule;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule {
    //------------------------------------------------------------------------------------------------------------------
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    //------------------------------------------------------------------------------------------------------------------
}
