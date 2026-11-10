import java.util.ArrayList;

/**
 * Generic implementation of Stack using an ArrayList.
 * 
 * Keuntungan menggunakan ArrayList:
 * 1. Tipe data elemen fleksibel berkat Generics (<T>).
 * 2. Ukuran dapat bersifat dinamis (tidak terbatas oleh array primitif statis),
 *    namun tetap dapat dibatasi jika diinginkan (bounded stack).
 * 3. Indeks puncak (top) selalu merujuk pada elemen terakhir (items.size() - 1).
 *
 * @param <T> Tipe elemen yang disimpan dalam Stack
 */
public class ArrayListStack<T> {
    private int maxsize = -1; // -1 menandakan ukuran tidak terbatas (unbounded)
    private ArrayList<T> items;

    /**
     * Konstruktor default: Stack dinamis (tanpa batasan ukuran maksimum).
     */
    public ArrayListStack() {
        this.items = new ArrayList<>();
    }

    /**
     * Konstruktor dengan batas ukuran maksimum (bounded stack).
     *
     * @param maxsize kapasitas maksimum stack
     */
    public ArrayListStack(int maxsize) {
        if (maxsize <= 0) {
            throw new ArrayListStackException("Stack size must be positive");
        }
        this.maxsize = maxsize;
        this.items = new ArrayList<>(maxsize);
    }

    /**
     * Menambahkan elemen ke puncak Stack.
     *
     * @param item elemen bertipe T
     */
    public void push(T item) {
        if (maxsize != -1 && items.size() >= maxsize) {
            throw new ArrayListStackException("Overflow Error: Stack penuh");
        }
        items.add(item);
    }

    /**
     * Mengambil dan menghapus elemen dari puncak Stack.
     *
     * @return elemen bertipe T pada posisi teratas
     */
    public T pop() {
        if (isEmpty()) {
            throw new ArrayListStackException("Underflow Error: Stack kosong");
        }
        return items.remove(items.size() - 1);
    }

    /**
     * Melihat elemen di puncak Stack tanpa menghapusnya.
     *
     * @return elemen bertipe T pada posisi teratas
     */
    public T peek() {
        if (isEmpty()) {
            throw new ArrayListStackException("Underflow Error: Stack kosong");
        }
        return items.get(items.size() - 1);
    }

    /**
     * Memeriksa apakah Stack kosong.
     *
     * @return true jika kosong, false jika tidak
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Mengembalikan jumlah elemen saat ini dalam Stack.
     *
     * @return ukuran stack saat ini
     */
    public int size() {
        return items.size();
    }

    /**
     * Custom RuntimeException untuk operasi Stack.
     */
    public static class ArrayListStackException extends RuntimeException {
        public ArrayListStackException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Pengujian Generic ArrayListStack (Integer) ===");
        ArrayListStack<Integer> intStack = new ArrayListStack<>(3);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("Top element (peek): " + intStack.peek());
        System.out.println("Pop 1: " + intStack.pop());
        System.out.println("Pop 2: " + intStack.pop());
        System.out.println("Pop 3: " + intStack.pop());

        System.out.println("\n=== Pengujian Generic ArrayListStack (String) ===");
        ArrayListStack<String> stringStack = new ArrayListStack<>();
        stringStack.push("Struktur");
        stringStack.push("Data");
        stringStack.push("Java Collections");

        while (!stringStack.isEmpty()) {
            System.out.println("Pop string: " + stringStack.pop());
        }

        System.out.println("\n=== Pengujian Exception Underflow ===");
        try {
            stringStack.pop();
        } catch (ArrayListStackException e) {
            System.out.println("Berhasil menangkap exception: " + e.getMessage());
        }
    }
}

