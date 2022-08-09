package org.rivera.appfacturas.models;

public class Cliente {
  private String name;
  private String nif; //número de identificación fiscal

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNif() {
    return nif;
  }

  public void setNif(String nif) {
    this.nif = nif;
  }
}
