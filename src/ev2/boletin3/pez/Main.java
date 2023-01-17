package ev2.boletin3.pez;

public class Main {

    public static void main(String[] args) {
        Shark sh1 = new Shark("Orl",44);
        System.out.println(Fish.getFishNumber());
        System.out.println(sh1.getName());
        System.out.println(sh1.getTeeth());

        Shark sh2 = new Shark("Earl", 40);
        System.out.println(Fish.getFishNumber());
        System.out.println(sh2.getName());
        System.out.println(sh2.getTeeth());
    }
}
