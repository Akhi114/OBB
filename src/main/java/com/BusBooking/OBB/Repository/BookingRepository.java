package com.BusBooking.OBB.Repository;

import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface BookingRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId);
}
