package stomas.gaudi;

public class Encargado extends Persona{
    public String profesion;
    public int anioIngreso;

    public Encargado(String nombre, String rut, String profesion, int anioIngreso){
        super(nombre, rut);
        this.profesion = profesion;
        this.anioIngreso = anioIngreso;
    }
}
