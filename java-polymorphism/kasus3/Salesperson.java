public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    // -----------------------------------------------------------------
    // Constructor: Sets up the sales person object with the given data.
    // -----------------------------------------------------------------
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // -----------------------------------------------------------------
    // Returns the sales person as a string.
    // -----------------------------------------------------------------
    public String toString() {
        return lastName + ", " + firstName + ":\t" + totalSales;
    }

    // -----------------------------------------------------------------
    // Returns true if the sales people have the same name.
    // -----------------------------------------------------------------
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    // -----------------------------------------------------------------
    // Order is based on total sales with the name (last, then first)
    // breaking a tie in alphabetical order.
    // Returns negative if this has less sales than other,
    // positive if this has more sales than other.
    // -----------------------------------------------------------------
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales;
        } else {
            int result = this.lastName.compareTo(other.lastName);
            if (result == 0) {
                result = this.firstName.compareTo(other.firstName);
            }
            return result;
        }
    }

    // -----------------------------------------------------------------
    // First name accessor.
    // -----------------------------------------------------------------
    public String getFirstName() {
        return firstName;
    }

    // -----------------------------------------------------------------
    // Last name accessor.
    // -----------------------------------------------------------------
    public String getLastName() {
        return lastName;
    }

    // -----------------------------------------------------------------
    // Total sales accessor.
    // -----------------------------------------------------------------
    public int getSales() {
        return totalSales;
    }
}
