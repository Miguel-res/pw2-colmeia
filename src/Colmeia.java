public class Colmeia {

    private Abelha abelha1;
    private Abelha abelha2;
    private Abelha abelha3;

    public Colmeia(Abelha abelha1, Abelha abelha2, Abelha abelha3) {
        this.abelha1 = abelha1;
        this.abelha2 = abelha2;
        this.abelha3 = abelha3;
    }

    public void rotinaDiaria() {

        abelha1.exibirInfo();
        System.out.println();

        abelha2.exibirInfo();
        System.out.println();

        abelha3.exibirInfo();
        System.out.println();

        double consumoTotal = abelha1.consumoDiario()
                + abelha2.consumoDiario()
                + abelha3.consumoDiario();

        System.out.println("Consumo total diário da colmeia: " + consumoTotal + " mg");
    }

}