public class Dog extends Mammal {
    public Dog() {}

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Dog(String name, int age, double weight, String species) {
        super(name, age, weight);
        System.out.println("Dog species: " + species);
    }

    @Override
    public void eatYusufzoda58330() {
        System.out.println("Dog is eating.");
    }

    @Override
    public String getVoiceYusufzoda58330() {
        return "Woof!";
    }

    @Override
    public void walkYusufzoda58330() {
        System.out.println("Dog is walking.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Species: Dog";
    }
}