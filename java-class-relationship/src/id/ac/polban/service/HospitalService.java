package id.ac.polban.service;

import id.ac.polban.model.Doctor;
import id.ac.polban.model.Patient;

public class HospitalService {
    // Static constant: Nama fasilitas kesehatan yang dapat diakses secara global
    public static final String CLINIC_NAME = "Polban Medical Center";

    // Static method: Menampilkan informasi klinik
    public static void displayClinicInfo() {
        System.out.println("Klinik: " + CLINIC_NAME);
    }

    /**
     * Relasi Dependency: HospitalService menggunakan (uses-a) Doctor dan Patient
     * sebagai parameter method tanpa menyimpannya sebagai field/atribut.
     */
    public void processConsultation(Doctor doctor, Patient patient) {
        doctor.receivePatient(patient);
        doctor.greeting();
        patient.introduce();
        patient.inputSymptom();
        doctor.diagnose();

        if (patient.getDiagnosis() != null && !"Tidak diketahui".equals(patient.getDiagnosis())) {
            doctor.giveTreatment();
        }
    }
}
