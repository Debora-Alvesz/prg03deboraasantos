/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.util.Arrays;

/**
 *
 * @author Débora Alves
 */
public class Main {

    public static void main(String[] args) {
    // 1) Criação de perfis de usuário com suas permissões
        PerfilUsuario admin = new PerfilUsuario(1L, "Administrador", Arrays.asList("CRIAR", "EDITAR", "DELETAR"));
        PerfilUsuario editor = new PerfilUsuario(2L, "Editor", Arrays.asList("CRIAR", "EDITAR"));

        // 2) Criação de usuários com seus perfis
        Usuario debora = new Usuario(1L, admin, "Débora Alves", "debora@email.com", "minhaSenha123");
        Usuario larissa = new Usuario(2L, editor, "Larissa", "larissa@email.com", "senha123");

        // 3) Testes de login
        debora.logar("minhaSenha123");      // Login correto
        debora.logar("senhaErrada");        // Login incorreto

        // 4) Criação de sessões
        Sessao s1 = debora.criarSessao();
        Sessao s2 = debora.criarSessao();
        larissa.logar("senha123");
        larissa.criarSessao(); // sem salvar em variável se não for usar

        // 5) Impressão de informações dos usuários
        System.out.println("\n-- USUÁRIOS --");
        System.out.println(debora);
        System.out.println(larissa);

        // 6) Impressão dos logs de Débora
        System.out.println("\n-- LOGS DE DEBORA --");
        System.out.print(debora.logsToString());

        // 7) Impressão das sessões de Débora
        System.out.println("-- SESSÕES DE DEBORA --");
        for (Sessao s : debora.getSessoes()) {
            System.out.println(s);
        }

    }
}