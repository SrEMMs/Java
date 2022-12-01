import java.util.ArrayList;

class Principal {

  public static void main(String args[]){
    ArrayList<Carro> carros = new ArrayList<Carro>();
    ArrayList<Automovel> automoveis = new ArrayList<Automovel>();
    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    Gol gol = new Gol();
    Ferrari ferrari = new Ferrari();
    Veiculo veiculo = new Veiculo();
    Bicicleta bike = new Bicicleta();

    carros.add(gol);
    carros.add(ferrari);
    carros.add(bike);

    automoveis.add(gol);
    automoveis.add(ferrari);

    veiculos.add(gol);
    veiculos.add(ferrari);

    for(int i = 0 ; i < carros.size() ; i++){
      carros.get(i).acelerar();
      carros.get(i).acelerar();
      carros.get(i).acelerar();
    }

    for(int i = 0 ; i < automoveis.size() ; i++){
      automoveis.get(i).trocarMarcha();
      automoveis.get(i).trocarMarcha();
      automoveis.get(i).trocarMarcha();
      automoveis.get(i).trocarMarcha();
      automoveis.get(i).trocarMarcha();
      automoveis.get(i).trocarMarcha();
      automoveis.get(i).trocarMarcha();
      automoveis.get(i).trocarMarcha();
      automoveis.get(i).trocarMarcha();
      automoveis.get(i).trocarMarcha();
    }

    System.out.println("Velocidade Gol:" + gol.velocidade);
    System.out.println("Marcha Gol:" + gol.marcha);
    ferrari.nitro();
    System.out.println("Velocidade Ferrari:" + ferrari.velocidade);
    System.out.println("Marcha Ferrari:" + ferrari.marcha);
  }
}