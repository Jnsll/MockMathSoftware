package fr.istic.vv.elo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SampleELOTest {

    private SampleELO sampleELO;

    @Before
    public void beforeTest() {
        sampleELO = new SampleELO();
    }

    @Test
    public void testIsGreater() throws Exception {
        assertTrue(sampleELO.isGreater(2, 1));
        assertTrue(sampleELO.isGreater(20, 0));
        assertFalse(sampleELO.isGreater(1, 10));
        assertFalse(sampleELO.isGreater(0, 10));
        assertFalse(sampleELO.isGreater(10, 10));
    }

    @Test
    public void testIsLess() throws Exception {
        assertTrue(sampleELO.isLess(0, 1));
        assertTrue(sampleELO.isLess(0, 10));
        assertFalse(sampleELO.isLess(1, 1));
        assertFalse(sampleELO.isLess(100, 0));
    }

    @Test
    public void testIsGreaterOrEqual() throws Exception {
        assertTrue(sampleELO.isGreaterOrEqual(2, 1));
        assertTrue(sampleELO.isGreaterOrEqual(2, 2));
        assertFalse(sampleELO.isGreaterOrEqual(2, 3));
        assertFalse(sampleELO.isGreaterOrEqual(0, 3));
    }

    @Test
    public void testIsLessOrEqual() throws Exception {
        assertTrue(sampleELO.isLessOrEqual(0, 1));
        assertTrue(sampleELO.isLessOrEqual(1, 1));
        assertFalse(sampleELO.isLessOrEqual(5, 1));
        assertFalse(sampleELO.isLessOrEqual(3, 0));
    }

}