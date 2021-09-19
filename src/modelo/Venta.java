
package modelo;

public class Venta {
    //Atributos
    private int id;
    private Comprador comprador;
    private Producto producto;
    private String fecha;
    
    //Metodo constructor
    public Venta(int id, Comprador comprador, Producto producto, String fecha){
        this.id = id;
        this.comprador = comprador;
        this.producto = producto;
        this.fecha = fecha;
    }

    public Venta() {
        
    }

    //Metodos Getter y Setter de la clase Venta
    public int getId() {
        return id;
    }

    public void setIdVenta(int idVenta) {
        this.id = idVenta;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
