void main() {

    Abelha abelha1 = new Operaria("Mel", 20, 5);
    Abelha abelha2 = new Rainha("Rainha", 365, 1500);
    Abelha abelha3 = new Zangao("Zeca", 30, 2);

    Colmeia colmeia = new Colmeia(abelha1, abelha2, abelha3);

    colmeia.rotinaDiaria();

}