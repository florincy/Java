/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

/**
 *
 * @author aluno
 */
public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro c1 = new Carro("ASD-1325", 4, 2, true, true, "Fusca");
        c1.buzinar();
        c1.imprimir();
    }

}
