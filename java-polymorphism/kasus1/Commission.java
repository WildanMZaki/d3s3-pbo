public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // ----------------------------------------------------------
    // Sets up this commission employee using the specified information.
    // ----------------------------------------------------------
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;
    }

    // ----------------------------------------------------------
    // Adds the specified sales to this employee's accumulated sales.
    // ----------------------------------------------------------
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // ----------------------------------------------------------
    // Computes and returns the pay for this commission employee.
    // Calls parent pay() for hourly pay and adds sales commission.
    // Resets total sales to 0.
    // ----------------------------------------------------------
    public double pay() {
        double payment = super.pay() + (totalSales * commissionRate);
        totalSales = 0.0;
        return payment;
    }

    // ----------------------------------------------------------
    // Returns information about this commission employee as a string,
    // including total sales.
    // ----------------------------------------------------------
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
