
abstract class Animal {
    protected String nama;
    protected String asal;
    protected int jumlahKaki;

    public Animal(String nama, String asal, int jumlahKaki) {
        this.nama = nama;
        this.asal = asal;
        this.jumlahKaki = jumlahKaki;
    }

    // Method getter
    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public abstract void toShout();

    public void toEat() {
        System.out.println(nama + " like to eat.");
    }
}
