import id.ac.polban.model.Doctor;
import id.ac.polban.model.Patient;
import id.ac.polban.service.HospitalService;

public class App {
    public static void main(String[] args) {
        HospitalService.displayClinicInfo();

        // Menggunakan Model yang di-import dari HospitalApp.jar
        Patient patient = new Patient("Budi Santoso", (byte) 21, 'L');
        Doctor doctor = new Doctor("dr. Sarah", (byte) 30, 'P', "Umum");

        // Menggunakan Service dari HospitalApp.jar
        HospitalService service = new HospitalService();
        service.processConsultation(doctor, patient);

        System.out.println("Total pasien tercatat di sistem: " + Patient.getTotalPatients());
    }
}
