import static org.junit.Assert.*;
import org.junit.Test;

public class JavaTest {
  @Test
  public void testNombreProducto() {
    Producto producto = new Producto("Remera");
    String nombre = producto.getNombreProducto();
    assertNotNull(nombre);
    assertFalse(nombre.isEmpty());
  }
  
  public void testPrecioProducto() {
    Producto producto = new Producto();
    producto.setPrecioProducto(10.0);
    double precio = producto.getPrecioProducto();
    assertEquals(10.0, precio, 0.0);
  }

  public void testDecimalesProductoPrecio() {
    Producto producto = new Producto();
    producto.setPrecioProducto(20.00);
    String precioString = String.format("%.2f", producto.getPrecioProducto());
    double precioValidado = Double.parseDouble(precioString);
    assertEquals(producto.getPrecioProducto(), precioValidado, 0.001);
  }
}
