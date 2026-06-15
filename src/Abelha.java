public class Abelha {
    private String nome;
    private int idadeDias;

    public Abelha(String nome, int idadeDias){
        this.nome = nome;
        this.idadeDias = idadeDias;
    }

    public String getNome() {
        return nome;
    }

    public int getIdadeDias() {
        return idadeDias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdadeDias(int idadeDias) {
        this.idadeDias = idadeDias;
    }

    public double consumoDiario() {
        return 0;
    }


    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println( "Idade(dias): " + idadeDias);
        System.out.println("Consumo diário: " + consumoDiario() + "mg");

    }
}
