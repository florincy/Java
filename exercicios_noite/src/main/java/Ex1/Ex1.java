/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.Scanner;

Fimport 

*java.io;
 
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome[] = new String[3];
        int idade[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Pessoa" + (i + 1) + "/n");
            nome[i] = input.nextLine();
            System.out.println("Idade" + (i + 1) + "/n");
            idade[i] = input.nextInt();
        }

s    }
