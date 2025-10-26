/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author Taila
 */
public class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera (double raio){
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
        //Calcula área da superfície da esfera
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double obterVolume() {
        //Calcula o volume da esfera
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String toString() {
        return "-------Esfera------\n" +
                "Raio: " + raio;
    }
    
    
}
