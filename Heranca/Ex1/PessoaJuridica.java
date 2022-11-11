class PessoaJuridica extends Pessoa {
    public String CNPJ;

    protected void imprimir(){
        super.imprimir();
        System.out.println("CNPJ: " + this.CNPJ);
    }
}
