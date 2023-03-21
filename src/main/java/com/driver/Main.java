package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getBasePrice());
    dp.setPaperBagAdded();
    dp.setCheeseAdded();
    dp.setPaperBagAdded();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.setCheeseAdded();
    p.setToppingAdded();
    p.setPaperBagAdded();
    System.out.println(p.getBill());
  }
}