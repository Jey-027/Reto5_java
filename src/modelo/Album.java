
package modelo;

public class Album extends Producto {
    //Atributos
    private int id_album;
    private int num_canciones;
    private double raiting;
    
    //Metodo Constructor
    public Album(int id, Autor autor, String nombre, int precio, String genero,int id_album, int num_canciones, double raiting){
        super(id, autor, nombre, precio, genero);
        this.id_album = id_album;
        this.num_canciones = num_canciones;
        this.raiting = raiting;
    }

    //Metodos Getter y Setter de la clase Album
    public int getId_album() {
        return id_album;
    }

    public void setId_album(int id_album) {
        this.id_album = id_album;
    }

    public int getNum_canciones() {
        return num_canciones;
    }

    public void setNum_canciones(int num_canciones) {
        this.num_canciones = num_canciones;
    }

    public double getRaiting() {
        return raiting;
    }

    public void setRaiting(double raiting) {
        this.raiting = raiting;
    }
    
    
    
    
}
