package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends  BaseModel{
    private int rowVal;
    private int colVal;
    private String seatNo;
    private SeatType seatType;
}
