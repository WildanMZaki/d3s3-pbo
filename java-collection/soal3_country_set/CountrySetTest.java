import java.util.HashSet;
import java.util.Set;

public class CountrySetTest {
    public static void main(String[] args) {
        // Menggunakan Set (implementasi HashSet) karena tidak menyimpan duplikat
        // dan urutan tidak penting.
        Set<String> countries = new HashSet<>();

        // Menambahkan 6 negara, dengan 1 nama negara yang duplikat
        countries.add("Indonesia");
        countries.add("Jepang");
        countries.add("Korea Selatan");
        countries.add("Jerman");
        countries.add("Kanada");
        boolean isDuplicateAdded = countries.add("Indonesia"); // Elemen duplikat

        System.out.println("Status penambahan elemen duplikat ('Indonesia'): " + isDuplicateAdded);
        System.out.println("Total elemen dalam HashSet: " + countries.size());
        System.out.println("\nDaftar negara dalam Set:");
        for (String country : countries) {
            System.out.println("- " + country);
        }
    }
}

