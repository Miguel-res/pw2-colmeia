public class Operaria extends Abelha {
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
}


