package com.BusBooking.OBB.Service;

import com.BusBooking.OBB.DTO.BookingResponse;
import com.BusBooking.OBB.Entity.Booking;
import com.BusBooking.OBB.Entity.Bus;
import com.BusBooking.OBB.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {
    @Autowired private BookingRepository bookingRepo;

    public Booking book(Booking bookings) {
        return bookingRepo.save(bookings);
    }

    public List<BookingResponse> getBookings(Long userId) {
        List<Booking> bookings = bookingRepo.findByUserId(userId);
        return bookings.stream().map(booking -> {
            Bus bus = booking.getBus();
            return new BookingResponse(
                    booking.getId(),
                    bus.getName(),
                    bus.getSource(),
                    bus.getDestination(),
                    booking.getBookingDate(),
                    booking.getSeatNumber(),
                    booking.getPassengerInfo(),
                    bus.getFare(),
                    "Confirmed" // You can change this based on logic
            );
        }).collect(Collectors.toList());
    }
}
