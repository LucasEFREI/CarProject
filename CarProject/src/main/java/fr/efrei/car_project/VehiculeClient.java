package fr.efrei.car_project;

import fr.efrei.car_project.web.VehiculeController;
import fr.efrei.car_project.model.Vehicule;
import fr.efrei.car_project.service.VehiculeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class VehiculeClient {

    private static final Logger log = LoggerFactory.getLogger(VehiculeClient.class);

    public static void main(String[] args)
    {

        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<Vehicule> request = new HttpEntity<>(new Vehicule());
        restTemplate.postForObject("http://localhost:8080/vehicule", request, Vehicule.class);
        restTemplate.postForObject("http://localhost:8080/vehicule", request, Vehicule.class);

        List vehicules = restTemplate.getForObject("http://localhost:8080/vehicule", List.class);
        log.info(vehicules.toString());

    }
}
