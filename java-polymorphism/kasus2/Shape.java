public abstract class Shape {
    protected String shapeName;

    // ----------------------------------
    // Constructor: Sets up the shape.
    // ----------------------------------
    public Shape(String name) {
        shapeName = name;
    }

    // ----------------------------------
    // Returns the area of the shape.
    // ----------------------------------
    public abstract double area();

    // ----------------------------------
    // Returns the name of the shape.
    // ----------------------------------
    public String toString() {
        return shapeName;
    }
}
