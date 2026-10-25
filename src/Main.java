public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo("Toyota supra","AF482");

        auto.avanzar(100);
        auto.avanzar(20);
        auto.avanzar(65);
        auto.avanzar(18);
        auto.avanzar(-15);
        System.out.println("Kilometraje: " + auto.getKilometrajeAcumulado());
    }
}