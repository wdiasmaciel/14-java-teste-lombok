package com.exemplo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario;

        usuario = new Usuario();
        usuario.setNome("Ana");
        System.out.println("Usuário(a): " + usuario.toString());
        
        usuario = new Usuario(
            1L, // Representação do 1 com tipo Long em Java.
            "Diana",
            "Silva",
            "ana.silva@example.com",
            new Date(),
            "Feminino"
        );
        System.out.println("Usuário(a): " + usuario.toString());
    }
}