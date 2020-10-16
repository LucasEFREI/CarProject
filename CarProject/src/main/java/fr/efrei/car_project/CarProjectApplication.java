package fr.efrei.car_project;


import fr.efrei.car_project.model.Rent;
import fr.efrei.car_project.model.Vehicule;
import fr.efrei.car_project.repository.VehiculeRepository;
import fr.efrei.car_project.service.VehiculeService;
import fr.efrei.car_project.web.VehiculeController;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
public class CarProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarProjectApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(VehiculeController controller) {
		return (args) -> {
			/*
			SimpleDateFormat beginDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date beginDate = beginDateFormat.parse("2018-10-09");
			System.out.println(beginDate.toString());

			SimpleDateFormat endDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date endDate = endDateFormat.parse("2019-11-10");
			System.out.println(endDate.toString());

			Vehicule v1 = new Vehicule();
			Rent r1 = new Rent(beginDate,endDate);
			v1.getRents().add(r1);
			r1.getVehicules().add(v1);
			*/
			controller.addVehicule();
			controller.addVehicule();
			controller.addVehicule();
			controller.addVehicule();
			controller.addVehicule();
			/*
			repository.save(aby1234);

			System.out.println("-------------------------------");
			System.out.println("Vehicules found with findAll():");
			for (Vehicule vehicule : repository.findAll()) {
				System.out.println(vehicule.toString());
			}

			System.out.println("-------------------------------");
			System.out.println("Rents associted with a vehicule");
			Iterable<Vehicule> vehicules = repository.findAll();
			Vehicule v = vehicules.iterator().next();

			List<Rent> rents = v.getRents();
			System.out.println(rents.toString());

			System.out.println("--------------------------------------------");
			System.out.println("Vehicule found with findName('ABY8512'):");
			repository.findByPlateNumber("ABY8512").forEach(vehicule -> {
				System.out.println(vehicule.toString());
			});*/

		};
	}

}
