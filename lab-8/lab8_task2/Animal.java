public abstract class Animal {
    private String nameYusufzoda58330;
    private int ageYusufzoda58330;
    private double weightYusufzoda58330;

    public Animal() {}

    public Animal(String name, int age, double weight) {
        this.nameYusufzoda58330 = name;
        this.ageYusufzoda58330 = age;
        this.weightYusufzoda58330 = weight;
    }

    public String getNameYusufzoda58330() {
        return nameYusufzoda58330;
    }

    public void setNameYusufzoda58330(String name) {
        this.nameYusufzoda58330 = name;
    }

    public int getAgeYusufzoda58330() {
        return ageYusufzoda58330;
    }

    public void setAgeYusufzoda58330(int age) {
        this.ageYusufzoda58330 = age;
    }

    public double getWeightYusufzoda58330() {
        return weightYusufzoda58330;
    }

    public void setWeight(double weight) {
        this.weightYusufzoda58330 = weight;
    }

    public abstract void eatYusufzoda58330();

    public abstract String getVoiceYusufzoda58330();

    @Override
    public String toString() {
        return "Name: " + nameYusufzoda58330 + ", Age: " + ageYusufzoda58330 + ", Weight: " + weightYusufzoda58330;
    }
}
