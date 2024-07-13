public class Lampada{
  private boolean ligada;

  public Lampada(boolean ligada){
    this.ligada= false;
  }
  

  public void ligar(){
    this.ligada =  true;
  }
  public void desligar(){
    this.ligada = false;
  }

  public String detalhes() {
    if(ligada){
      return "Lampada: Ligada" ;
  } else {
        return "Lampada: Desligada";
  }
  }
}