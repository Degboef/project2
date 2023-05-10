package edu.guilford;

public class project2 {
    public static void main(String[] args) {
        Rational r1 = new Rational();
        System.out.println("r1 = " + r1);  // should print "r1 = 0/1"
        
        Rational r2 = new Rational(2, 3);
        System.out.println("r2 = " + r2);  // should print "r2 = 2/3"
        
        r2.negate();
        System.out.println("negate(r2) = " + r2);  // should print "negate(r2) = -2/3"
        
        r2.invert();
        System.out.println("invert(r2) = " + r2);  // should print "invert(r2) = 3/2"
        
        double x = r2.toDouble();
        System.out.println("toDouble(r2) = " + x);  // should print "toDouble(r2) = 1.5"
    }
}

class Rational {
    private int numerator;
    private int denominator;
    
    public Rational() {
        numerator = 0;
        denominator = 1;
    }
    
    public Rational(int num, int denom) {
        numerator = num;
        denominator = denom;
    }
    
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    public void negate() {
        numerator = -numerator;
    }
    
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }
    
    public double toDouble() {
        return (double) numerator / denominator;
    }
}
