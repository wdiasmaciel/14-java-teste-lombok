package com.exemplo;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import java.util.Date; // ou java.time.LocalDate

@Entity
@NoArgsConstructor @AllArgsConstructor
@ToString(of={"nome", "sobrenome"})
public class Usuario { 
    @Id @GeneratedValue
    @Getter private Long id; 
    @Getter @Setter private String nome;
    @Getter @Setter private String sobrenome;
    @Getter @Setter private String email;
    @Getter @Setter private Date idade;
    @Getter @Setter private String genero;
 }
