package soal1;

public class Paint {
    private double coverage; // feet per gallon

    public Paint(double c) {
        coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        double amountOfPaint = s.area() / coverage;
        return amountOfPaint;
    }
}

