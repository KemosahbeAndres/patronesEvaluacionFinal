package stomas.tests;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import stomas.gaudi.*;

public class GaudiTest extends TestCase {

    private Sala _sala;
    private Encargado _encargado;
    private Pintura _pintura;

    public GaudiTest(String name){
        super(name);
    }

    protected void setUp(){
        this._encargado = new Encargado("Encargado", "12345678-9", "Contador", 1997);
        this._sala = new Sala("Sala 1", 4, 20, true, true, _encargado);

        Autor autor = new Autor("Leonardo","da Vinci", "123456789", "Italia");
        Tamanio tamanio = new Tamanio(120, 90);
        this._pintura = new Pintura("La Mona Lisa", 1503, autor, Tecnica.Oleo, Genero.Retrato, tamanio, this._sala);
    }

    protected void tearDown(){
        this._encargado = null;
        this._sala = null;
        this._pintura = null;
    }

    /*** Pruebas Sala ***/

    public void testCantLamparasMinima(){
        assertTrue(_sala.lamparas<4);
    }

    public void testCierreCentralizadoTrue(){
        assertTrue(_sala.cierreCentralizado);
    }

    public void testCierreCentralizadoFalse(){
        assertFalse(_sala.cierreCentralizado);
    }

    public void testCrearPintura_ValoresCorrectos() {
        assertNotSame("", _pintura.nombre);
        assertTrue(_pintura.anio > 0);
        assertNotNull(_pintura.autor);
        assertNotNull(_pintura.tecnica);
        assertNotNull(_pintura.genero);
        assertNotNull(_pintura.tamanio);
        assertEquals(_sala, _pintura.ubicacion);
    }

    public void testCrearPintura_UidGenerado() {
        assertNotNull(_pintura.uid);
        assertNotSame("", _pintura.uid);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(new TestSuite(GaudiTest.class));
    }
}
