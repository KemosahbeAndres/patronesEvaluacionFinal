package stomas.gaudi;

public class Sala {
    public String nombre;
    public int lamparas;
    public int temperatura;
    public boolean cierreCentralizado;
    public boolean alarmaIncendio;
    public Encargado encargado;

    public Sala(String nombre, int lamparas, int temperatura, boolean cierreCentralizado, boolean alarmaIncendio, Encargado encargado) {
        this.nombre = nombre;
        this.lamparas = lamparas;
        this.temperatura = temperatura;
        this.cierreCentralizado = cierreCentralizado;
        this.alarmaIncendio = alarmaIncendio;
        this.encargado = encargado;
    }
}
