/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;
import java.util.Scanner;
/**
 *
 * @author Taila
 */
public class Interativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();
        boolean sair = false;

        System.out.println("========= Bem-vindo ao NeoBank ==================");
        System.out.print("Informe o nome do titular da conta: ");
        conta.setDono(sc.nextLine()); //Lê o que foi digitado
        System.out.print("Informe o número da conta: ");
        conta.setNumConta(sc.nextInt());
        sc.nextLine(); // limpar buffer

        //Loop do menu
        while (!sair) { // Enquanto "sair" for falso, o menu continuará sendo exibido
            System.out.println("\n============ MENU ================");
            System.out.println("1. Abrir Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Pagar Mensalidade");
            System.out.println("5. Ver Conta");
            System.out.println("6. Fechar Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt(); // Lê a opção escolhida
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (!conta.getStatus()) { // Verifica se a conta ainda não foi aberta
                        System.out.print("Digite o tipo da conta (cc/cp): ");
                        String tipo = sc.nextLine();
                        conta.abrirConta(tipo); // Chama o método abrirConta
                    } else {
                        System.out.println("A conta já está aberta!");
                    }
                    break;

                case 2:
                    System.out.print("Valor para depósito: ");
                    float dep = sc.nextFloat(); // Lê o valor a ser depositado
                    conta.depositar(dep);// Chama o método depositar
                    break;

                case 3:
                    System.out.print("Valor para saque: ");
                    float saq = sc.nextFloat();
                    conta.sacar(saq);
                    break;

                case 4:
                    conta.pagarMensal();
                    break;

                case 5:
                    conta.estadoAtual();
                    break;

                case 6:
                    conta.fecharConta();
                    break;

                case 0:
                    sair = true;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close(); // Fecha o Scanner
    }
}