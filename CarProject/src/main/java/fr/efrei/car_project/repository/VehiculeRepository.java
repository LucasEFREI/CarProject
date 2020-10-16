package fr.efrei.car_project.repository;

import fr.efrei.car_project.model.Vehicule;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface VehiculeRepository extends CrudRepository<Vehicule, String> {
    List<Vehicule> findByPlateNumber(String plateNumber);
}
