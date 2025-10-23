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
public class PagamentoCartao implements Pagamento{
    private double valor;

    public PagamentoCartao(double valor) {
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
       return valor * 1.05;
    }

    @Override
    public void imprimirRecibo(JTextArea area) {
        String texto = "";
        texto += "=== RECIBO CARTÃO ===\n";
        texto += String.format("Valor original: R$ %.2f\n", valor);
        texto += "Taxa de 5% aplicada!\n";
        texto += String.format("Valor final: R$ %.2f\n", calcularTotal(valor));
        
        area.setText(texto);
    }
}
