package ma.projet.com.gestionreservation2.repositories;

import ma.projet.com.gestionreservation2.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
