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
public abstract class Veiculo {

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the rodas
     */
    public int getRodas() {
        return rodas;
    }

    /**
     * @param rodas the rodas to set
     */
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    /**
     * @return the numeroLugar
     */
    public int getNumeroLugar() {
        return numeroLugar;
    }

    /**
     * @param numeroLugar the numeroLugar to set
     */
    public void setNumeroLugar(int numeroLugar) {
        this.numeroLugar = numeroLugar;
    }

    protected String placa;
    protected int rodas;
    protected int numeroLugar;

    public abstract void buzinar();

    public void ligar() {
        System.out.println("Ligado\n");
    }

    public void andar() {
        System.out.println("Andando...\n");
    }

    public Veiculo(String placa, int rodas, int numeroLugar) {
        this.placa = placa;
        this.rodas = rodas;
        this.numeroLugar = numeroLugar;
    }

    public void imprimir() {
        System.out.println("placa:" + getPlaca() + "\n" + "Quantidade de lugares:" + getNumeroLugar() + "\n" + "Rodas:" + getRodas());
    }
}
