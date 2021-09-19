
package modelo;

public class Cancion extends Producto{
    //Atributos
    private int idCancion;
    private int duracion;
    private String tieneColaboracion;
    
    //Metodo constructor
    public Cancion(int id, Autor autor, String nombre, int precio, String genero, int idCancion, int duracion, String tieneColaboracion ){
        super(id, autor, nombre, precio, genero);
        this.idCancion = idCancion;
        this.duracion = duracion;
        this.tieneColaboracion = tieneColaboracion;    
    }

    //Metodos Getter y Setter de la clase Cancion
    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTieneColaboracion() {
        return tieneColaboracion;
    }

    public void setTieneColaboracion(String tieneColaboracion) {
        this.tieneColaboracion = tieneColaboracion;
    }
    
    
    
    
}
