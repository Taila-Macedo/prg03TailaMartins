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
public class PagamentoPix implements Pagamento{
    private double valor;
    
    public PagamentoPix(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    public double calcularTotal(double valor) {
    // Calcula o valor final aplicando cashback de 2%
        valor = valor * 0.98;
        return valor;
    }
    
    
    public void imprimirRecibo(javax.swing.JTextArea area){
        String texto = "";
        texto += "=== RECIBO PIX ===\n";
        texto += String.format("Valor original: R$ %.2f\n", valor);
        texto += String.format("Cashback de 2%%!\n");
        texto += String.format("Valor final pago: R$ %.2f\n", calcularTotal(valor));
        
        area.setText(texto);
    }

}
