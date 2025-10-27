/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package br.com.ifba.atividade10.view;

/**
 *
 * @author Débora Alves
 */
public class Main {

    public static void main(String[] args) {
   // Criação de um vetor de Formas (polimorfismo)
        Forma[] formas = new Forma[6];

        // Adiciona diferentes formas no vetor
        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(6, 3);
        formas[3] = new Cubo(3);
        formas[4] = new Esfera(2);
        formas[5] = new Piramide(4, 6);

        // Percorre todas as formas e mostra informações
        for (Forma f : formas) {
            System.out.println("---------------------------------");
            System.out.println(f.toString());

            // Verifica se é forma 2D
            if (f instanceof FormaBidimensional) {
                FormaBidimensional f2d = (FormaBidimensional) f;
                System.out.printf("Área: %.2f\n", f2d.obterArea());
            } 
            // Verifica se é forma 3D
            else if (f instanceof FormaTridimensional) {
                FormaTridimensional f3d = (FormaTridimensional) f;
                System.out.printf("Área: %.2f\n", f3d.obterArea());
                System.out.printf("Volume: %.2f\n", f3d.obterVolume());
            }
        }
    }
}