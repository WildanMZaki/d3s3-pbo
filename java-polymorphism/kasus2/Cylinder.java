public class Cylinder extends Shape {
    private double radius;
    private double height;

    // ----------------------------------
    // Constructor: Sets up the cylinder.
    // ----------------------------------
    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    // ----------------------------------
    // Returns the area of the cylinder.
    // Note: As specified in the lab problem description, area is PI * radius^2 * height.
    // ----------------------------------
    public double area() {
        return Math.PI * radius * radius * height;
    }

    // ----------------------------------
    // Returns the cylinder as a String.
    // ----------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
