package com.BusBooking.OBB.Repository;

import com.BusBooking.OBB.Entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    List<Bus> findByFromLocationAndToLocation(String from, String to);
}
