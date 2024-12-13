package ma.projet.com.gestionreservation2.web.grpc;

import ma.projet.com.gestionreservation2.web.grpc.stubs.ReservationOuterClass;
import ma.projet.com.gestionreservation2.web.grpc.stubs.ReservationServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;
import io.grpc.stub.StreamObserver;
import ma.projet.com.gestionreservation2.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
public class ReservationServiceImp extends ReservationServiceGrpc.ReservationServiceImplBase {
    private final ReservationService reservationService;

    public ReservationServiceImp(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @Override
    public void getAllReservations(ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest request, StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse> responseObserver) {
        try {
            List<ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation> reservations = reservationService.findAllReservations().stream()
                    .map(reservation -> ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.newBuilder()
                            .setId(reservation.getId())
                            .setCustomerName(reservation.getCustomerName())
                            .setStartDate(reservation.getStartDate().toString())
                            .setEndDate(reservation.getEndDate().toString())
                            .setRoomPreference(reservation.getRoomPreference())
                            .build())
                    .collect(Collectors.toList());

            responseObserver.onNext(ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse.newBuilder().addAllReservations(reservations).build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL.withDescription("Erreur interne : " + e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void getReservationById(ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest request, StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse> responseObserver) {
        try {
            Long id = request.getId();
            Optional<Reservation> reservationOpt = reservationService.findReservationById(id);

            if (reservationOpt.isPresent()) {
                Reservation reservation = reservationOpt.get();
                ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation grpcReservation = ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.newBuilder()
                        .setId(reservation.getId())
                        .setCustomerName(reservation.getCustomerName())
                        .setStartDate(reservation.getStartDate().toString())
                        .setEndDate(reservation.getEndDate().toString())
                        .setRoomPreference(reservation.getRoomPreference())
                        .build();

                responseObserver.onNext(ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse.newBuilder().setReservation(grpcReservation).build());
                responseObserver.onCompleted();
            } else {
                responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Réservation non trouvée").asRuntimeException());
            }
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL.withDescription("Erreur interne : " + e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void updateReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest request, StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse> responseObserver) {
        try {
            Long id = request.getId();
            ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation reservationReq = request.getReservation();

            Reservation reservation = new Reservation();
            reservation.setCustomerName(reservationReq.getCustomerName());
            reservation.setStartDate(String.valueOf(new SimpleDateFormat("yyyy-MM-dd").parse(reservationReq.getStartDate())));
            reservation.setEndDate(String.valueOf(new SimpleDateFormat("yyyy-MM-dd").parse(reservationReq.getEndDate())));
            reservation.setRoomPreference(reservationReq.getRoomPreference());

            Reservation updatedReservation = reservationService.updateReservation(id, reservation);

            if (updatedReservation != null) {
                ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation grpcReservation = ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.newBuilder()
                        .setId(updatedReservation.getId())
                        .setCustomerName(updatedReservation.getCustomerName())
                        .setStartDate(updatedReservation.getStartDate().toString())
                        .setEndDate(updatedReservation.getEndDate().toString())
                        .setRoomPreference(updatedReservation.getRoomPreference())
                        .build();

                responseObserver.onNext(ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse.newBuilder().setReservation(grpcReservation).build());
                responseObserver.onCompleted();
            } else {
                responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Réservation non trouvée pour mise à jour").asRuntimeException());
            }
        } catch (ParseException e) {
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Format de date invalide").asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL.withDescription("Erreur interne : " + e.getMessage()).asRuntimeException());
        }
    }


    @Override
    public void saveReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest request, StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse> responseObserver) {
        try {
            ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation reservationReq = request.getReservation();
            Reservation reservation = new Reservation();
            reservation.setCustomerName(reservationReq.getCustomerName());
            reservation.setStartDate(String.valueOf(new SimpleDateFormat("yyyy-MM-dd").parse(reservationReq.getStartDate())));
            reservation.setEndDate(String.valueOf(new SimpleDateFormat("yyyy-MM-dd").parse(reservationReq.getEndDate())));
            reservation.setRoomPreference(reservationReq.getRoomPreference());

            Reservation savedReservation = reservationService.saveReservation(reservation);

            ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation grpcReservation = ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.newBuilder()
                    .setId(savedReservation.getId())
                    .setCustomerName(savedReservation.getCustomerName())
                    .setStartDate(savedReservation.getStartDate().toString())
                    .setEndDate(savedReservation.getEndDate().toString())
                    .setRoomPreference(savedReservation.getRoomPreference())
                    .build();

            responseObserver.onNext(ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse.newBuilder().setReservation(grpcReservation).build());
            responseObserver.onCompleted();
        } catch (ParseException e) {
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Format de date invalide").asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL.withDescription("Erreur interne : " + e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void deleteReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest request, StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse> responseObserver) {
        try {
            Long id = request.getId();
            boolean deleted = reservationService.deleteReservation(id);

            if (deleted) {
                responseObserver.onNext(ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse.newBuilder().setSuccess(true).build());
            } else {
                responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Réservation non trouvée").asRuntimeException());
            }
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL.withDescription("Erreur interne : " + e.getMessage()).asRuntimeException());
        }
    }
}
