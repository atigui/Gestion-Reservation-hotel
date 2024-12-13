package ma.projet.com.gestionreservation2.repositories;

import ma.projet.com.gestionreservation2.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}

