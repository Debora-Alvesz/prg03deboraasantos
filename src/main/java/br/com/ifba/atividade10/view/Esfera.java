/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.atividade10.view;

/**
 *
 * @author Débora Alves
 */
// Classe concreta que representa uma esfera
public class Esfera extends FormaTridimensional {

    // Atributo específico da esfera
    private double raio;

    // Construtor define o nome e o raio
    public Esfera(double raio) {
        super("Esfera");
        this.raio = raio;
    }

    // Implementação do método abstrato para calcular a área
    @Override
    public double obterArea() {
        // Fórmula da área da esfera: 4 * π * r²
        return 4 * Math.PI * raio * raio;
    }

    // Implementação do método abstrato para calcular o volume
    @Override
    public double obterVolume() {
        // Fórmula do volume da esfera: (4/3) * π * r³
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    // Método toString sobrescrito para mostrar os dados da esfera
    @Override
    public String toString() {
        return super.toString() + " | Raio = " + raio;
    }
}