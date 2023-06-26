package stomas.gaudi;

public class Autor extends Persona {
    public String apellido;
    public String nacionalidad;

    public Autor(String nombre, String apellido, String rut, String nacionalidad){
        super(nombre, rut);
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }
}
