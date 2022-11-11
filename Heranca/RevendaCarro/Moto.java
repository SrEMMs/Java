class Moto extends Automovel{
    public String posicaoPilotagem;
    public String tipoDescanso;
    public String tipoPedaleira;

    public void setTipoCombustivel(String tipo){
        if(tipo == "Diesel"){
            System.out.println("Inválido");
        } else {
            super.setTipoCombustivel(tipo);
        }
    }
}
