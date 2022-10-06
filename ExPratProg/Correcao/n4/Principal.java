public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Erick Melo";
        funcionario.cargo = "Dev. Frontend Angular";
        funcionario.salario = 5620;

        funcionario.imprimir();
        float salario_erick = funcionario.getSalario();
        System.out.println("Salario do Erick: " + salario_erick);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Salma Melo";
        funcionario2.cargo = "Dev. Backend Python";

        funcionario2.imprimir();
        float salario_salma = funcionario.getSalario();
        System.out.println("Salario do Erick: " + salario_salma);
    }
}
