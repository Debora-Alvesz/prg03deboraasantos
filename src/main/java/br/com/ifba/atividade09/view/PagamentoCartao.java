/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author Débora Alves
 */
public class PagamentoCartao implements Pagamento{
   private double valor;
    private double taxa;
    private double valorFinal;

    // Construtor
    public PagamentoCartao(double valor) {
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
        taxa = valor * 0.05;            // calcula a taxa de 5%
        valorFinal = valor + taxa;      // soma a taxa ao valor
        return valorFinal;
    }

    @Override
    public String imprimirRecibo() {
        // Retorna o recibo como String
    return "Total: " + valor + "\n" +
           "Taxa: " + taxa + "\n" +
           "Valor final: " + valorFinal; 
    }
   
}
