package com.BusBooking.OBB.Service;

import com.BusBooking.OBB.Entity.Bus;
import com.BusBooking.OBB.Repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    @Autowired private BusRepository busRepo;

    public List<Bus> search(String from, String to) {
        return busRepo.findByFromLocationAndToLocation(from, to);
    }
}
