/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09.view;
import javax.swing.JTextArea;
/**
 *
 * @author Taila
 */
public interface Pagamento {

    double calcularTotal(double valor);
    
    void imprimirRecibo(JTextArea area);
}
