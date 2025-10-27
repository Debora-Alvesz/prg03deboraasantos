/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.atividade10.view;

/**
 *
 * @author Débora Alves
 */
// Classe concreta que representa um círculo
public class Circulo extends FormaBidimensional {

    // Atributo específico do círculo
    private double raio;

    // Construtor define o nome e o raio
    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    // Implementação do método abstrato da classe mãe
    @Override
    public double obterArea() {
        // Fórmula da área do círculo: π * r²
        return Math.PI * raio * raio;
    }

    // Método toString sobrescrito para mostrar os dados do círculo
    @Override
    public String toString() {
        return super.toString() + " | Raio = " + raio;
    }
}