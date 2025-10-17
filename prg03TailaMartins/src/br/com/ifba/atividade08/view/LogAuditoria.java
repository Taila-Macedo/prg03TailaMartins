/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.time.LocalDateTime;
/**
 *
 * @author Taila
 */
public class LogAuditoria {
    private Long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;
    
     public LogAuditoria(Long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip){
        this.acao = acao;
        this.dataHora = dataHora;
        this.id = id;
        this.ip = ip;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public String toString(){
        return "LogAuditoria{id=" + id + ", usuario=" + usuario.getNomeUsuario() +
                ", acao='" + acao + "', dataHora=" + dataHora + ", ip='" + ip + "'}";
    }
    
}
