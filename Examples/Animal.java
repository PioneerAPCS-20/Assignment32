
public class Animal {
    private String name;
    private int numLegs;
    private String sound;

    public Animal() {
        numLegs = 1;
    }
    
    public Animal(String name, int numLegs, String sound) {
        this.name = name;
        this.numLegs = 2;
        this.sound = sound;
    }

    public String getName() { return name; }
    public int getNumLegs() { return numLegs; }

    public void makeSound() {
        System.out.println(sound + "!!");
    }
}