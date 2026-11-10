import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSortDemo {
    public static void main(String[] args) {
        // Kasus 1: ArrayList
        ArrayList<String> countriesList = new ArrayList<>();
        countriesList.add("Indonesia");
        countriesList.add("Australia");
        countriesList.add("Brazil");

        System.out.println("countriesList sebelum sort: " + countriesList);
        // Collections.sort(countriesList) BERHASIL karena countriesList adalah List
        Collections.sort(countriesList);
        System.out.println("countriesList setelah sort : " + countriesList);

        // Kasus 2: HashSet
        HashSet<String> countriesSet = new HashSet<>();
        countriesSet.add("Indonesia");
        countriesSet.add("Australia");
        countriesSet.add("Brazil");

        System.out.println("\ncountriesSet: " + countriesSet);
        
        /* 
         * Baris di bawah ini TIDAK DAPAT DIKOMPILASI (Compile-time Error):
         * Collections.sort(countriesSet);
         * 
         * Alasan:
         * Method signature Collections.sort adalah:
         * public static <T extends Comparable<? super T>> void sort(List<T> list)
         * HashSet mengimplementasikan antarmuka Set, BUKAN List.
         * Set pada dasarnya tidak memiliki urutan indeks posisi.
         */

        // Solusi jika ingin mengurutkan elemen dari sebuah Set:
        // Opsi A: Salin elemen ke List, lalu urutkan
        List<String> sortedListFromSet = new ArrayList<>(countriesSet);
        Collections.sort(sortedListFromSet);
        System.out.println("Set setelah dikonversi ke List dan di-sort: " + sortedListFromSet);

        // Opsi B: Gunakan TreeSet (SortedSet) yang otomatis terurut secara natural
        Set<String> treeSet = new TreeSet<>(countriesSet);
        System.out.println("Elemen dalam TreeSet (otomatis terurut): " + treeSet);
    }
}

