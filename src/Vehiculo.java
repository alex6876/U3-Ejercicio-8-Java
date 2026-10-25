public class Vehiculo {
    private String modelo;
    private String patente;
    private double kilometrajeAcumulado;

    public Vehiculo(String modelo, String patente) {
        this.modelo = modelo;
        this.patente = patente;
        if(kilometrajeAcumulado > 0){
            this.kilometrajeAcumulado = kilometrajeAcumulado;
        }else{
            this.kilometrajeAcumulado = 0;
        }
    }

    public void avanzar( double kilometro){
        if(kilometro > 0){
            kilometrajeAcumulado = kilometrajeAcumulado + kilometro;
        }else{
            System.out.println("El kilometraje debe ser mayor a 0.");
        }
    }

    public Double getKilometrajeAcumulado() {
        return kilometrajeAcumulado;
    }

}
