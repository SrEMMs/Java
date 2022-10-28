import java.util.Date;

class Pessoa {

  int id;
  String nome;
  String cpf;
  Date dataNascimento;
  int peso;

  Pessoa() {
    System.out.println("pessoa 1");
    this.id = 1;
    this.nome = new String();
    this.cpf = new String();
    this.dataNascimento = new Date();
  }

  Pessoa(int id) {
    this(); // Pessoa();
    System.out.println("pessoa 2");
    if(id < 1){ 
      throw new Error("Id deve ser maior que zero");
    }
    this.id = id; // Pessoa.id = id;
  }

  // Erro de compilação
  // Pessoa(int peso) {
  //   System.out.println("pessoa 2");
  //   this.peso = peso;
  // }

  Pessoa(String nome){
    System.out.println("pessoa 3");
    this.nome = nome;
  }

  Pessoa(int id, String nome, int peso){
    this(id); // Pessoa(int)
    System.out.println("pessoa 4");
    this.nome = nome;
    this.peso = peso;
  }

  Pessoa(int id, String nome, String cpf, int peso){
    this(id, nome, peso);
    this.cpf = cpf;
  }

  public static void main(String args[]){
    Pessoa pessoa1 = new Pessoa();
    System.out.println(pessoa1.id);
    System.out.println("-------------------");
    Pessoa pessoa2 = new Pessoa(2);
    System.out.println(pessoa2.id);
    System.out.println("-------------------");
    Pessoa pessoa3 = new Pessoa("Luiz");
    System.out.println("-------------------");
    Pessoa pessoa4 = new Pessoa(1, "Fernando", 77);
    System.out.println("-------------------");
  }
}
