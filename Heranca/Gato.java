class Gato extends Animal{

    public String tipo;

    public Gato(){
        //super.setRaca("Gato");
        super.raca = "Gato";
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo: " + tipo);
    }
}