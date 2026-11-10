import java.util.ArrayList;
import java.util.Collections;

public class GroupNames {
    public static void main(String[] args) {
        // Inisialisasi ArrayList of Strings
        ArrayList<String> groupNames = new ArrayList<>();

        // Menambahkan nama anggota grup ke dalam ArrayList
        groupNames.add("Mark");
        groupNames.add("Andrew");
        groupNames.add("Beth");

        System.out.println("=== Sebelum Diurutkan ===");
        System.out.println(groupNames);

        // Mengurutkan list secara leksikografis
        Collections.sort(groupNames);

        System.out.println("\n=== Setelah Diurutkan (Collections.sort) ===");
        System.out.println(groupNames);
    }
}

