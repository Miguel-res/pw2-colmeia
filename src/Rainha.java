public class Rainha extends Abelha {
    private int ovosPorDia;

    public Rainha(String nome, int idadeDias, int ovosPorDia){
        super(nome, idadeDias);
        this.ovosPorDia = ovosPorDia;
    }

    public int getOvosPorDia() {
        return ovosPorDia;
    }

    public void setOvosPorDia(int ovosPorDia) {
        this.ovosPorDia = ovosPorDia;
    }

    public double consumoDiario() {
        return 20 + (getOvosPorDia() * 0.01);
    }

}
