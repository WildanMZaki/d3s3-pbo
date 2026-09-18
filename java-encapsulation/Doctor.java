public class Doctor extends Person {
    private String specialization;
    public Patient patient;
    
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

    public void receivePatient(Patient patient) { // Masih setter, tetapi penamaan disesuaikan konteks
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
        this.say("Ada yang bisa dibantu" + (salutation != "" ? ", " + salutation : "") + "?");
    }

    public void diagnose() {
        String diagnosis = "";
        switch (patient.getSymptom()) {
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
        if (diagnosis != "Tidak diketahui") {
            this.say("Dari keluhan yang bapak sampaikan sepertinya bapak terkena " + diagnosis);
        } else {
            this.say("Mohon maaf, sepertinya keluhan bapak bukan ranah saya. Silahkan merujuk ke dokter spesialis lain.");
        }
    }

    public void giveTreatment() {
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
        if (treatment != "Tidak diketahui") {
            this.say("Untuk mengatasinya, silahkan " + treatment);
        } else {
            this.say("Mohon maaf, sepertinya keluhan bapak bukan ranah saya. Silahkan merujuk ke dokter spesialis lain.");
        }
    }
}
