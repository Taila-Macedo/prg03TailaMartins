/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author Taila
 */
public class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        //Calcula a área do círculo
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "-------Circulo--------\n" +
                "Raio: " + raio;
    }
}
