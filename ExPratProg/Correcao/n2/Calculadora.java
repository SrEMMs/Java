class Calculadora {
    void somar(int numero_1, int numero_2){
        System.out.println("Resultado: " + (numero_1 + numero_2));
    }

    void subtrair(int numero_1, int numero_2){
        System.out.println("Resultado: " + (numero_1 - numero_2));
    }

    void dividir(int numero_1, int numero_2){
        if(numero_2 == 0){
            System.out.println("Divisao por Zero nao existe!!!");
        } else{
            System.out.println("Resultado: " + (numero_1 / numero_2));
        }
    }

    void multiplicar(int numero_1, int numero_2){
        System.out.println("Resultado:" + (numero_1 * numero_2));
    }
    
}