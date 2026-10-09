public class Food extends Goods {
    private double calories;

    public Food(String description, double price, double calories) {
        super(description, price);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Calories: " + calories);
    }
}
