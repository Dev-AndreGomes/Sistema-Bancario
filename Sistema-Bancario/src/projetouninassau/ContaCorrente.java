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
public class ContaCorrente extends ContaBancaria{
    
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular) {
        super(numeroConta, titular);
        this.limiteChequeEspecial = 1200.50;
    }
    
    public void Status(){
        System.out.println("----- STATUS -----");
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.printf("Saldo: %.2f\n", this.saldo);
        System.out.println("Limete de cheque especial: " + this.limiteChequeEspecial);
    }
    
    public void calcularRendimentoMensal(){
        System.out.println("A conta corrente não há rendimento mensal");
    }

    @Override
    public void Depositar(double v){
        this.setSaldo(this.getSaldo() + v);
    }

    @Override
    public void Sacar(double v) {
        if (this.getSaldo() > 0) {
            this.setSaldo(this.getSaldo() - v);
        } else {
            System.out.println("Saldo indisponivel para saque");
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
}

