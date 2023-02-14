package ev2.boletin1.aeronave;

public class Main {
    public static void main(String[] args) {
        Aeronave aeronave = new AvionHelice("346", 60, 110, "ASE83");
        Aeropuerto aeropuertoDestino = new Aeropuerto("56378", "Barajas", new Localizacion("Madrid", "Av.aereopuerto2", 2323, 24525));
        Localizacion localizacion = new Localizacion("Almería", "Madrid", 6474, 48346);
        Aeropuerto aeropuerto = new Aeropuerto("1234", "Costacabana", localizacion);
        Vuelo vuelo = new Vuelo(aeropuerto, aeropuertoDestino, aeronave);
    }
}
