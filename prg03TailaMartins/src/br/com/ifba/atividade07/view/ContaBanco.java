/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author Taila
 */
public class ContaBanco {
    protected String tipo; //CC ou CP
    public int numconta;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco(){
        this.saldo = 0; // Quando a conta é criada, o saldo começa zerado
        this.status = false; // A conta começa fechada por padrão
    }
    
    public void setNumConta(int numConta){
        this.numconta = numConta;
    }
    
    public int getNumConta(){
        return numconta;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getDono(){
        return dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setSatatus(boolean status){
        this.status = status;
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo); // Define o tipo informado (cc ou cp)
        this.setSatatus(true); // Marca a conta como aberta
        
         // Dá um saldo inicial dependendo do tipo da conta:
        if(tipo.equalsIgnoreCase("cc")){ // Se for conta corrente deposita R$50,00 de presente
            this.setSaldo(50);
            System.out.println("Conta Corrente aberta com sucesso! Parabéns, você recebeu R$50,00 de presente!");
        }
            else if(tipo.equalsIgnoreCase("cp")){// Se for conta poupança deposita R$150,00 de presente
            this.setSaldo(150);
            System.out.println("Conta Poupança aberta com sucesso! Parabéns, você recebeu R$150,00 de presente!");
        } else{
                System.out.println("Tipo de conta inválido! Use 'cc' para corrente ou 'cp' para poupança.");
            }
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){// Se ainda tem dinheiro, não pode fechar
            System.out.println("Conta ainda tem dinheiro, não pode ser fechada!");
        }else if(this.getSaldo() < 0){ // Se está devendo, também não pode fechar
            System.out.println("Conta em débito, não pode ser fechada!");
        }else{ // Se o saldo for exatamente zero fecha a conta
            this.setSatatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor){
        if(this.getStatus()){ //verifica se a conta está aberta
            this.setSaldo(this.getSaldo() + valor); //soma o valor ao saldo atual
            System.out.println("Depósito de R$"+ valor+" realizado com sucesso! ");
        }else{
            System.out.println("Impossível depósitar em uma conta fechada.");
        }
    }
    
    public void sacar(float valor){
      if(status && saldo >= valor){// Se a conta estiver aberta e tiver saldo suficiente
          saldo -= valor; // Subtrai o valor do saldo
          System.out.println("Saque de R$"+ valor +" realizado com sucesso!");
      }else if (!status) {
        System.out.println("Impossível sacar de uma conta fechada!");
    }else{
        System.out.println("Saldo insuficiente para saque!");
      }
              
}
    
    public void pagarMensal(){
        if(!status){
           System.out.println("Impossível pagar a mensalidade de uma conta fechada.");
        }
        
         // Define o valor da mensalidade conforme o tipo da conta (Conta corrente paga R$12, conta poupança paga R$20) 
        float valor = tipo.equalsIgnoreCase("cc") ? 12 : 20;
        
        if(saldo >= valor){// Se houver saldo suficiente
            saldo -= valor;// Subtrai o valor da mensalidade
            System.out.println("Mensalidade de R&"+ valor +" paga com sucesso!");   
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    
    public void estadoAtual(){
        System.out.println("======================================");
        System.out.println("Conta: " +this.getNumConta());
        System.out.println("Tipo: " +this.getTipo());
        System.out.println("Dono: " +this.getDono());
        System.out.println("Saldo: R$" +this.getSaldo());
         // Mostra o status da conta (Ativa ou Fechada)
        System.out.println("Status: " +(this.getStatus() ? "Ativa" : "Fechada"));
    }
    
    
}