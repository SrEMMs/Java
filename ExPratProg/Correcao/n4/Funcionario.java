public class Funcionario {
    String nome;
    String cargo;
    double salario;
    
    public Funcionario(){
        salario = 1100;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println(String.format("Salario: %.2f", salario));
    }

    public double getSalario(){
        return salario;
    }
}