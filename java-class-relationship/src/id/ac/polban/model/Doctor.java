package id.ac.polban.model;

public class Doctor extends Person {
    private String specialization;
    
    // Relasi Aggregation: Doctor "has-a" Patient
    // Dokter memiliki referensi ke objek Patient, tetapi siklus hidup Patient independen
    private Patient patient;
    
    public Doctor(String name, byte age, char gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
    }
    
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void receivePatient(Patient patient) {
        this.patient = patient;
    }

    public void greeting() {
        String greeting = "Halo,";
        String salutation = "";
        if (this.patient != null) {
            salutation = patient.getSalutation();
            greeting += " " + salutation;
        }
        greeting += " saya " + this.getName() + ", Dokter " + this.specialization + ".";
        this.say(greeting);
        this.say("Ada yang bisa dibantu" + (!salutation.isEmpty() ? ", " + salutation : "") + "?");
    }

    public void diagnose() {
        if (this.patient == null || this.patient.getSymptom() == null) {
            this.say("Belum ada pasien atau gejala yang diperiksa.");
            return;
        }

        String diagnosis = "";
        switch (this.patient.getSymptom().toLowerCase()) {
            case "demam":
                diagnosis = "Demam";
                break;
            case "batuk":
                diagnosis = "Batuk Berdahak";
                break;
            case "pilek":
                diagnosis = "Flu";
                break;
            default:
                diagnosis = "Tidak diketahui";
                break;
        }
        this.patient.setDiagnosis(diagnosis);
        if (!"Tidak diketahui".equals(diagnosis)) {
            this.say("Dari keluhan yang " + patient.getSalutation() + " sampaikan sepertinya " + patient.getSalutation() + " terkena " + diagnosis);
        } else {
            this.say("Mohon maaf, sepertinya keluhan " + patient.getSalutation() + " bukan ranah saya. Silakan merujuk ke dokter spesialis lain.");
        }
    }

    public void giveTreatment() {
        if (this.patient == null || this.patient.getDiagnosis() == null) {
            return;
        }

        String treatment = "";
        switch (patient.getDiagnosis()) {
            case "Demam":
                treatment = "Obat Penurun Panas dan Minum Air Putih yang Banyak";
                break;
            case "Batuk Berdahak":
                treatment = "Obat Batuk Berdahak dan Istirahat yang Cukup";
                break;
            case "Flu":
                treatment = "Obat Flu dan Minum Air Putih yang Banyak";
                break;
            default:
                treatment = "Tidak diketahui";
                break;
        }
        this.patient.setTreatment(treatment);
        if (!"Tidak diketahui".equals(treatment)) {
            this.say("Untuk mengatasinya, silakan " + treatment);
        } else {
            this.say("Mohon maaf, sepertinya keluhan " + patient.getSalutation() + " bukan ranah saya. Silakan merujuk ke dokter spesialis lain.");
        }
    }
}
