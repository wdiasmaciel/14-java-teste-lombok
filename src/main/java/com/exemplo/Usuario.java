package com.exemplo;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import java.util.Date; // ou java.time.LocalDate

@Entity
@NoArgsConstructor
public class Usuario {
    @Id @GeneratedValue
    @Getter private Long id; 
    @Getter @Setter private String nome;
    @Getter @Setter private String sobrenome;
    @Getter @Setter private String email;
    @Getter @Setter private Date idade;
    @Getter @Setter private String genero;
 
    public Usuario(String nome, String sobrenome, String email, Date idade, String genero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.idade = idade;
        this.genero = genero;
    }
 }
