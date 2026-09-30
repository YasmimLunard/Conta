/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta;

/**
 *
 * @author YasmimMoreira
 */
public class Conta {

    String titular;
    double saldo;
    
   public Conta(String titular, double saldo){
       this.titular = titular;
       this.saldo = saldo;
   }
   
   public void depositar(double valor){
       this.saldo += valor;
   }
   public void sacar(double valor){
       this.saldo -= valor;
   }
   public void mostrarSaldo(){
       System.out.println(saldo);
   }
           
    
}
