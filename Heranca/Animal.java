class Animal {

    private int id;
    private String nome;
    protected String raca;
    public double tamanho;

    private void imprimirNome(){
        System.out.println("Nome: " + this.nome);
    }

    private void imprimirRaca(){
        System.out.println("Raca: " + this.raca);
    }
    
    
    private void imprimirTamanho(){
        System.out.println("Tamanho: " + this.tamanho);
    }

    protected void imprimir(){
        System.out.println("---===Animal===---");
        this.imprimirNome();
        this.imprimirRaca();
        this.imprimirTamanho();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
}