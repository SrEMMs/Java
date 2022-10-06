public class Principal {
    public static void main(String[] args) {
        Contato mae = new Contato();
        mae.nome = "Mãe Joana";
        mae.telefone = "352525112";
        mae.idade = 42;

        Contato pai = new Contato();
        pai.nome = "Pai João";
        pai.telefone = "32121222";
        pai.idade = 45;

        System.out.println("Nome da Mãe: "+mae.nome);
        System.out.println("Telefone: " + mae.telefone);
        System.out.println("Idade: " + mae.idade);

        System.out.println("Nome do Pai: " + pai.nome);
        System.out.println("Telefone: " + pai.telefone);
        System.out.println("Idade: " + pai.idade);
    }
}
