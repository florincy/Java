/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.florincy.aula151018;

/**
 *
 * @author aluno
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica m = new Matematica (); // Static pertence à classe, por isso, não precisa instanciar
        int soma = m.somar(10,6);
        int subtrai = m.subtrair (30,15);
        System.out.println("Soma: "+ soma);
        System.out.println("\nSubtração: "+subtrai);
        // TODO code application logic here
        System.out.println(Contador.valor);
        Contador.incrementar();
        System.out.println(Contador.valor);
        System.out.println(Contador.getValor());
        double media = Constantes.MEDIA_DA_PROVA;
        System.out.println(media);
        
    }
    
}
// variável estática  = método estático