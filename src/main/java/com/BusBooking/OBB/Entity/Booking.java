package com.BusBooking.OBB.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Booking {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Bus bus;

    private String passengerInfo;
    private String seatNumber;
    private String bookingDate;

    //Getter & Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public String getPassengerInfo() {
        return passengerInfo;
    }

    public void setPassengerInfo(String passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }
}
