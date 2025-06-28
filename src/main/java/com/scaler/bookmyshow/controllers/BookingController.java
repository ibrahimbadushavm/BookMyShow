package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.BookingRequestDto;
import com.scaler.bookmyshow.dtos.BookingResponseDto;
import com.scaler.bookmyshow.dtos.ResponseStatus;
import com.scaler.bookmyshow.models.Booking;
import com.scaler.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookingResponseDto bookShow(BookingRequestDto bookingRequestDto) {
        BookingResponseDto bookingResponseDto = new BookingResponseDto();
        try {
            Booking booking = bookingService.bookShow(bookingRequestDto.getUserId(), bookingRequestDto.getShowId(), bookingRequestDto.getShowSeatIds());
            bookingResponseDto.setBookingId(booking.getId());
            bookingResponseDto.setAmount(booking.getAmount());
            bookingResponseDto.setResponseStatus(ResponseStatus.SUCCESS);

        } catch (Exception e) {
            bookingResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return bookingResponseDto;
    }
}
