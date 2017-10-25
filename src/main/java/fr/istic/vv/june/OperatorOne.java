package fr.istic.vv.june;

public class OperatorOne {

    private int a;
    private int b;

    // Methods
    public boolean doesAEqualTen() {
        this.setB(5);
        return (this.a == 10);
    }

    // Getters & Setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
