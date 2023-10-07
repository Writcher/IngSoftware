/** Este es un comentario de ejemplo Javadoc para probar Checkstyle */
public class Producto {
    private String nombre;
    private double precio;
    private Genero genero;
    private Marca marca;
    public Producto(){}
    public Producto(String nombre){
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
    public void setPrecioProducto(double precio) {
        this.precio = precio;
    }
    public double getPrecioProducto() {
        return precio;
    }
    public void setNombreProducto(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreProducto() {
        return nombre;
    }
}