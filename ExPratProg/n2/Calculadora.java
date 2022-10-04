import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int operar;

        System.out.println("Digite o Primeiro numero: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o Segundo numero: ");
        n2 = entrada.nextInt();

        System.out.println("Digite\n1 para Somar\n2 para Subtrair\n3 para Multiplicar\n4 para Dividir ");
        operar = entrada.nextInt();

        Operacao operacao1;
        operacao1 = new Operacao();
        operacao1.n1 = n1;
        operacao1.n2 = n2;
        operacao1.operar = operar;

        operacao1.calc();
    }
    
}