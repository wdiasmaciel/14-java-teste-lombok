package com.exemplo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario;

        usuario = new Usuario();
        usuario.setNome("Ana");
        System.out.println("Usuário(a): " + usuario.getNome());
        
        usuario = new Usuario(
            "Diana",
            "Silva",
            "ana.silva@example.com",
            new Date(),
            "Feminino"
        );
        System.out.println("Usuário(a): " + usuario.getNome());
    }
}