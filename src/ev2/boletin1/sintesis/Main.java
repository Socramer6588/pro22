package ev2.boletin1.sintesis;

public class Main {

    public static void main(String[] args) {

        Equipo e1 = new Equipo("Celta", 1200.45);
        Jugador j1 = new Jugador("11122233P", "Gon", "", 1990, e1);
        Jugador j2 = new Jugador("11122244L", "Héctor", "", 1991, new Equipo("Celta", 1200.45));

        Equipo e2 = j1.getEquipo();
        System.out.println(e2.getNombre());

        System.out.println(j2.getEquipo().getNombre());
    }
}
