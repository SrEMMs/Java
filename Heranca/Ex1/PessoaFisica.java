class PessoaFisica extends Pessoa{
    public String CPF;

    protected void imprimir(){
        super.imprimir();
        System.out.println("CPF: " + this.CPF);
    }
}
