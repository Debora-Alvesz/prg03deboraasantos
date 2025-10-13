/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author Débora Alves
 */
public class ContaBanco {
    // Atributos da conta
    public int numConta;
    protected String tipo; // tipo da conta (CC = corrente, CP = poupança)
    private String dono;
    private float saldo;
    private boolean status; // false = conta fechada, true = conta aberta
    
    // Exibe o estado atual da conta (dados e saldo)
    public void estadoAtual() {
        System.out.println("\n------------------------------");
        System.out.println("conta: " +  this.getNumConta());
        System.out.println("tipo: " +  this.getTipo());
        System.out.println("Dono: " +  this.getDono());
        System.out.println("Saldo: " +  this.getSaldo());
        System.out.println("Status: "  +  this.getStatus());
        
    }
    // Método para abrir a conta
    public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    // Define saldo inicial dependendo do tipo
    if("CC".equals(t)){
        this.setSaldo(50);// Conta Corrente começa com R$50
    } else if ("CP".equals(t)){
        this.setSaldo(150);// Conta Poupança começa com R$150
    }
   } 
   // Método para fechar a conta
   public void fecharConta(){
       if(this.getSaldo() > 0){
           System.out.println("\n A conta não pode ser fechada porque ainda há saldo.");
       } else if (this.getSaldo() < 0){
           System.out.println("\nA conta não pode ser fechada porque há debitos com o banco.");
       } else{
           this.setStatus(false);
           System.out.println("\nA conta foi fechada com sucesso.");
       }
   } 
   // Método para depositar dinheiro na conta
   public void depositar(float v){
       if(this.getStatus()){
        this.setSaldo(this.getSaldo() + v);
           System.out.println("\nDepósito realizado com sucesso na conta de  "  +  this.getDono());
       } else{
           System.out.println("\nNão é possível depositar em uma conta fechada");
       }
   } 
   // Método para sacar dinheiro da conta
   public void sacar(float valor) {
    if (!this.getStatus()) {
        System.out.println("\nNão foi possível realizar saque, a conta está fechada!");
    } else if (this.getSaldo() < valor) {
        System.out.println("\nSaldo insuficiente para saque.");
    } else {
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("\nSaque de R$" + valor + " realizado com sucesso na conta de " + this.getDono());
    }
}
   // Método para pagar a mensalidade da conta
   public void pagarMensalidade(){
       int v = 0;
       // Valor da mensalidade depende do tipo da conta
       if("CC".equals(this.getTipo())) {
           v = 12;
       } else  if("CP".equals(this.getTipo())) {
           v = 20;
       } 
       if(this.getStatus()){
        this.setSaldo(this.getSaldo() - v);
           System.out.println("\nMensalidade paga com sucesso por:" + this.getDono());
       } else{
           System.out.println("\nNão foi possível pagar, conta fechada!");
       }   
   } 
   
   //Construtor da classe (define valores iniciais)
   public ContaBanco(){
      this.saldo = 0; // começa sem dinheiro
      this.status = false;  // começa fechada           
   }
   
   // Métodos getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }   
}
