package fr.efrei.car_project.web;

import fr.efrei.car_project.model.Vehicule;
import fr.efrei.car_project.repository.VehiculeRepository;
import fr.efrei.car_project.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehiculeController {

    private List<Vehicule> vehicules = new ArrayList<Vehicule>();
    @Autowired
    VehiculeService vehiculeService;

    public VehiculeController(VehiculeService vehiculeService) {
        super();
        this.vehiculeService = vehiculeService;
    }

    @GetMapping("/vehicule")
    public Iterable<Vehicule> getVehicules() {
        return vehicules;
        //return vehiculeService.findAll();
    }

    @PostMapping("/vehicule") //need to change to PostMapping (cf. CarService github of M.Charroux) [add files of webapp] https://github.com/charroux/CarService
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void addVehicule() throws Exception {
        Vehicule v1 = new Vehicule(vehiculeService.generatePlateNumber());
        vehicules.add(v1);
        vehiculeService.save(v1);
        if(v1.getPlateNumber().equals("AAAAAAA")){
            throw new Exception();
        }
    }

}
