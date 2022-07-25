package com.flight.Service;

import com.flight.Entity.Reservation;
import com.flight.dtos.ReservationRequest;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
