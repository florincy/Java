
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class ContaBancaria {

    /**
     * @return the numConta
     */
    public int getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the ativa
     */
    public boolean getAtiva() {
        return ativa;
    }

    /**
     * @param ativa the ativa to set
     */
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

     private int numConta;
     private boolean ativa;
     private double saldo;
    
    public  ContaBancaria(int numConta){
    this.numConta = numConta;
}
    public ContaBancaria (int numConta, boolean ativa){
        this.numConta = numConta;
        this.ativa = ativa;
    }
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }
}


