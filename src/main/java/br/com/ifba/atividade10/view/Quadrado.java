/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.atividade10.view;

/**
 *
 * @author Débora Alves
 */
// Classe concreta que representa um quadrado
public class Quadrado extends FormaBidimensional {

    // Atributo específico do quadrado
    private double lado;

    // Construtor define o nome e o lado
    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    // Implementação do método abstrato para calcular a área
    @Override
    public double obterArea() {
        // Fórmula da área do quadrado: lado²
        return lado * lado;
    }

    // Método toString sobrescrito para mostrar os dados do quadrado
    @Override
    public String toString() {
        return super.toString() + " | Lado = " + lado;
    }
}