package soal1;
public class Cylinder extends Shape{ private double radius, height;
    public Cylinder(double r, double h) { super("Cylinder");
        this.radius = r; this.height = h;
    }
    public double area(){
        return 3.14*radius*radius*height;
    }
    public String toString() {
        return super.toString() + " (radius) " + radius + " and (height) " + height;
    }
}
