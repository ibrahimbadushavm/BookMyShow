package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {

    @ManyToOne
    private User user;
    private String bookingNumber;

    @ManyToOne
    private Show show;

    @ManyToMany
    private List<ShowSeat> showSeats;

    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    private int amount;
    private Date bookingDate;
}
