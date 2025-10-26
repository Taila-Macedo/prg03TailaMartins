/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author Taila
 */
public class Quadrado extends FormaBidimensional {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    

    @Override
    public double obterArea() {
        //Calcula a área do quadrado
        return lado * lado;
    }

    @Override
    public String toString() {
        return "-------Quadrado------\n" +
                "Lado: "+ lado;
    }
}
