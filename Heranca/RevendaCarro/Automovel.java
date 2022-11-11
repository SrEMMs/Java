class Automovel {
    private String chassi;
    private String tipoPneu;
    private String tipoCombustivel;
    public String modelo;
    public String placa;

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setTipoPneu(String tipoPneu) {
        this.tipoPneu = tipoPneu;
    }

    public void setTipoCombustivel(String tipo) {
        switch (tipo) {
            case "Gasolina":
                this.tipoCombustivel = "G";
                break;

            case "Etanol":
                this.tipoCombustivel = "E";
                break;

            case "Gas":
                this.tipoCombustivel = "S";
                break;

            case "Flex":
                this.tipoCombustivel = "F";
                break;
            
            case "Total Flex":
                this.tipoCombustivel = "T";
                break;
            default:
                System.out.println("Tipo Inválido!");
                break;
        }
    }

    public String getChassi() {
        return this.chassi;
    }   

    public String getTipoPneu() {
        return this.tipoPneu;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }
}