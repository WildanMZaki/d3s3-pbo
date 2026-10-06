public class TestShape {
    public static void main(String[] args) {
        // 1. Test hierarki Shape
        Shape s = new Shape("black", false);
        Circle c = new Circle(2.0, "blue", true);
        Rectangle r = new Rectangle(3.0, 4.0, "yellow", true);
        Square sq = new Square(5.0, "green", true);

        System.out.println(s);
        System.out.println(c + " area=" + c.getArea() + " perimeter=" + c.getPerimeter());
        System.out.println(r + " area=" + r.getArea() + " perimeter=" + r.getPerimeter());
        System.out.println(sq + " area=" + sq.getArea() + " perimeter=" + sq.getPerimeter());

        // 2. Test constraint Square (setWidth & setLength)
        System.out.println("\nUji perubahan dimensi Square:");
        sq.setWidth(8.0);
        System.out.println("Setelah setWidth(8.0)  : " + sq + " area=" + sq.getArea());
        sq.setLength(3.0);
        System.out.println("Setelah setLength(3.0) : " + sq + " area=" + sq.getArea());
        sq.setSide(6.0);
        System.out.println("Setelah setSide(6.0)   : " + sq + " area=" + sq.getArea());

        Square square = new Square(5.0);
        square.setWidth(8.0); // Memanggil setWidth milik Rectangle tanpa override
        System.out.println(square); // Hasil: width=8.0, length=5.0
    }
}
