package fr.efrei.car_project.service;


import fr.efrei.car_project.model.Vehicule;
import fr.efrei.car_project.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class VehiculeService {

    @Autowired
    VehiculeRepository vehiculeRepository;

    public Vehicule save(Vehicule vehicule){
        return vehiculeRepository.save(vehicule);
    }

    public String generatePlateNumber() {
        String plateNumber = new String("");
        for (int i=0; i<=2; i++) {
            Random rnd = new Random();
            char c = (char) ('A' + rnd.nextInt(26));
            plateNumber += c;
        }
        for (int i=0; i<=3; i++) {
            Random rnd = new Random();
            int ri =  rnd.nextInt(10);
            String s = Integer.toString(ri);
            plateNumber += s;
        }
        return plateNumber;
    }

    public Iterable<Vehicule> findAll() {
        return null;
    }

}
