class Estoque {

    public static void main(String args[]) {
      Produto produto = new Produto();
      produto.setNome("Paçoca");
      produto.setQuantidade(10);
      produto.setQuantidade(20);
      produto.setQuantidade(-3);
      produto.setQuantidade(5);
      System.out.println(produto.getQuantidade());
    }
  }