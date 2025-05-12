package com.BusBooking.OBB.Service;

import com.BusBooking.OBB.Entity.Bus;
import com.BusBooking.OBB.Repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {
    @Autowired private BusRepository busRepo;

    public List<Bus> getAllBuses() {
        return busRepo.findAll();
    }

    public List<Bus> searchBuses(String source, String destination) {
        return busRepo.findBySourceIgnoreCaseAndDestinationIgnoreCase(source, destination);
    }

    public Optional<Bus> getBusById(Long id) {
        return busRepo.findById(id);
    }
}
