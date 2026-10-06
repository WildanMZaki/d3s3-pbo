public class TestKasusSebelumnya {
    public static void main(String[] args) {
        System.out.println("Pengujian kasus sebelumnya (Hospital - Person, Doctor, Patient):");

        Doctor dr = new Doctor("dr. Budi Santoso, Sp.PD", (byte) 45, 'L', "Penyakit Dalam", "SIP-197905-2023");
        Patient pas = new Patient("Ani Wijaya", (byte) 24, 'P', "RM-2026-0042");

        System.out.println("\nMethod warisan dari Person:");
        System.out.println("Dokter: " + dr.getName() + ", Sapaan: " + dr.getSalutation());
        System.out.println("Pasien: " + pas.getName() + ", Sapaan: " + pas.getSalutation());

        System.out.println("\nMethod override getProfile() dengan pemanggilan super.getProfile():");
        System.out.println(dr.getProfile());
        System.out.println(pas.getProfile());

        System.out.println("\nEncapsulation dan update keluhan pasien:");
        pas.setSymptom("demam");
        System.out.println("Keluhan via getSymptom(): " + pas.getSymptom());
        System.out.println(pas.getProfile());

        System.out.println("\nPerbedaan behavior antar subclass:");
        dr.receivePatient(pas);
        dr.greeting();
        pas.introduce();
        dr.diagnose();

        System.out.println("\nRegression test alur pemeriksaan:");
        System.out.println("Diagnosis pasien: " + pas.getDiagnosis());
        System.out.println("Profil pasien terbaru: " + pas.getProfile());
    }
}