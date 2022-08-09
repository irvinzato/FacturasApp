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
}
