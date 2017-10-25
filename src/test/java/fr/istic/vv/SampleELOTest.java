package fr.istic.vv;

import junit.framework.TestCase;

public class SampleELOTest extends TestCase {

    public void testIsBigger() throws Exception {
        SampleELO sampleELO = new SampleELO();

        boolean t1 = sampleELO.isBigger(2, 1);
        assertTrue(t1);

        boolean t2 = sampleELO.isBigger(20, 0);
        assertTrue(t2);

        boolean t3 = sampleELO.isBigger(1, 10);
        assertFalse(t3);

        boolean t4 = sampleELO.isBigger(0, 10);
        assertFalse(t4);

        boolean t5 = sampleELO.isBigger(10, 10);
        assertFalse(t5);
    }

}