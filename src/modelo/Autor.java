
package modelo;

public class Autor {
    //Atributos
    private int id;
    private String nombre;
    private String nacionalidad;
    private String tipo;
    
    //Metodo Constructor
    public Autor(int id, String nombre, String nacionalidad, String tipo){
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.tipo = tipo;
    }
    
    //Metodos Getter y Setter de la clase Autor
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
