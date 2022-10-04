import javax.swing.JOptionPane;

public class Animal {
    String especie;
    String nome;
    String raca;
    String cor;

    void imprimir(){
        JOptionPane.showMessageDialog(null, 
            String.format("Especie: %s\nNome: %s\nRaca: %s\nCor: %s",
            especie,
            nome,
            raca,
            cor));
    }
}
