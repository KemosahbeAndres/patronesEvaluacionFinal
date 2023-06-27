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
    }

    protected void tearDown(){
        this._encargado = null;
        this._sala = null;
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

    public static void main(String[] args) {
        junit.textui.TestRunner.run(new TestSuite(GaudiTest.class));
    }
}
