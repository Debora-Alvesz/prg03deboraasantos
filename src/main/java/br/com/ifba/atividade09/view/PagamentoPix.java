/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author Débora Alves
 */
public class PagamentoPix implements Pagamento {
     private double valor;
    private double cashback;
    private double valorFinal;

    // Construtor
    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    // Métodos
    @Override
    public double calcularTotal() {
        cashback = valor * 0.02;          // calcula 2% de cashback
        valorFinal = valor - cashback;    // subtrai o cashback do valor total
        return valorFinal;
    }

    @Override
    public String imprimirRecibo() {
        return "Total: " + valor + "\n" +
           "Cashback a ser recebido: " + cashback + "\n";    
    }
}
