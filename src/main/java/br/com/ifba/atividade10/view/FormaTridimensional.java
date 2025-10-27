/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.atividade10.view;

/**
 *
 * @author Débora Alves
 */
// Classe abstrata que representa formas 3D (com volume)
public abstract class FormaTridimensional extends Forma {

    // Construtor chama o construtor da classe mãe (Forma)
    public FormaTridimensional(String nome) {
        super(nome);
    }

    // Método abstrato para calcular a área da forma 3D
    public abstract double obterArea();

    // Método abstrato para calcular o volume da forma 3D
    public abstract double obterVolume();
}
