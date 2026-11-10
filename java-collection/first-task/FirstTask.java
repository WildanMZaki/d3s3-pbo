import java.util.ArrayList;
import java.util.Comparator;
import java.util.Vector;

public class FirstTask {
    // kode department untuk versi Integer
    static final int CS = 1, IT = 2, EE = 3;

    public static void main(String[] args) {
        // ===== Bagian 1: ArrayList, department bertipe Integer, sort by name =====
        ArrayList<Student<Integer>> list = new ArrayList<>();
        list.add(new Student<>("251511062", "Wildan", CS, "Bandung"));
        list.add(new Student<>("251511010", "Citra", EE, "Cimahi"));
        list.add(new Student<>("251511025", "Andi", IT, "Garut"));
        list.add(new Student<>("251511041", "Eka", CS, "Sumedang"));
        list.add(new Student<>("251511003", "Budi", IT, "Bekasi"));

        System.out.println("=== ArrayList sebelum sort ===");
        list.forEach(System.out::println);

        list.sort(Comparator.comparing(Student::getName));

        System.out.println("\n=== ArrayList setelah sort by name ===");
        list.forEach(System.out::println);

        // ===== Bagian 2: Vector, department bertipe String, filter Computer Science =====
        Vector<Student<String>> vector = new Vector<>();
        vector.add(new Student<>("251511071", "Fajar", "Computer Science", "Bandung"));
        vector.add(new Student<>("251511072", "Gita", "Information Technology", "Depok"));
        vector.add(new Student<>("251511073", "Hana", "Computer Science", "Cirebon"));
        vector.add(new Student<>("251511074", "Irfan", "Electrical Engineering", "Bogor"));
        vector.add(new Student<>("251511075", "Joko", "computer science", "Tasikmalaya"));

        System.out.println("\n=== Vector: mahasiswa Computer Science ===");
        for (Student<String> s : vector) {
            if (s.getDepartment().equalsIgnoreCase("Computer Science")) {
                System.out.println(s);
            }
        }

        // ===== Bagian 3: Encapsulation, data tidak valid ditolak =====
        System.out.println("\n=== Encapsulation ===");
        Student<String> s = vector.get(0);
        s.setAddress("Jakarta");                       // perubahan lewat setter
        System.out.println("Alamat baru " + s.getName() + ": " + s.getAddress());
        try {
            s.setName("");                             // ditolak oleh validasi setter
        } catch (IllegalArgumentException e) {
            System.out.println("Ditolak: " + e.getMessage());
        }
    }
}
