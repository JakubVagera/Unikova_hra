abstract class Zvire {
  public abstract String druh();
  public abstract String poddruh();
  public abstract String pocetNohou();
  public abstract String delaZvuk();
  public String info(){
    return  "Druh: " + this.druh() +  "\n"  + 
      "Poddruh: "+ this.poddruh() + "\n" +
      "Pocet nohou: "+ this.pocetNohou() + "\n" +
      "Dela zvuk: " + this.delaZvuk() + "\n"+ "\n" ;
  }
}