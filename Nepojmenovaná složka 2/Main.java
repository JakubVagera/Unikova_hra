class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Zvire cow = new Cow ();
    System.out.print(cow.info());
    Zvire pig = new Pig ();
    System.out.print(pig.info());
    Zvire raven = new Raven ();
    System.out.print(raven.info());
  }
}