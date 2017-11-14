package fr.istic.vv.elo;

/**
 *  Replace a comparison operator by another given
 */
public class SampleELO {

    /**
     * @param a int
     * @param b int
     * @return true if a > b
     */
    public boolean isGreater(int a, int b) {
        return a > b;
    }

    /**
     * @param a int
     * @param b int
     * @return true if a < b
     */
    public boolean isLess(int a, int b) {
        return a < b;
    }

    /**
     * @param a int
     * @param b int
     * @return true if a >= b
     */
    public boolean isGreaterOrEqual(int a, int b) {
        return a >= b;
    }

    /**
     * @param a int
     * @param b int
     * @return true if a <= b
     */
    public boolean isLessOrEqual(int a, int b) {
        return a <= b;
    }

}
