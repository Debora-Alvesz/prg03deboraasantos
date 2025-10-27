/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.atividade10.view;

/**
 *
 * @author Débora Alves
 */
// Classe concreta que representa uma pirâmide
public class Piramide extends FormaTridimensional {

   // Atributos específicos da pirâmide
    private double base;
    private double altura;

    // Construtor define o nome, base e altura
    public Piramide(double base, double altura) {
        super("Pirâmide");
        this.base = base;
        this.altura = altura;
    }

    // Implementação do método abstrato para calcular a área
    @Override
    public double obterArea() {
        // Área aproximada: base² + 2 * base * altura
        return (base * base) + 2 * base * altura;
    }

    // Implementação do método abstrato para calcular o volume
    @Override
    public double obterVolume() {
        // Fórmula do volume: (base² * altura) / 3
        return (Math.pow(base, 2) * altura) / 3;
    }

    // Método toString sobrescrito para mostrar os dados da pirâmide
    @Override
    public String toString() {
        return super.toString() + " | Base = " + base + ", Altura = " + altura;
    }
}