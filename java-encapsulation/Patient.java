import java.util.Scanner;

public class Patient extends Person {
    private String symptom;
    private String diagnosis;
    private String treatment;

    public Patient(String name, byte age, char gender) {
        super(name, age, gender);
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

    // aksi pasien
    public void introduce() {
        this.say("Halo dok, saya "+this.getName()+ ", umur saya "+this.getAge());
    }

    public void inputSymptom() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kayaknya saya kena (pilih salah satu: demam, batuk, pilek): ");
        this.symptom = sc.nextLine();
        sc.close();
    }
}
