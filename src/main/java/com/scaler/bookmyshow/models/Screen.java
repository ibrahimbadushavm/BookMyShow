package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<SupportedFeature> features;
    @OneToMany
    private List<Seat> seats;
    private ScreenStatus screenStatus;
}
