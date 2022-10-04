import javax.swing.JOptionPane;

public class Funcionario {
    String nome;
    String cargo;
    float salario;

    void imprimir(){
        JOptionPane.showMessageDialog(null,
            String.format("Nome: %s\nCargo: %s\nSalario: R$%.2f", nome, cargo, salario));
    }
}
