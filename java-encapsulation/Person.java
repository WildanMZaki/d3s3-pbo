public class Person {
    protected String name;
    private byte age;
    private char gender; // L/P

    public Person(String name, byte age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Setter & Getter Methods
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

    // Methods
    protected void say(String message) {
        System.out.println(message);
    }

    protected String getSalutation() {
        if (age > 40) {
            return this.gender == 'L' ? "Pak" : "Ibu";
        } else if (age > 17) {
            return this.gender == 'L' ? "Mas" : "Mbak";
        } else {
            return "Dek";
        }
    }
}
