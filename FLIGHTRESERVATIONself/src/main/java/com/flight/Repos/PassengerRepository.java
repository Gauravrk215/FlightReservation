package com.flight.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.Entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
