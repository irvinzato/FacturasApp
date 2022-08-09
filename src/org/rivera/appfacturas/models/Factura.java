package org.rivera.appfacturas.models;

import java.util.Date;

public class Factura {

  private int folio;
  private String description;
  private Date date;
  private Cliente client;
  private ItemFactura[] items;
  private int indexItems;

  private static int lastFolio;
  public static final int MAX_ITEMS = 12;

  public Factura(String description, Cliente client) {
    this.description = description;
    this.client = client;
    this.items = new ItemFactura[MAX_ITEMS];
    this.folio = ++lastFolio; //Con pre incremento para que comience en 1
    this.date = new Date();   //Cuando se crea el objeto Factura se crea con la fecha actual
  }

  public int getFolio() {
    return folio;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Cliente getClient() {
    return client;
  }

  public void setClient(Cliente client) {
    this.client = client;
  }

  public ItemFactura[] getItems() {
    return items;
  }

  public void addItemFactura(ItemFactura item) {
    if( indexItems < MAX_ITEMS ) {
      this.items[indexItems++] = item;
    }
  }

  public float calculateTotal() {
    float total = 0.0f;
    for(ItemFactura item: this.items) {
      //Si es null la posición es porque sobraron espacios del arreglo, asi que no debo sumar nada, solo continuar
      if(item == null) {
        continue;
      }
      total += item.calculateAmount();
    }
    return total;
  }

  public String generateDetail() {
    StringBuilder sb = new StringBuilder("Factura N°: ");
    sb.append(folio)
      .append("\nCliente: ")
      .append(this.client.getName())
      .append("\tNIF: ")
      .append(this.client.getNif())
      .append("\nDescripcion: ")
      .append(this.description)
      .append("\n")
      .append("\n#\tNombre\t$\tTotal\n");
    return sb.toString();
  }
}
