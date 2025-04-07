package com.exemplo;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import java.util.Date; // ou java.time.LocalDate

@Entity
@ToString
@Builder
public class Usuario { 
    @Id @GeneratedValue
    private Long id; 
    private String nome;
    private String sobrenome;
    private String email;
    private Date idade;
    private String genero;
 }
