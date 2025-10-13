/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author Débora Alves
 */
public class TesteContaBanco {
    public static void main(String[] args) {
        // Cria uma nova conta
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1111);
        conta1.setDono("Débora");

        // Abre a conta tipo corrente (CC)
        conta1.abrirConta("CC");

        // Faz um depósito
        conta1.depositar(100);

        // Realiza um saque
        conta1.sacar(50);

        // Paga mensalidade
        conta1.pagarMensalidade();

        // Mostra o estado atual da conta
        conta1.estadoAtual();

        // Tenta fechar a conta (não deve conseguir se ainda tiver saldo)
        conta1.fecharConta();
    } 
}
