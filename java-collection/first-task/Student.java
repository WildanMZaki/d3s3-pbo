/**
 * Student dengan tipe department generik.
 * D bisa Integer (kode department) atau String (nama department).
 */
public class Student<D> {
    private final String studentId;   // identitas tidak boleh diubah, jadi tanpa setter
    private String name;
    private D department;
    private String address;

    public Student(String studentId, String name, D department, String address) {
        if (studentId == null || studentId.isBlank()) {
            throw new IllegalArgumentException("StudentID wajib diisi");
        }
        this.studentId = studentId;
        setName(name);
        setDepartment(department);
        setAddress(address);
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public D getDepartment() { return department; }
    public String getAddress() { return address; }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nama wajib diisi");
        }
        this.name = name;
    }

    public void setDepartment(D department) {
        if (department == null) {
            throw new IllegalArgumentException("Department wajib diisi");
        }
        this.department = department;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%-9s | %-8s | %-22s | %s", studentId, name, department, address);
    }
}
