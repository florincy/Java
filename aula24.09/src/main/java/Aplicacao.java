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
        boolean estado;
        boolean estado2;
        ContaBancaria conta = new ContaBancaria(1234,true);
        estado = conta.getAtiva();
        conta.setSaldo(1500.00);
        String a1 = "CONTA ATIVA";
        String a2 = "CONTA  INATIVA";
        
        ContaBancaria conta2 = new ContaBancaria(12345,false);
        estado2 = conta2.getAtiva();
        conta2.setSaldo(2000.00);
        
        
        System.out.println("Informações da conta 1\n");
        if (estado = true) {
            System.out.println(a1);
        } else  if (estado = false){
            System.out.println(a2);
        }
        System.out.println("Número de conta:" + conta.getNumConta() + "\n" + "Saldo: R$" + conta.getSaldo() + "\n");
        System.out.println("Informações da conta 2\n");
        if (estado2 = true) {
            System.out.println(a1);
        } else if (estado = false){
            System.out.println(a2);
        }
        
        System.out.println("Número de conta:" + conta2.getNumConta() + "\n" + "Saldo: R$" + conta2.getSaldo() + "\n");
    }

}
