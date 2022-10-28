class Produto{
    private String nome;
    private int quantidade;
  
    public void setNome(String nome){
      this.nome = nome;
    }
  
    public String getNome(){
      return this.nome;
    }
  
    public void setQuantidade(int qtde){
      this.quantidade = this.quantidade + qtde;
    }
  
    public int getQuantidade(){
      return this.quantidade;
    }
  }
  
  
  