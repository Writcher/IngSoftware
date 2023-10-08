import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producto {
  private String nombre;
  private double precio;
  private double precio_usd;
  private Genero genero;
  private Marca marca;

  public Producto() {}

  public Producto(String nombre) {
    this.nombre = nombre;
  }

  public void setGeneroProducto(Genero genero) {
    this.genero = genero;
  }

  public Genero getGeneroProducto() {
    return genero;
  }

  public void setMarcaProducto(Marca marca) {
    this.marca = marca;
  }

  public Marca getMarcaProducto() {
    return marca;
  }

  public void setPrecioProducto(double precio) throws Exception {
    this.precio = precio;
    
    //Setear en USD
    ConvertirUSD convertidor = new ConvertirUSD();
    precio_usd = convertidor.convertirARSaUSD(precio);
    this.precio_usd = precio_usd;
  }

  public double getPrecioProducto() {
    return precio;
  }
  
  public double getPrecioUSDProducto() {
    return precio_usd;
  }

  public void setNombreProducto(String nombre) {
    this.nombre = nombre;
  }

  public String getNombreProducto() {
    return nombre;
  }
}
