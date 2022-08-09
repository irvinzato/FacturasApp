package org.rivera.appfacturas;
import org.rivera.appfacturas.models.*;
import java.util.Scanner;

public class FacturaEjemplo {
  public static void main(String[] args) {
    Cliente client = new Cliente();
    client.setNif("123-123");
    client.setName("Mauricio");

    Scanner s = new Scanner(System.in);
    System.out.println("Ingresa la descripcion de la factura: ");
    String desc = s.nextLine();
    Factura invoice = new Factura(desc, client);

    Producto product;
    String nameProduct;
    float priceProduct;
    int amountProduct;

    //Cantidad de productor que voy a crear
    for( int i = 0; i < 5; i++ ) {
      product = new Producto();
      System.out.print("Producto numero " + product.getCode() + " : ");
      //"next()" solo admite una palabra(ep.168)
      nameProduct = s.next();
      product.setName(nameProduct);

      System.out.print("Ingresa el precio: ");
      priceProduct = s.nextFloat();
      product.setPrice(priceProduct);

      System.out.print("Cantidad a comprar: ");
      amountProduct = s.nextInt();
      ItemFactura item = new ItemFactura(amountProduct, product);
      invoice.addItemFactura(item);

      System.out.println();
    }

    System.out.println("Detalles generados...");
    System.out.println(invoice.generateDetail());
    //Otra manera de mostrar y usar el toString
    //System.out.println(invoice);

  }
}
