package com.flight.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.Entity.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
