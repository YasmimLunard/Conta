/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;


public class TesteConta {
    public static void main (String[]args){
        Conta conta1 = new Conta("Fulano", 100.0);
        
        conta1.mostrarSaldo();
        
        conta1.depositar(50);
        conta1.sacar(30);
        
        conta1.mostrarSaldo();
    }
}
