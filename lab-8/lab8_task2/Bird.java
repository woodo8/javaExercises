public abstract class Bird extends Animal {
    private String featherColorYusufzoda58330;

    public Bird() {}

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColorYusufzoda58330 = featherColor;
    }

    public String getFeatherColor() {
        return featherColorYusufzoda58330;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColorYusufzoda58330 = featherColor;
    }

    public abstract void flyYusufzoda58330();
}