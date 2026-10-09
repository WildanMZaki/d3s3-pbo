class Dog extends Animal {
    public Dog(String nama, String asal) {
        super(nama, asal, 4);
    }

    @Override
    public void toShout() {
        System.out.println(nama + " says: Guk Guk Guk!");
    }
}