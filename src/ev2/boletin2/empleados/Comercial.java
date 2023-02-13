package ev2.boletin2.empleados;

public class Comercial extends Empleado {

    private double comision;

    public Comercial(String nombre, int edad, int salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + "Comisión = " + comision;
    }

    public void plus(){
        if (getEdad() > 30 && comision > 200){
            setSalario((int) (getSalario()+comision));
        }
    }
}
