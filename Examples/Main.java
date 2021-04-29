
public class Main {
    public static void main(String[] args) {
        Cow c = new Cow("Cow", 4, "Moo", true);
        c.makeSound();
        //System.out.println(c.isBull());
        System.out.println(c.getNumLegs());
    }
}