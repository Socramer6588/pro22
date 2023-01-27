package ev2.boletin2.aparato;

public class Aparato {

    private Integer pvp = 100;

    private String color = "Blanco";

    private char consumo = 'F';

    private Integer peso = 5;

    public Aparato() {
        this.pvp = aplicarDescuento(pvp, color, consumo);
    }

    public Aparato(Integer pvp, Integer peso) {
        this.pvp = aplicarDescuento(pvp, color, consumo);
        this.peso = peso;
    }

    public Aparato(Integer pvp, String color, char consumo, Integer peso) {
        switch (color) {
            case "Blanco", "Negro", "Rojo", "Azul", "Gris" -> this.color = color;
            default -> {
                System.out.print("Se ha introducido un valor no contemplado, ");
                System.out.println("se ha asignado el color por defecto 'Blanco'. \n");
                this.color = "Blanco";
            }
        }
        this.consumo = comprobarConsumo(consumo);
        this.pvp = aplicarDescuento(pvp, this.color, this.consumo);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "PVP: " + pvp + "\n" + "Color: " + color + "\n" + "Consumo: " + consumo + "\n" + "Peso: " + peso + "\n";
    }

    public char comprobarConsumo(char letra) {
        if (letra < 65 || letra > 70) {
            System.out.print("Se ha introducido un valor no contemplado, ");
            System.out.println("se ha asignado el consumo por defecto 'F'.\n");
            return 'F';
        }
        return letra;
    }

    public Integer aplicarDescuento(Integer pvp, String color, char consumo) {
        if (!color.equals("Gris")) {
            pvp = (int) (pvp * 1.05);
        }
        switch (consumo) {
            case 'A' -> pvp = (int) (pvp * 0.8);
            case 'B' -> pvp = (int) (pvp * 0.85);
            case 'C' -> pvp = (int) (pvp * 0.9);
            case 'D' -> pvp = (int) (pvp * 0.95);
            default -> {
            }
        }
        return pvp;
    }
}
