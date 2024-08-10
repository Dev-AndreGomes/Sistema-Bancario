/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetouninassau;

/**
 *
 * @author andre
 */
public class ProjetoUninassau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente("1111", "Marcio");
        ContaPoupanca cp = new ContaPoupanca("2222", "Maria");
        
        cc.Depositar(1300.89);
        cc.Sacar(300);
        cc.Status();
        cc.calcularRendimentoMensal();
        
        cp.Depositar(1000);
        cp.Sacar(500.50);
        cp.Status();
        cp.calcRendimentoMensal();
    }
    
}
