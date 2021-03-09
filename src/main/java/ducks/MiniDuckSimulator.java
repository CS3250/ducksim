class MiniDuckSimulator {

  public static void main(String args[]) {

    Duck rhd = new RedheadDuck();
    rhd.display();
    System.out.println(rhd.quack());
    rhd.swim();

    Duck bd = new BlueDuck();
    bd.display();
    System.out.println(bd.quack());
    bd.swim();

    Duck md = new MallardDuck();
    md.display();
    System.out.println(md.quack());
    md.swim();
  }
}
