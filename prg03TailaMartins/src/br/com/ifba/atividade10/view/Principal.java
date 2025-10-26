/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author Taila
 */
public class Principal {
    public static void main(String[] args){
        // Criando um array de formas com objetos 2D e 3D
        Forma[] formas = {
            new Circulo(6),
            new Quadrado(4),
            new Triangulo(6, 3),
            new Esfera (4),
            new Cubo (2),
            new Piramide(4, 2)
        };
        
        // Percorre todas as formas e imprime informações
        for (Forma f : formas) {
           System.out.println("\n" + f.toString());
           
           if (f instanceof FormaBidimensional) {
               // Se for 2D, apenas calcula e mostra a área
               FormaBidimensional forma2d = (FormaBidimensional) f;
               System.out.printf("Area: %.2f\n", forma2d.obterArea());
           }else
               if(f instanceof FormaTridimensional) {
                   // Se for 3D, calcula e mostra área e volume
                   FormaTridimensional forma3d = (FormaTridimensional) f;
                   System.out.printf("Area: %.2f\n", forma3d.obterArea());
                   System.out.printf("Volume: %.2f\n", forma3d.obterVolume());
            }
        }         
    }
    
}
