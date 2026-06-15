public class Zangao extends Abelha {
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

}
