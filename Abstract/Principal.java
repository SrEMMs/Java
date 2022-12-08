import control.Cadastro;

public class Principal {

  public static void main(String[] args) {
    Cadastro cadastro = new Cadastro();
    cadastro.cadastrarPessoa("Luiz Fernando", "Rua Por ai", "123456789", 'F');
    cadastro.cadastrarPessoa("Souza Guedes", "Rua Por aqui", "1234567890011", 'J');

    cadastro.imprimir();
  }
}
