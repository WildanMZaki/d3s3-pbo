
public class Main {
    public static void main(String[] args) {
        Food food = new Food("Oatmeal", 3.50, 150);
        Toy toy = new Toy("Action Figure", 15.00, 5);
        Book book = new Book("Design Patterns", 45.00, "Gang of Four");

        Goods[] items = { food, toy, book };

        for (Goods item : items) {
            item.display();
            if (item instanceof Taxable) {
                Taxable taxableItem = (Taxable) item;
                System.out.println("Tax: " + taxableItem.calculateTax());
            }
            System.out.println();
        }
    }
}
