/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.atividade10.view;

/**
 *
 * @author Débora Alves
 */
public abstract class Forma {
     // Atributo comum a todas as formas
    protected String nome;

    // Construtor
    public Forma(String nome) {
        this.nome = nome;
    }

    // Método toString para descrever o objeto
    @Override
    public String toString() {
        return "Forma: " + nome;
    }
}
