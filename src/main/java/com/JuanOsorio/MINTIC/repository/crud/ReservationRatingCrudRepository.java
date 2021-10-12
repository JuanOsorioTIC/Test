package com.JuanOsorio.MINTIC.repository.crud;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.JuanOsorio.MINTIC.model.Reservation;
import com.JuanOsorio.MINTIC.model.ReservationRating;

public interface ReservationRatingCrudRepository extends CrudRepository<ReservationRating, Integer> {
	

	Optional<ReservationCrudRepository> findByReservationId(Reservation id);
	Optional<ReservationCrudRepository> findByRating(Integer rating);

}
