/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.atividade10.view;

/**
 *
 * @author Débora Alves
 */
// Classe concreta que representa um triângulo
public class Triangulo extends FormaBidimensional {

    // Atributos específicos do triângulo
    private double base;
    private double altura;

    // Construtor define o nome, base e altura
    public Triangulo(double base, double altura) {
        super("Triângulo");
        this.base = base;
        this.altura = altura;
    }

    // Implementação do método abstrato para calcular a área
    @Override
    public double obterArea() {
        // Fórmula da área do triângulo: (base * altura) / 2
        return (base * altura) / 2;
    }

    // Método toString sobrescrito para mostrar os dados do triângulo
    @Override
    public String toString() {
        return super.toString() + " | Base = " + base + ", Altura = " + altura;
    }
}
