package stomas.tests;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GaudiTest extends TestCase {

    public GaudiTest(String name){
        super(name);
    }

    protected void setUp(){}

    protected void tearDown(){}

    public static void main(String[] args) {
        junit.textui.TestRunner.run(new TestSuite(GaudiTest.class));
    }
}
