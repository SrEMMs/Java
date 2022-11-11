public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Erick");
        pessoa.setEndereco("Rua x, Bairro y");
        pessoa.imprimir();

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Anne");
        pessoaFisica.setEndereco("Rua y, Bairro x");
        pessoaFisica.CPF = "111.111.111-11";
        pessoaFisica.imprimir();

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Empresa A");
        pessoaJuridica.setEndereco("Rua B, Bairro M");
        pessoaJuridica.CNPJ = "222.222.222-22";
        pessoaJuridica.imprimir();
    }
}
