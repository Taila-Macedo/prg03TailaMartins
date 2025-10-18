/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.util.Arrays;
/**
 *
 * @author Taila
 */
public class Main {
    public static void main(String[] args) {
        // Cria perfil de usuário
        PerfilUsuario adm = new PerfilUsuario(1L, "Administrador",
                Arrays.asList("CRIAR_USUARIO", "EXCLUIR_USUARIO", "LOGAR"));
        PerfilUsuario comum = new PerfilUsuario(2L, "Comum",
                Arrays.asList("LOGAR"));
        
        // Criar usuários
        Usuario maria = new Usuario(1L, comum, "Maria", "maria@gmail.com", "1234", true);
        Usuario joao = new Usuario(2L, adm, "Joao", "joao@ifba.edu.br", "abcd", true);
       
        System.out.println(maria);
        System.out.println(joao);
        
        // Realiza login
        maria.logar("1234");
        joao.logar("abcd");
        
        // Cria sessões e gera tokens
        Sessao sessaoMaria = maria.criarSessao();
        Sessao sessaoJoao = joao.criarSessao();
     
    }
}
