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
public class Caminhao extends Veiculo {

    /**
     * @return the carga
     */
    public double getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(double carga) {
        this.carga = carga;
    }

    private double carga;

    public Caminhao(String placa, int rodas, int numeroLugar, double cargao) {
        super(placa, rodas, numeroLugar);
        this.carga = cargao;
    }

    @Override
    public void buzinar() {
        System.out.println("ZUUMM ZUUM!\n");
    }

    public void pararNaLanchonete() {
        System.out.println("Comendo hamburguer.\n");
    }
}
