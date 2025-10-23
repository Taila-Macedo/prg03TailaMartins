/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;
import javax.swing.JTextArea;
/**
 *
 * @author Taila
 */
public class PagamentoDinheiro implements Pagamento{
    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal(double valor) {
    // Calcula o valor final com desconto de 10%
        valor = valor * 0.9;
        return valor;
    }

    @Override
    public void imprimirRecibo(JTextArea area) {
    String texto = "";
    texto += "=== RECIBO DINHEIRO ===\n";
    texto += String.format("Valor original: R$ %.2f\n", valor);
    texto += "Desconto de 10% aplicado!\n";
    texto += String.format("Valor final: R$ %.2f\n", calcularTotal(valor));
          
    area.setText(texto);// Mostra no JTextArea  
    }
}
