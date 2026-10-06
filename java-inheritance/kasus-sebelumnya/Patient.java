public class Patient extends Person {
    private String medicalRecordNumber;
    private String symptom;
    private String diagnosis;

    public Patient(String name, byte age, char gender, String medicalRecordNumber) {
        super(name, age, gender);
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
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

    @Override
    public String getProfile() {
        String keluhan = (symptom == null || symptom.isEmpty()) ? "Belum ada keluhan" : symptom;
        return "[PASIEN] " + super.getProfile() + " | No. RM: " + medicalRecordNumber + " | Keluhan: " + keluhan;
    }

    public void introduce() {
        this.say("Halo dok, saya " + this.getName() + " (" + this.getAge() + " th). Keluhan saya: " + this.symptom);
    }
}
