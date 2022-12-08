package control;

import java.util.ArrayList;
import models.Pessoa;
import pessoas.*;

public class Cadastro {

  ArrayList<Pessoa> pessoas;

  public Cadastro() {
    this.pessoas = new ArrayList<Pessoa>();
  }

  public void cadastrarPessoa(
    String nome,
    String endereco,
    String documento,
    char tipo
  ) {
    if (tipo == 'F') {
      Fisica pessoa = new Fisica();
      pessoa.setNome(nome);
      pessoa.setEndereco(endereco);
      pessoa.setCPF(documento);

      pessoas.add(pessoa);
    } else {
      Juridica pessoa = new Juridica();
      pessoa.setNome(nome);
      pessoa.setEndereco(endereco);
      pessoa.setCNPJ(documento);

      pessoas.add(pessoa);
    }
  }

  public void imprimir() {
    for (int index = 0; index < this.pessoas.size(); index++) {
      Pessoa pessoa = this.pessoas.get(index);
      
      pessoa.imprimir();
    }
  }
}
