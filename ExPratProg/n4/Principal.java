class Principal {
    public static void main(String[] args) {
        Funcionario funcionario1;
        funcionario1 = new Funcionario();
        funcionario1.nome = "Anne";
        funcionario1.cargo = "Arquiteta";
        funcionario1.salario = 1100;

        funcionario1.imprimir();
    }
    
}