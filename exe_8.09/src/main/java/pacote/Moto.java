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
public class Moto extends Veiculo {

    /**
     * @return the tipoQuidao
     */
    public String getTipoQuidao() {
        return tipoQuidao;
    }

    /**
     * @param tipoQuidao the tipoQuidao to set
     */
    public void setTipoQuidao(String tipoQuidao) {
        this.tipoQuidao = tipoQuidao;
    }

    /**
     * @return the capacetes
     */
    public int getCapacetes() {
        return capacetes;
    }

    /**
     * @param capacetes the capacetes to set
     */
    public void setCapacetes(int capacetes) {
        this.capacetes = capacetes;
    }

    private String tipoQuidao;
    private int capacetes;

    public Moto(String placa, int rodas, int numeroLugar, int capacetes, String tipoQuidao) {
        super(placa, rodas, numeroLugar);
        this.capacetes = capacetes;
        this.tipoQuidao = tipoQuidao;
    }

    @Override
    public void buzinar() {
        System.out.println("FON FON!");
    }

    public void empinar() {
        System.out.println("Empinando\n");
    }
}
