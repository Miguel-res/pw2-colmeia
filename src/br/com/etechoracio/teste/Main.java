import br.com.etechoracio.model.*;

void main() {

    Abelha abelha1 = new Operaria("Mel", 20, 5);
    Abelha abelha2 = new Rainha("Rainha", 365, 1500);
    Abelha abelha3 = new Zangao("Zeca", 30, 2);

    System.out.println("Mel");
    ((Operaria) abelha1).coletarRecursos();
    ((Operaria) abelha1).defenderColmeia();

    System.out.println("Zeca");
    ((Zangao) abelha3).defenderColmeia();

    System.out.println("Rainha não tem nenhuma habilidade especial");



    Colmeia colmeia = new Colmeia(abelha1, abelha2, abelha3);

    colmeia.rotinaDiaria();

}