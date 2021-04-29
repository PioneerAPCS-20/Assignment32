
public class Cow extends Animal {
    private boolean isBull;

    public Cow(String name, int numLegs, String sound, boolean isBull) {
        super(name, numLegs, sound);
        this.isBull = isBull;
    }

    public Cow() {
        this.isBull = true;
    }

    @Override
    public void makeSound() {
        for(int i = 0; i < 2; i++) {
            super.makeSound();
        }
    }

    public boolean isBull() { return isBull; }
}