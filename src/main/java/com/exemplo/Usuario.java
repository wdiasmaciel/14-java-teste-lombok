package com.exemplo;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import java.util.Date; // ou java.time.LocalDate

@Entity
@Getter
@ToString
@Builder
@Slf4j
public class Usuario {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private Date idade;
    private String genero;

    // Método com log para exibir informações do usuário:
    public void exibirUsuario() {
        log.info("Usuário: Nome = {}, Sobrenome = {}, E-mail = {}", nome, sobrenome, email);

        if (idade == null) {
            log.warn("O atributo 'idade' está nulo para o usuário: {}", nome);
        }
    }

    // Método com log para salvar usuário:
    public void salvarUsuario() {
        try {
            log.debug("Iniciando processo de salvamento do usuário...");

            // Simulando operação de salvamento do usuário com erro.
            throw new Exception("Simulação: operação de salvamento do usuário com erro.");

            //log.info("Usuário '{}' salvo com sucesso!", nome);
        } catch (Exception e) {
            log.error("Erro ao salvar o usuário {}: {}", nome, e.getMessage(), e);
        }
    }
}