public class Doctor extends Person {
    private String specialization;
    private String sipNumber;
    private Patient currentPatient;

    public Doctor(String name, byte age, char gender, String specialization, String sipNumber) {
        super(name, age, gender);
        this.specialization = specialization;
        this.sipNumber = sipNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSipNumber() {
        return sipNumber;
    }

    public void setSipNumber(String sipNumber) {
        this.sipNumber = sipNumber;
    }

    public Patient getCurrentPatient() {
        return currentPatient;
    }

    public void receivePatient(Patient patient) {
        this.currentPatient = patient;
    }

    @Override
    public String getProfile() {
        return "[DOKTER] " + super.getProfile() + " | Spesialisasi: " + specialization + " | No. SIP: " + sipNumber;
    }

    public void greeting() {
        String greeting = "Halo,";
        String salutation = "";
        if (this.currentPatient != null) {
            salutation = currentPatient.getSalutation();
            greeting += " " + salutation;
        }
        greeting += " saya " + this.getName() + ", Dokter " + this.specialization + ".";
        this.say(greeting);
        this.say("Ada yang bisa dibantu" + (!salutation.isEmpty() ? ", " + salutation : "") + "?");
    }

    public void diagnose() {
        if (this.currentPatient == null || this.currentPatient.getSymptom() == null) {
            this.say("Belum ada pasien atau keluhan yang diperiksa.");
            return;
        }

        String diagnosis;
        switch (this.currentPatient.getSymptom().toLowerCase()) {
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
                diagnosis = "Perlu Pemeriksaan Lanjut";
                break;
        }
        this.currentPatient.setDiagnosis(diagnosis);
        this.say("Diagnosis untuk " + currentPatient.getName() + ": " + diagnosis);
    }
}
