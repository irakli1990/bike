package com.example.bike.repositories;

import com.example.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeRespository extends JpaRepository<Bike, Long> {
}
