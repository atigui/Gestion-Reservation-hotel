package ma.projet.com.gestionreservation2.web.soap;

import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class CXFSoapWebServiceConfig {
    @Autowired
    private Bus bus;
    @Autowired
    private ReservationSoapService reservationSoapService;  // Service SOAP de réservation

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationSoapService);
        endpoint.publish("/ws");
        return endpoint;
    }

}
