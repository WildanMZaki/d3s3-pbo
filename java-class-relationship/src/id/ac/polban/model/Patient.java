package id.ac.polban.model;

import java.util.Scanner;

public class Patient extends Person {
    // Static field: Pelacak jumlah total pasien yang terdaftar (materi static counter)
    private static int totalPatients = 0;

    private String symptom;
    private String diagnosis;
    private String treatment;

    public Patient(String name, byte age, char gender) {
        super(name, age, gender);
        totalPatients++;
    }

    // Static method untuk mendapatkan total pasien
    public static int getTotalPatients() {
        return totalPatients;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    // Aksi pasien
    public void introduce() {
        this.say("Halo dok, saya " + this.getName() + ", umur saya " + this.getAge());
    }

    public void inputSymptom() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kayaknya saya kena (pilih salah satu: demam, batuk, pilek): ");
        this.symptom = sc.nextLine().trim();
        sc.close();
    }
}
