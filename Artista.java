package evf.javadoc.original;
// HOLAAAAAAAAAAAAAAAAAAAAA mi nombre es raul
public class Artista {
    String nombreArtista;
	//
    public Artista(String nombreArtista) {
	//Hola
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }

    public void setNombreArtista(String nombre) {
	nombreArtista = nombre;
    }
    
}


