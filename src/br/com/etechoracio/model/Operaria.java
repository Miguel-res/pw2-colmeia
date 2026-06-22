package br.com.etechoracio.model;

import br.com.etechoracio.interfaces.Coleta;
import br.com.etechoracio.interfaces.Defender;

public class Operaria extends Abelha implements Coleta, Defender {
    private double horasVoo;

    public Operaria(String nome, int idadeDias, double horasVoo){
        super(nome, idadeDias);
        this.horasVoo = horasVoo;
    }

    public double getHorasVoo(){
        return horasVoo;
    }

    public void setHorasVoo(double horasVoo) {
        this.horasVoo = horasVoo;
    }

    public double consumoDiario() {
        return 10 + (getHorasVoo() * 2);
    }

    @Override
    public void defenderColmeia() {
        System.out.println(getNome() + ": Defendendo a Colmeia");
    }

    @Override
    public void coletarRecursos() {
        System.out.println(getNome() + ": Coletando Néctar");
    }
}


