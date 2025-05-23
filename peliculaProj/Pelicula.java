package peliculaProj;

public class Pelicula {
    // Atributos
    private String nombre;
    private String director;
    private Tipo genero;   // enumeración
    private int duracion; // 
    private int ano;
    private double calificacion; //

    // Constructor
    public Pelicula(String nombre, String director, Tipo genero, int duracion, int ano, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.ano = ano;
        this.calificacion = calificacion;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    protected void setDirector(String director) {
        this.director = director;
    }

    public Tipo getGenero() {
        return genero;
    }

    protected void setGenero(Tipo genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    protected void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAno() {
        return ano;
    }

    protected void setAno(int ano) {
        this.ano = ano;
    }

    public double getCalificacion() {
        return calificacion;
    }

    protected void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // Metodos adicionales
    public void imprimir() {
        System.out.println("Película: " + nombre);
        System.out.println("Directór: " + director);
        System.out.println("Genéro: " + genero);
        System.out.println("Duración: " + duracion);
        System.out.println("Año: " + ano);
        System.out.println("Calificación: " + calificacion);
    }

    protected boolean esPeliculaEpica() {
        // Consideramos epica una pelicula que dura más de 180 minutos (3 horas)
        return duracion >= 180;
    }

    protected String calcularValoracion() {
        if (calificacion >= 9.0) {
            return "Excelente";
        } else if (calificacion >= 7.0) {
            return "Buena";
        } else if (calificacion >= 5.0) {
            return "Regular";
        } else {
            return "Mala";
        }
    }

    public boolean esSimilar(Pelicula pelicula) {
        // Consideramos similares peliculas del mismo genero y con calificacion similar
        return this.genero == pelicula.genero && 
               Math.abs(this.calificacion - pelicula.calificacion) <= 1.0;
    }
}

// Enum para los generos
enum Tipo {
    ACCION,
    COMEDIA,
    DRAMA,
    CIENCIA_FICCION,
    TERROR,
    ROMANCE,
    ANIMACION,
    DOCUMENTAL,
    FANTASIA,
    SUSPENSO
}