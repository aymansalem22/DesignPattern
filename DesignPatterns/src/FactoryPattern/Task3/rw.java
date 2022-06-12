package FactoryPattern.Task3;


//for example i have one  lines asus  to produce asus ==create 2000 laptop from type asus 
//i producr 2000asus same charchatcircs to buy them insted one or only two!!

public class rw {

  public static void main(String[] args) {
      Laptop[] laptops = new Laptop[5000];
      int asusCounter = 2000;
      int acerForGamesCounter = 500;
      int acerForDesignCounter = 500;
      int lenovoCounter = 800;
      int dellCounter = 1200;

      for (int i = 0; i < laptops.length; i++) {

          if (i < asusCounter) {
              laptops[i] = LaptopFactory.createLaptop(Laptop.ASUS);//print 0 - 1999 print this
          } else if (i < asusCounter + acerForGamesCounter) {    //when is 2000 to 2500 print this 
              laptops[i] = LaptopFactory.createLaptop(Laptop.ACERFORGAMES);
          } else if (i < asusCounter + acerForGamesCounter + acerForDesignCounter) {
              laptops[i] = LaptopFactory.createLaptop(Laptop.ACERFORDESIGNERS);
          } else if (i < asusCounter + acerForGamesCounter + acerForDesignCounter + lenovoCounter) {
              laptops[i] = LaptopFactory.createLaptop(Laptop.LENOVO);
          } else {
              laptops[i] = LaptopFactory.createLaptop(Laptop.DELL);
          }
      }
      
      for (Laptop laptop : laptops) {
          laptop.showspeces();
          System.out.println("-------***********------");
      }

  }
}

