package com.example.emplo1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    Long nr_of_kernel;
    Long RAM;

    @ManyToOne
    @JoinColumn(name = "persone_id",nullable = false)
    private Person person;
}
