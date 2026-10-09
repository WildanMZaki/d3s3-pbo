public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Clark", "Indonesia");
        Chicken myChicken = new Chicken("Chiki", "Indonesia");
        Lion myLion = new Lion("Leo", "Africa");

        System.out.println("Informasi Hewan: ");

        System.out.println("\nHewan 1:");
        System.out.println("Nama: " + myDog.getNama());
        System.out.println("Asal: " + myDog.getAsal());
        System.out.println("Jumlah Kaki: " + myDog.getJumlahKaki());
        myDog.toEat();
        myDog.toShout();

        System.out.println("\nHewan 2:");
        System.out.println("Nama: " + myChicken.getNama());
        System.out.println("Asal: " + myChicken.getAsal());
        System.out.println("Jumlah Kaki: " + myChicken.getJumlahKaki());
        myChicken.toEat();
        myChicken.toShout();

        System.out.println("\nHewan 3:");
        System.out.println("Nama: " + myLion.getNama());
        System.out.println("Asal: " + myLion.getAsal());
        System.out.println("Jumlah Kaki: " + myLion.getJumlahKaki());
        myLion.toEat();
        myLion.toShout();

        // Contoh polimorfisme
        System.out.println("\n=== Contoh Polimorfisme ===");
        Animal[] animals = { myDog, myChicken, myLion };
        for (Animal animal : animals) {
            animal.toShout();
        }
    }
}
