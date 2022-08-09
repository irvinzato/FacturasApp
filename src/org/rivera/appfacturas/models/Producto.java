package org.rivera.appfacturas.models;

public class Producto {
  private int code;
  private String name;
  private double price;

  private static int lastCode;

  public Producto() {
    this.code = ++lastCode;
  }

  public int getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return  this.code +
            "\t" + this.name +
            "\t" + this.price;
  }
}
