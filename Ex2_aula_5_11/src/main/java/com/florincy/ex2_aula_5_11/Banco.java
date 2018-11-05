/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.florincy.ex2_aula_5_11;

/**
 *
 * @author aluno
 */
public class Banco {

    public void realizarOperação() throws BancoException {
        ContaBancaria c = new Contabancaria(1000);
        try {
            c.sacar(-50);
        System.out.println("Saque foi realizado com sucesso");
        System.out.println(c.getSaldo());
        }
        catch (ValorNegativoException e){
            throw new BancoException ("Erro de saque: valor negativo",e);
        }
        catch (SaldoInsuficienteException e){
            throw new BancoException ("Erro de saque: saldo insuficiente",e)
        }
    }
}
@SuppressWarnings ("serial")
public class BancoException extends Exception {
    public BancoException (){}
    public BancoException (String menssage);{super (message);}
    public BancoException (Throwable cause){super (cause);}
    public BancoException (String message, throwable cause){super (message, cause);}
    public BancoException (String message,Throwable cause,boolean enable Suppression, boolean Writable Stack Trace){
    super (message, cause, enable Suppression, WritableStackTrace)}
}
}