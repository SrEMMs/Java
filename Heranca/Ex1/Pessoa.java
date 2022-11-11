class Pessoa {
    private String nome;
    private String endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    private void imprimirNome(){
        System.out.println("Nome: " + this.nome);
    }

    private void imprimirEndereco(){
        System.out.println("Endereco: " + this.endereco);
    }

    protected void imprimir(){
        System.out.println("==============================");
        this.imprimirNome();
        this.imprimirEndereco();
    }

    
}