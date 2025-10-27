/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.atividade10.view;

/**
 *
 * @author Débora Alves
 */
// Classe concreta que representa um cubo
public class Cubo extends FormaTridimensional {

    // Atributo específico do cubo
    private double lado;

    // Construtor define o nome e o lado
    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }

    // Implementação do método abstrato para calcular a área
    @Override
    public double obterArea() {
        // Fórmula da área total do cubo: 6 * lado²
        return 6 * lado * lado;
    }

    // Implementação do método abstrato para calcular o volume
    @Override
    public double obterVolume() {
        // Fórmula do volume do cubo: lado³
        return lado * lado * lado;
    }

    // Método toString sobrescrito para mostrar os dados do cubo
    @Override
    public String toString() {
        return super.toString() + " | Lado = " + lado;
    }
}
