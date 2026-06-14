package com.pe.cloud.computing.ciclo8.project_avm.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "videojuego")
@Data
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private Double precio;
}
