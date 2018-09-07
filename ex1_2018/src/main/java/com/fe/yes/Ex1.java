/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fe.yes;

import com.fe.vainafe.CriaPessoa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/**
 *
 * @author simoneflorincy
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        CriaPessoa p1, p2, p3;
        String a;
        Integer b;
        p1 = new CriaPessoa();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome da pessoa 1\n");
        a = in.readLine();
        p1.setNome(a);
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite a idade da pessoa 1\n");
        b = Integer.parseInt(in.readLine());
        p1.setIdade(b);

        p2 = new CriaPessoa();
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome da pessoa 2\n");
        a = in.readLine();
        p2.setNome(a);
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite a idade da pessoa 2\n");
        b = Integer.parseInt(in.readLine());
        p2.setIdade(b);

        p3 = new CriaPessoa();
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome da pessoa 3\n");
        a = in.readLine();
        p3.setNome(a);
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite a idade da pessoa 3\n");
        b = Integer.parseInt(in.readLine());
        p3.setIdade(b);

        if (Objects.equals(p1.idade, p2.idade)) {
            if (Objects.equals(p1.idade, p3.idade)) {
                System.out.println("Geral é velho.");
            }
            if (p1.idade > p3.idade) {
                String nome = p1.getNome();
                String nome2 = p2.getNome();
                System.out.println(nome + " e " + nome2 + " são as pessoas mais velhas");
            } else {
                String nome = p3.getNome();
                System.out.println(nome + " é a pessoa mais velha.");
            }

        } else if (Objects.equals(p1.idade, p3.idade)) {
            if (p1.idade > p2.idade) {
                String nome = p1.getNome();
                String nome2 = p3.getNome();
                System.out.println(nome + " e " + nome2 + " são as pessoas mais velhas");
            } else {
                String nome = p2.getNome();
                System.out.println(nome + " é a pessoa mais velha.");
            }
        } else if (Objects.equals(p2.idade, p3.idade)) {
            if (p2.idade > p1.idade) {
                String nome = p2.getNome();
                String nome2 = p3.getNome();
                System.out.println(nome + " e " + nome2 + " são as pessoas mais velhas");
            } else {
                String nome = p1.getNome();
                System.out.println(nome + " é a pessoa mais velha.");
            }
        } else if (p1.idade > p2.idade) {

            Integer idade = p1.getIdade();
            String nome = p1.getNome();
            if (idade > p3.idade) {
                System.out.println(nome + " é a pessoa mais velha.");
            } else {
                nome = p3.getNome();
                System.out.println(nome + " é a pessoa mais velha.");
            }

        } else {

        }
    }
