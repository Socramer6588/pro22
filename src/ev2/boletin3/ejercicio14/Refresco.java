package ev2.boletin3.ejercicio14;

public class Refresco extends Bebida {

    private double porcentajeAzucar;

    public Refresco() {
        super();
        this.porcentajeAzucar = 0;
    }

    public Refresco(int identificador, String nombre, String localizacion, double precio, String envase, double porcentajeAzucar) {
        super(identificador, nombre, localizacion, precio, envase);
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    @Override
    void calcularPrecio() {
        if (getEnvase().equals("lata")) setPrecio(getPrecio()*0.95);
        if (getPorcentajeAzucar() > 10) setPrecio(getPrecio()*1.1);
    }
}
