package ma.projet.com.gestionreservation2.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ma.projet.com.gestionreservation2.entities.Reservation;
import ma.projet.com.gestionreservation2.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "ReservationService")
public class ReservationSoapService {

    @Autowired
    private ReservationRepository reservationRepository;

    @WebMethod
    public List<Reservation> reservationList() {
        System.out.println("Fetching all reservations");
        return reservationRepository.findAll();
    }

    @WebMethod
    public Reservation reservationById(@WebParam(name = "id") Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Reservation createReservation(@WebParam(name = "reservation") Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @WebMethod
    public Reservation updateReservation(@WebParam(name = "id") Long id, @WebParam(name = "reservation") Reservation reservation) {
        if (reservationRepository.existsById(id)) {
            reservation.setId(id);
            return reservationRepository.save(reservation);
        }
        return null;
    }

    @WebMethod
    public boolean deleteReservation(@WebParam(name = "id") Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
