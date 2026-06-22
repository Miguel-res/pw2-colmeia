package br.com.etechoracio.model;

import br.com.etechoracio.interfaces.Defender;
import com.sun.source.tree.DefaultCaseLabelTree;

public class Zangao extends Abelha implements Defender {
    private int voosAcasalamento;

    public Zangao(String nome, int idadeDias, int voosAcasalamento){
        super(nome, idadeDias);
        this.voosAcasalamento = voosAcasalamento;
    }

    public int getVoosAcasalamento(){
        return voosAcasalamento;
    }

    public void setVoosAcasalamento(int voosAcasalamento){
        this.voosAcasalamento = voosAcasalamento;
    }

    public double consumoDiario(){
        return 15 + (getVoosAcasalamento() * 3);
    }

    @Override
    public void defenderColmeia() {
        System.out.println(getNome() + ": Defendendo Colmeia");
    }
}
