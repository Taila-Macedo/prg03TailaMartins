/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 *
 * @author Taila
 */
public class Usuario {
    private Long id;
    private String nomeUsuario;
    private String email;
    private String senha;
    private PerfilUsuario perfil;
    private LocalDateTime ultimoLogin;
    private boolean ativo;
   private List<LogAuditoria> logs = new ArrayList<>();
   private List<Sessao> sessoes = new ArrayList<>();

   
    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, boolean ativo) {
    this.id = id;
    this.perfil = perfil;
    this.nomeUsuario = nomeUsuario;
    this.email = email;
    this.senha = senha;
    this.ativo = ativo;
}
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void logar(String senha){
        // Verifica se a senha informada é igual à senha do usuário
        if(this.senha.equals(senha)){
            // Atualiza o horário do último login
            this.ultimoLogin = LocalDateTime.now();
            //System.out.println(" Usuário logado com sucesso!");
        }else{
            System.out.println("Senha incorreta.");
        }
          
    }
    
    public Sessao criarSessao(){
        // Gera um token único
        String token = UUID.randomUUID().toString();
        Sessao sessao = new Sessao(System.currentTimeMillis(), this, token);
        sessoes.add(sessao);

        System.out.println("Sessão criada de " + nomeUsuario + ": " + token);
        return sessao;
    }
    
  public String toString(){
      return "Usuario: " + nomeUsuario + "\nEmail: " + email + "\nPerfil: " + perfil + "\n";
  }  
      
}
