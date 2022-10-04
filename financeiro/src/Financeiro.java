import receitas.Recebido;

class Financeiro {
    public static void main(String args[]){
        Recebido recibo = new Recebido();
        recibo.valor = 15;
        recibo.tipo.descricao = "Test";
        System.out.println(recibo.tipo.descricao);
    }
}
