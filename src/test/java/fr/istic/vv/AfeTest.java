package fr.istic.vv;

import fr.istic.vv.afe.MathAfe;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AfeTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AfeTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AfeTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        MathAfe math = new MathAfe();
        assertEquals(1+1,math.add(1,1));

    }

//    public void testApp2()
//    {
//        MathAfe math = new MathAfe();
//        assertEquals(1+1,math.add(2,1));
//
//    }
}
