package com.example.voiture.entities;

import com.example.voiture.entities.Client;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voitureentities {
    @Id
    @GeneratedValue
    private Long id;
    private String marque;
    private String matricule;
    private String model;
    private Long id_client;

    @Transient
    @ManyToOne
    private Client client;

}

