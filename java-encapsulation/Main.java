class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Iim Solihin", (byte)23, 'L');
        Doctor doctor = new Doctor("dr. Tirta", (byte)35, 'L', "Ahli Jantung");

        doctor.receivePatient(patient);
        doctor.greeting();
        patient.introduce();
        patient.inputSymptom();
        doctor.diagnose();
        if (patient.getDiagnosis() != "Tidak diketahui") {
            doctor.giveTreatment();
        }
    }
}