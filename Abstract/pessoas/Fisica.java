package pessoas;

import models.Pessoa;

public class Fisica extends Pessoa {

  String cpf;

  public Fisica() {
    super();
    this.cpf = new String();
  }

  public void setCPF(String cpf) {
    this.cpf = cpf;
  }

  public String getCPF() {
    return this.cpf;
  }

  public void imprimir() {
    System.out.println("---===Pessoa Fisica===---");
    System.out.println("Nome: " + super.getNome());
    System.out.println("Endereco: " + super.getEndereco());
    System.out.println("CPF: " + this.getCPF());
  }
}
