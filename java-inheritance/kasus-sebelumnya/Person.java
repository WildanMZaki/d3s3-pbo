public class Person {
    private String name;
    private byte age;
    private char gender; // 'L' / 'P'

    public Person(String name, byte age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSalutation() {
        if (this.age > 40) {
            return this.gender == 'L' ? "Pak" : "Ibu";
        } else if (age > 17) {
            return this.gender == 'L' ? "Mas" : "Mbak";
        } else {
            return "Dek";
        }
    }

    public void say(String message) {
        System.out.println(message);
    }

    /**
     * Method deskripsi profil dasar dari Person.
     * Akan dioverride oleh subclass dengan memanfaatkan super.getProfile().
     */
    public String getProfile() {
        String genderStr = (gender == 'L' || gender == 'l') ? "Laki-laki" : "Perempuan";
        return "Nama: " + name + " (" + getSalutation() + ") | Usia: " + age + " tahun | Gender: " + genderStr;
    }
}
