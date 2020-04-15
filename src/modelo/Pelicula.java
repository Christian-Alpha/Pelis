package modelo;

public class Pelicula {
    private String nombre;
    private String director;
    private int año;
    private String reseña;
    private int entrada;
    
    public Pelicula(String nombre, String director, int año, String reseña){
        this.nombre = nombre;
        this.director = director;
        this.año = año;
        this.reseña = reseña;
    }
    public String sumaTotal(){
            return ("Nombre; " + nombre  );
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the reseña
     */
    public String getReseña() {
        return reseña;
    }

    /**
     * @param reseña the reseña to set
     */
    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    /**
     * @return the entrada
     */
    public int getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
}
