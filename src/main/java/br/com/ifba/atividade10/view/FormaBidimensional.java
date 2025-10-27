/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.atividade10.view;

/**
 *
 * @author Débora Alves
 */
// Classe abstrata que representa formas 2D (sem volume)
public abstract class FormaBidimensional extends Forma {

    // Construtor chama o construtor da classe mãe (Forma)
    public FormaBidimensional(String nome) {
        super(nome);
    }

    // Método abstrato: todas as formas 2D precisarão implementar este método
    public abstract double obterArea();
}
