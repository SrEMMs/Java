class Operacao {
    int n1;
    int n2;
    float res;
    int operar;
    
    void calc(){
        if (operar == 1){
            soma();
        } else if (operar == 2){
            subtrair();
        } else if (operar == 3){
            multiplicar();
        } else if (operar == 4){
            dividir();
        } else{
            System.out.println("ERROR!!!\nDigite uma opcao valida!");
        }
    }

    void soma(){
        res = n1 + n2;
        System.out.println("O resultada da Soma de " + n1 + " + " + n2 + " = " + res);
    }

    void subtrair(){
        res = n1 - n2;
        System.out.println("Resultado da Subtracao de " + n1 + " - " + n2 + " = " + res);
    }

    void multiplicar(){
        res = n1 * n2;
        System.out.println("Resultado da Multiplicacao de " + n1 + " * " + n2 + " = " + res);
    }

    void dividir(){
        res = n1 / n2;
        System.out.println("Resultado da Divisao de " + n1 + " / " + n2 + " = " + res);
    }
}
