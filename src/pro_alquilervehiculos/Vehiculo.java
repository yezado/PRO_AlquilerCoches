package pro_alquilervehiculos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Vehiculo {

    private String matricula;

    private String marca;

    private String modelo;

    private int cilindrada;

    private boolean disponible;

    //CONSTRUCTORES
    public Vehiculo(String matricula, String marca, String modelo, int cilindrada) {

        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;

    }

    public Vehiculo(Vehiculo OtroVehiculo) {

        this.matricula = OtroVehiculo.matricula;
        this.marca = OtroVehiculo.marca;
        this.modelo = OtroVehiculo.modelo;
        this.cilindrada = OtroVehiculo.cilindrada;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", disponible=" + disponible + '}';
    }

}
