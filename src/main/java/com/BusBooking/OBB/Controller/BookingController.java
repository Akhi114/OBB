package com.BusBooking.OBB.Controller;

import com.BusBooking.OBB.DTO.BookingResponse;
import com.BusBooking.OBB.Entity.Booking;
import com.BusBooking.OBB.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired private BookingService bookingService;

    @PostMapping("/")
    public ResponseEntity<Booking> book(@RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.book(booking));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<BookingResponse>> getUserBookings(@PathVariable Long id) {
        return ResponseEntity.ok(bookingService.getBookings(id));
    }
}
