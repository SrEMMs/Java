class Carro {
    int id;
    String modelo;
    int ano;
    
    Carro(){
        this.id = 0;
    }

    Carro(int id){
        if(this.id > 0){
            this.id = id;
        }
        System.out.println("Id deve ser maior que zero.");
    }

    Carro(int id, String modelo){
        this.id = id;
        this.modelo = modelo;
    }

    Carro(int id, String modelo, int ano){
        this.id = id;
        this.modelo = modelo;
        this.ano = ano;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
    }
}
