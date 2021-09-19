package modelo;

public class Producto {
    //Atributos
    private int id;
    private Autor autor;
    private String nombre;
    private int precio;
    private String genero;
    
    //Metodo constructor
    public Producto(int id, Autor autor, String nombre, int precio, String genero) {
        this.id = id;
        this.autor = autor;
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
    }
    
    //Metodo constructor
    public Producto() {
        
    }
    
    //Metodos Getter y Setter de la clase Producto
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
 
}
