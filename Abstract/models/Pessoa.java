package models;

public abstract class Pessoa {

  String nome;
  String endereco;

  public Pessoa() {
    this.nome = new String();
    this.endereco = new String();
  }

  public String getNome() {
    return this.nome;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public abstract void imprimir();
}
