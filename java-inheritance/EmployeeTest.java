public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println("Data karyawan awal:");
        for (Employee e : staff) {
            e.print();
        }

        System.out.println("\nNaikkan gaji 5%:");
        for (Employee e : staff) {
            e.raiseSalary(5);
            e.print();
        }

        System.out.println("\nUji Shell Sort (Sortable) ascending by salary:");
        Employee[] unsortedStaff = new Employee[3];
        unsortedStaff[0] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        unsortedStaff[1] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        unsortedStaff[2] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);

        System.out.println("Sebelum diurutkan:");
        for (Employee e : unsortedStaff) {
            e.print();
        }

        Sortable.shell_sort(unsortedStaff);

        System.out.println("Setelah shell_sort (Ascending by salary):");
        for (Employee e : unsortedStaff) {
            e.print();
        }
    }
}
