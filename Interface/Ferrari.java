class Ferrari extends Veiculo implements Carro, Automovel {
  public void acelerar(){
    if(velocidade < 300){
      velocidade += 15;
    }
  }

  public void frear(){
    if(velocidade <= 20){
      velocidade = 0;
    }else{
      velocidade -= 20;
    }
  }

  public void trocarMarcha(){
    if(marcha < 6){
      marcha += 1;
    }
  }

  public void nitro(){
    velocidade += 60;
  }
}