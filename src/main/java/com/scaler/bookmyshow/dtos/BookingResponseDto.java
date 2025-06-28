package com.scaler.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingResponseDto {
    private Long bookingId;
    private int amount;
    private ResponseStatus responseStatus;
}
