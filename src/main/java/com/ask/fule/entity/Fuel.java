package com.ask.fule.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name ="FUEL")
public class Fuel {

    @Column(name = "user_id")
    private Long id;

    @Column
    private String name;
}
