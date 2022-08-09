package org.rivera.appfacturas.models;

public class ItemFactura {
  private int amount;
  private Producto product;

  public ItemFactura(int amount, Producto product) {
    this.amount = amount;
    this.product = product;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public Producto getProduct() {
    return product;
  }

  public void setProduct(Producto product) {
    this.product = product;
  }

  public double calculateAmount() {
    return this.amount * this.product.getPrice();
  }

  @Override
  public String toString() {
    return this.product +
            "\t" + amount +
            "\t" + calculateAmount();
  }
}
