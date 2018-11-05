/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.florincy.aula5_11;

/**
 *
 * @author aluno
 */
public class Aplicação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Object o1 = new Object();
        Object o2 = new Object();
        try {
            boolean iguais = Comparador.comparar(null,02);
            System.out.println(iguais);
        }
        catch(NullPointerException e) {
            System.out.println("O objeto é nulo");
        }
        
    }
    
}
