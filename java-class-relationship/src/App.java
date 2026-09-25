import id.ac.polban.model.Doctor;
import id.ac.polban.model.Patient;
import id.ac.polban.service.HospitalService;

public class App {
    public static void main(String[] args) {
        // Mengakses static method dari HospitalService secara langsung
        HospitalService.displayClinicInfo();

        // Instansiasi objek model
        Patient patient = new Patient("Iim Solihin", (byte) 23, 'L');
        Doctor doctor = new Doctor("dr. Tirta", (byte) 35, 'L', "Ahli Jantung");

        // Menjalankan alur layanan rumah sakit via HospitalService
        HospitalService hospitalService = new HospitalService();
        hospitalService.processConsultation(doctor, patient);

        // Mengakses static method dan static field dari Patient
        System.out.println("Total pasien terdaftar di sistem: " + Patient.getTotalPatients() + " orang.");
    }
}
