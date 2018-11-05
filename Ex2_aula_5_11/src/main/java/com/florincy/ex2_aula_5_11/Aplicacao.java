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
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco banco1 = new Banco();
        try{
           banco1.realizarOperação();
        }
        catch(BancoException e){
            System.out.println("Ocorreu um erro:"+e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
}
