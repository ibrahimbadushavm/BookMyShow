package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    private String name;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Screen screen;
    @ManyToOne
    private Movie movie;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    List<SupportedFeature> features;
}
