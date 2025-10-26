/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author Taila
 */
public class Piramide extends FormaTridimensional {
    private double altura;
    private double base;
    
    public Piramide(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double obterArea() {
        //Calcula a área da piramide
        double areaBase = base * base;
        double areaLateral = 2 * base * Math.sqrt((base / 2) * (base / 2) + altura * altura);
        return areaBase + areaLateral;
    }

    @Override
    public double obterVolume() {
        return (base * base * altura) / 3;
    }

    @Override
    public String toString() {
        return "-----Piramide------\n" +
                "Base: " + base + "\n" +
                "Altura: " + altura;
    }
    
    
    
}
