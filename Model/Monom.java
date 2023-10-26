package Model;

public class Monom {
    private final int key;
    private final double coefficient;
    public Monom(int key, double coefficient){
        this.key = key;
        this.coefficient = coefficient;
    }
    public int getKey() {
        return key;
    }
    public double getCoefficient() {
        return coefficient;
    }
    public String toString() {
        return Math.round(coefficient*100)/100D + "x^" + key;
    }
}
