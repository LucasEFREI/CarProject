package fr.efrei.car_project.repository;

import fr.efrei.car_project.model.Vehicule;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface VehiculeRepository extends CrudRepository<Vehicule, String> {
    List<Vehicule> findByPlateNumber(String plateNumber);
}
