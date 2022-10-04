package receitas;

import java.util.Date;

public class Recebido {
    public float valor;
    String descricao;
    Date data;
    public TipoReceita tipo;
    

    public Recebido(){
        descricao = new String();
        tipo = new TipoReceita();
    }
}