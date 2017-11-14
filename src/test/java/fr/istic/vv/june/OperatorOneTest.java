package fr.istic.vv.june;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.logging.Logger;

public class OperatorOneTest extends TestCase {

    private boolean doesAEqualTen;

    @Test
    public void testDoesAEqualTen() throws Exception {
        try {
            OperatorOne op = new OperatorOne();
            op.setA(10);
            assertTrue(op.doesAEqualTen());
            op.setA(12);
            assertFalse(op.doesAEqualTen());
        }
        catch (Exception e) {
            throw e;
        }
    }

//    @Test
//    public void testBodyMethod() throws Exception {
//        try {
//            OperatorOne op = new OperatorOne();
//            op.doesAEqualTen();
//            assertEquals(5, op.getB());
//        }
//        catch (Exception e) {
//            throw e;
//        }
//    }

}