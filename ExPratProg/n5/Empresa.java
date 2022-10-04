import java.util.Scanner;

import javax.swing.JOptionPane;

public class Empresa {
    public String nomeFantasia;
    public String razaoSocial;
    private String CNPJ;
    float faturamento;
    
    public static void main(String[] args) {       
        Empresa empresa1 = new Empresa();
        empresa1.nomeFantasia = "Master Solucao";
        empresa1.razaoSocial = "Master Ltda";
        empresa1.CNPJ = "00.000.000-0001/00";
        empresa1.faturamento = 10000;

        empresa1.imprimir();
        empresa1.inserir(); 
        empresa1.imprimir();
    }

    void inserir(){
        String cnpj2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o CNPJ da empresa: ");
        cnpj2 = entrada.nextLine();

        CNPJ = cnpj2;
    }

    void imprimir(){
        JOptionPane.showMessageDialog(null, 
        String.format("Empresa: %s\nRazao Social: %s\n CNPJ: %s\nFaturamento: %.2f", 
        nomeFantasia, 
        razaoSocial, 
        CNPJ, 
        faturamento));
    }
}