class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNome("Mico Leão");
        animal.setRaca("Macaco");
        animal.setTamanho(1.20);

        animal.imprimir();

        Gato gato = new Gato();
        gato.setNome("Gato Branco");
        gato.imprimir();
    }    
}
