import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSortDemo {
    public static void main(String[] args) {
        // Kasus 1: HashSet
        HashSet<String> countriesSet = new HashSet<>();
        countriesSet.add("Indonesia");
        countriesSet.add("Australia");
        countriesSet.add("Brazil");

        System.out.println("\ncountriesSet: " + countriesSet);
        // Collections.sort(countriesSet);
        /* 
         * Alasan error:
         * Method signature Collections.sort adalah:
         * public static <T extends Comparable<? super T>> void sort(List<T> list)
         * HashSet mengimplementasikan antarmuka Set, BUKAN List.
         * Set pada dasarnya tidak memiliki urutan indeks posisi.
         */

        // Kasus 2: ArrayList
        ArrayList<String> countriesList = new ArrayList<>();
        countriesList.add("Indonesia");
        countriesList.add("Australia");
        countriesList.add("Brazil");

        System.out.println("countriesList sebelum sort: " + countriesList);
        Collections.sort(countriesList);
        System.out.println("countriesList setelah sort : " + countriesList);

        // Solusi sorting pada set collection:
        // Opsi A: Salin elemen ke List, lalu urutkan
        List<String> sortedListFromSet = new ArrayList<>(countriesSet);
        Collections.sort(sortedListFromSet);
        System.out.println("Set setelah dikonversi ke List dan di-sort: " + sortedListFromSet);

        // Opsi B: Gunakan TreeSet (SortedSet) yang otomatis terurut secara natural
        Set<String> treeSet = new TreeSet<>(countriesSet);
        System.out.println("Elemen dalam TreeSet (otomatis terurut): " + treeSet);
    }
}

