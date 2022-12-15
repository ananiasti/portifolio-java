package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    public boolean existsByLicensePlatCar(String licensePlatCar);
   // public ParkingSpotModel findByBlock(String block);
   // public List<ParkingSpotModel> findAllByBlock(String block);
    public boolean existsByParkingSpotNumber(String parkingSpotNumber);
    public boolean existsByApartmentAndBlock(String apartment, String block);
}
