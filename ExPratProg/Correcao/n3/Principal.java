public class Principal {
    public static void main(String[] args) {
        Animal rato = new Animal();
        rato.especie = "Camundongo";
        rato.nome = "Ratatue";
        rato.cor = "Branco";
        rato.raca = "Pequeno";

        rato.imprimirNome();
        rato.imprimirEspecie();
        rato.imprimirCor();
        rato.imprimirRaca();
    }
}
