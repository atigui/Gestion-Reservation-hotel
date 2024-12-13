package ma.projet.com.gestionreservation2;

import ma.projet.com.gestionreservation2.entities.Reservation;
import ma.projet.com.gestionreservation2.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class GestionReservation2Application {
	public static void main(String[] args) {
		SpringApplication.run(GestionReservation2Application.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(ReservationRepository reservationRepository) {
		return args -> {
			// Ajout des données dans la base H2
			reservationRepository.save(new Reservation("John Doe", "2024-12-10", "2024-12-15", "Single Room"));
			reservationRepository.save(new Reservation("Jane Smith", "2024-12-12", "2024-12-20", "Double Room"));
			reservationRepository.save(new Reservation("Alice Johnson", "2024-12-14", "2024-12-18", "Suite"));

			System.out.println("Données initiales insérées dans la base H2.");
		};
	}



}
