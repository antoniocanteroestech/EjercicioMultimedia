package es.estech.acantero;

public class Pelicula extends Multimedia {

    private String actor;
    private String actriz;

    public Pelicula(String titulo, String autor, Formato formato, double duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        this.actor = actor;
        this.actriz = actriz;
    }

    public Pelicula(String titulo, String autor, Formato formato, double duracion, String actor) {
        super(titulo, autor, formato, duracion);
        this.actor = actor;
    }

    public Pelicula(String actriz, String titulo, String autor, Formato formato, double duracion) {
        super(titulo, autor, formato, duracion);
        this.actriz = actriz;
    }


    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActriz() {
        return actriz;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }

    @Override
    public String toString() {

        String result = "Pelicula: " +
                "titulo='" + titulo + '\'' +
                "autor='" + autor + '\'' +
                "formato=" + formato +
                "duracion=" + duracion
                ;

        if (this.actor != null)
            result += "actor= " + actor + '\'' ;

        if (this.actriz != null)
            result += "actriz= " + actriz + '\'' ;


        return result;
    }
}
