public class Blowfish extends Fish {
    private boolean isPoisonous;

    public Blowfish() {
        super();
        this.isPoisonous = false;
    }

    public Blowfish(String name, int age, double weight, String species, boolean isSaltwater, boolean isPoisonous) {
        super(name, age, weight, species, isSaltwater);
        this.isPoisonous = isPoisonous;
    }

    public Blowfish(String name, int age, String species, boolean isPoisonous) {
        super(name, age, Double.parseDouble(species));
        this.isPoisonous = isPoisonous;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    @Override
    public void eatYusufzoda58330() {
        System.out.println("The blowfish is eating a small fish.");
    }

    @Override
    public String getVoiceYusufzoda58330() {
        return "The blowfish does not make any vocalizations.";
    }

    public void inflate() {
        System.out.println("The blowfish is inflating.");
    }
    @Override
    public void swimYusufzoda58330() {
        System.out.println("Blowfish swimming");
    }


    @Override
    public String toString() {
        return super.toString() + "\nIs poisonous: " + isPoisonous;
    }
}