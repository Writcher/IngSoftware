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

  @Test
  public void testPrecioProducto() {
    Producto producto = new Producto();
    try {
      producto.setPrecioProducto(10.0);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    double precio = producto.getPrecioProducto();
    assertEquals(10.0, precio, 0.0);
  }

  @Test
  public void testDecimalesProductoPrecio() {
    Producto producto = new Producto();
    try {
      producto.setPrecioProducto(20.00);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    String precioString = String.format("%.2f", producto.getPrecioProducto());
    double precioValidado = Double.parseDouble(precioString);
    assertEquals(producto.getPrecioProducto(), precioValidado, 0.001);
  }

  @Test
  public void testIntegracionAPIConvetidor(){
    try{
      ConvertirUSD convertidor = new ConvertirUSD();
      double cantPesos = 1000;
      double cantUSD = convertidor.convertirARSaUSD(cantPesos);
      assertTrue(cantUSD > 0);
    }catch (Exception e){ 
      e.printStackTrace();
    }

  }
}
