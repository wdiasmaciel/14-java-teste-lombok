package com.exemplo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
            "Ana",
            "Silva",
            "ana.silva@example.com",
            new Date(),
            "Feminino"
        );
        System.out.println("Usuário criado: " + usuario.getNome());
    }
}