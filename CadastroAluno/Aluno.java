import javax.swing.JOptionPane;

class Aluno{
    String nome;
    String cpf;
    int idade;

    void imprimir(){
    JOptionPane.showMessageDialog(null, 
        String.format("Nome: %s \n Idade: %d \n CPF: %s",
            nome,
            idade,
            cpf
        )
    );
    }
}