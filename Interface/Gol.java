class Gol extends Veiculo implements Carro, Automovel {
  public void acelerar(){
    if(velocidade < 200){
      velocidade += 7;
    }
  }

  public void frear(){
    if(velocidade <= 10){
      velocidade = 0;
    }else{
      velocidade -= 10;
    }
  }

  public void trocarMarcha(){
    if(marcha < 5){
      marcha += 1;
    }
  }
}