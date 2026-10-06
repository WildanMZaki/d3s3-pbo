public class TestKasusSebelumnya {
    public static void main(String[] args) {
        System.out.println("Pengujian kasus sebelumnya (Hospital - Person, Doctor, Patient):");

        // T4-01: Object subclass dibuat melalui constructor (super & subclass terinisialisasi)
        Doctor dr = new Doctor("dr. Budi Santoso, Sp.PD", (byte) 45, 'L', "Penyakit Dalam", "SIP-197905-2023");
        Patient pas = new Patient("Ani Wijaya", (byte) 24, 'P', "RM-2026-0042");

        // T4-02: Method warisan dipanggil dari subclass
        System.out.println("\nMethod warisan dari Person:");
        System.out.println("Dokter: " + dr.getName() + ", Sapaan: " + dr.getSalutation());
        System.out.println("Pasien: " + pas.getName() + ", Sapaan: " + pas.getSalutation());

        // T4-03 & T4-04: Method override dipanggil dan memanfaatkan super.method(...)
        System.out.println("\nMethod override getProfile() dengan pemanggilan super.getProfile():");
        System.out.println(dr.getProfile());
        System.out.println(pas.getProfile());

        // T4-05: Akses state mengikuti encapsulation
        System.out.println("\nEncapsulation dan update keluhan pasien:");
        pas.setSymptom("demam");
        System.out.println("Keluhan via getSymptom(): " + pas.getSymptom());
        System.out.println(pas.getProfile());

        // T4-06: Dua subclass diuji menunjukkan output/behavior berbeda
        System.out.println("\nPerbedaan behavior antar subclass:");
        dr.receivePatient(pas);
        dr.greeting();
        pas.introduce();
        dr.diagnose();

        // T4-07: Regression tugas lama
        System.out.println("\nRegression test alur pemeriksaan:");
        System.out.println("Diagnosis pasien: " + pas.getDiagnosis());
        System.out.println("Profil pasien terbaru: " + pas.getProfile());
    }
}
