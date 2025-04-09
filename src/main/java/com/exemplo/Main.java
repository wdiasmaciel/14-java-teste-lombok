package com.exemplo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto Usuario usando o Builder:
        Usuario usuario = Usuario.builder()
                .id(1L)
                .nome("Ana")
                .sobrenome("Silva")
                .email("ana.silva@exemplo.com")
                .idade(null) // Simulando valor nulo para gerar o log de aviso.
                .genero("Feminino")
                .build();

        // Exibir as informações do usuário com logs:
        usuario.exibirUsuario();

        // Salvar usuário e registrar logs:
        usuario.salvarUsuario();
    }
}