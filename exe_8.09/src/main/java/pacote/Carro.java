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
public class Carro extends Veiculo {

    /**
     * @return the portas4
     */
    public boolean isPortas4() {
        return portas4;
    }

    /**
     * @param portas4 the portas4 to set
     */
    public void setPortas4(boolean portas4) {
        this.portas4 = portas4;
    }

    /**
     * @return the radio
     */
    public boolean isRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private boolean portas4;
    private boolean radio;
    private String modelo;

    public Carro(String placa, int rodas, int numeroLugar, boolean portas4, boolean radio, String modelo) {
        super(placa, rodas, numeroLugar);
        this.modelo = modelo;
        this.portas4 = portas4;
        this.radio = radio;
    }

    @Override
    public void buzinar() {
        System.out.println("BIBI!\n");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("portas:" + isPortas4() + "\n" + "rádio:" + isRadio() + "\n" + "modelo:" + getModelo() + "\n");
    }

}
