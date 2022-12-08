package pessoas;

import models.Pessoa;

public class Juridica extends Pessoa {

  String cnpj;

  public Juridica() {
    super();
    this.cnpj = new String();
  }

  public void setCNPJ(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getCNPJ() {
    return this.cnpj;
  }

  public void imprimir() {
    System.out.println("---===CNPJ:  " + this.getCNPJ() + "===---");
    System.out.println("Nome: " + super.getNome());
    System.out.println("Endereco: " + super.getEndereco());
    System.out.println();
  }
}
