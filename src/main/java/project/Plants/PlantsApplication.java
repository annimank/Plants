package project.Plants;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import project.Plants.domain.Plant;
import project.Plants.domain.PlantRepository;

@SpringBootApplication
public class PlantsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner plants(PlantRepository plantRepository) {
		return (args) -> {
			plantRepository.save(new Plant("NimiEng", "NimiLat"));
		};
	}

}
