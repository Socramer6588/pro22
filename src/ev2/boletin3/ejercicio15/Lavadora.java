package ev2.boletin3.ejercicio15;

public class Lavadora extends Aparato{
    private int capacidad;
    private boolean secadoraIntegrada;

    public Lavadora() {
        super();
        this.capacidad = 7;
        this.secadoraIntegrada = false;
    }

    public Lavadora(double PVP, double peso) {
        super(PVP, peso);
        this.capacidad = 7;
        this.secadoraIntegrada = false;
    }

    public Lavadora(double PVP, double peso, char consumo, String color, int capacidad, boolean secadoraIntegrada) {
        super(PVP, peso, consumo, color);
        this.capacidad = capacidad;
        this.secadoraIntegrada = secadoraIntegrada;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isSecadoraIntegrada() {
        return secadoraIntegrada;
    }

    public void setSecadoraIntegrada(boolean secadoraIntegrada) {
        this.secadoraIntegrada = secadoraIntegrada;
    }

    public double aplicarDescuento() {
        super.aplicarDescuento();
        if (capacidad > 9) {
            super.setPVP(super.getPVP()+super.getPVP()*0.3);
        }
        if (!secadoraIntegrada) {
            super.setPVP(super.getPVP()-120);
        }
        return getPVP();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lavadora{");
        sb.append("capacidad=").append(capacidad);
        sb.append(", secadoraIntegrada=").append(secadoraIntegrada);
        sb.append('}');
        return sb.toString();
    }
}
