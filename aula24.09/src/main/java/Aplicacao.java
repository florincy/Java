/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ContaBancaria conta = new ContaBancaria(1234, true);
        conta.setSaldo(1500.00);
        ContaBancaria conta2 = new ContaBancaria(12345, false);
        conta2.setSaldo(2000.00);

        System.out.println("Informações da conta 1\n");

        System.out.println("Conta ativa: " + conta.getAtiva() + "\n" + "Número de conta:" + conta.getNumConta() + "\n" + "Saldo: R$" + conta.getSaldo() + "\n");

        System.out.println("Conta ativa: " + conta2.getAtiva() + "\n" + " Número de conta:" + conta2.getNumConta() + "\n" + "Saldo: R$" + conta2.getSaldo() + "\n");

        conta.sacar(110.00);
        conta.depositar(200.00);
        System.out.println("Informações da conta 1\n");

        System.out.println("Conta ativa: " + conta.getAtiva() + "\n" + "Número de conta:" + conta.getNumConta() + "\n" + "Saldo: R$" + conta.getSaldo() + "\n");

        System.out.println("Conta ativa: " + conta2.getAtiva() + "\n" + " Número de conta:" + conta2.getNumConta() + "\n" + "Saldo: R$" + conta2.getSaldo() + "\n");
    }

}
