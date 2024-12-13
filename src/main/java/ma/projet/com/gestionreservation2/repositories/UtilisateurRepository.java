package ma.projet.com.gestionreservation2.repositories;

import ma.projet.com.gestionreservation2.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
