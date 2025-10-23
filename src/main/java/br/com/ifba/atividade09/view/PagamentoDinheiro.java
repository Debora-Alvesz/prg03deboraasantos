/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author Débora Alves
 */
public class PagamentoDinheiro implements Pagamento{
  private double valor;
  private double desconto;
  private double valorFinal;
    // construtor
    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }
    // getters e setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //métodos abstratos
    @Override
    public double calcularTotal() {
     desconto = valor * 0.10;
     valorFinal = valor - desconto;
     return valorFinal;
    }

    @Override
    public String imprimirRecibo() {
        
     // Monta o recibo como uma String e retorna
    return "Total: " + valor + "\n" +
           "Desconto: " + desconto + "\n" +
           "Valor final: " + valorFinal;
    }
  
}
