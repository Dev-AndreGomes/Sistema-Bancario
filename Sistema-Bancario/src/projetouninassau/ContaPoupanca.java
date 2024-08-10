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
public class ContaPoupanca extends ContaCorrente {
    
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, String titular) {
        super(numeroConta, titular);
        this.taxaRendimento = 0.03;
    }
    
    public void Status(){
        System.out.println("----- STATUS -----");
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.printf("Saldo: %.2f\n", this.saldo);
        System.out.println("Taxa de rendimento: " + this.taxaRendimento);
    }
    
    public void calcRendimentoMensal(){
        if (this.saldo > 0){
        System.out.printf("No começo do proximo mês o seu saldo tera rendido: %.2f\n", this.getSaldo() * this.taxaRendimento);
        } else {
            System.out.println("Para ter o rendimento mensal você precisa ter dinheiro em sau conta");
        }
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    
}
