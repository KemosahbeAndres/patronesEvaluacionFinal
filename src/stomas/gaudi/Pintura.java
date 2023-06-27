package stomas.gaudi;
import java.util.UUID;

public class Pintura {
    public String uid;
    public String nombre;
    public int anio;
    public Autor autor;
    public Tecnica tecnica;
    public Genero genero;
    public Tamanio tamanio;
    public Sala ubicacion;

    public Pintura(String nombre, int anio, Autor autor, Tecnica tecnica, Genero genero, Tamanio tamanio, Sala ubicacion){
        this.uid = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.anio = anio;
        this.autor = autor;
        this.tecnica = tecnica;
        this.genero = genero;
        this.tamanio = tamanio;
        this.ubicacion = ubicacion;
    }

}

