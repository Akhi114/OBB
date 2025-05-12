package com.BusBooking.OBB.Controller;

import com.BusBooking.OBB.Entity.Bus;
import com.BusBooking.OBB.Service.BusService;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buses")
@CrossOrigin(origins = "http://localhost:3000")
public class BusController {
    @Autowired private BusService busService;

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Bus>> searchBuses(
            @RequestParam String source, @RequestParam String destination) {
        return ResponseEntity.ok(busService.searchBuses(source, destination));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long id) {
        return busService.getBusById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
