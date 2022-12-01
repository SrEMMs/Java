class Bicicleta extends Veiculo implements Carro {
  public void acelerar(){
    if(velocidade < 250){
      velocidade += 25;
    }
  }

  public void frear(){
    if(velocidade <= 40){
      velocidade = 0;
    }else{
      velocidade -= 40;
    }
  }
}