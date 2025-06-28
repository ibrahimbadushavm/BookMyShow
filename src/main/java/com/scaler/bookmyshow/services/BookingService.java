package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.Booking;
import com.scaler.bookmyshow.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking bookShow(Long userId, Long showId, List<Long> showSeatIds) {
        return null;
    }
}
