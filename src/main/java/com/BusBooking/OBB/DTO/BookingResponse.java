package com.BusBooking.OBB.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingResponse {
    private long id;
    private String busName;
    private String source;
    private String destination;
    private String bookingData;
    private String seatNumber;
    private int fare;
    private String status;

    public BookingResponse(Long id, String name, String source, String destination, String bookingDate, String seatNumber, String passengerInfo, double fare, String confirmed) {
    }
}
