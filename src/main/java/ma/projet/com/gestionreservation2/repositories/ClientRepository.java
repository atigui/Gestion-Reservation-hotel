package ma.projet.com.gestionreservation2.repositories;

import ma.projet.com.gestionreservation2.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
