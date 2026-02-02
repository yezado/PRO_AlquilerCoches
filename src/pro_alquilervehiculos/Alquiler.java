/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro_alquilervehiculos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class Alquiler {

    private final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private final double PRECIO_DIA = 35;

    private LocalDateTime fecha;

    private int dias;

    private Cliente cliente;

    private Vehiculo turismo;

    //CONSTRUCTORES
    public Alquiler(Cliente cliente, Vehiculo turismo) {

        this.cliente = cliente;
        this.turismo = turismo;

    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getDias() {
        return dias;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public Vehiculo getVehiculo() {
        return turismo;
    }

    public double precioAlquiler() {
        double precioFinal;

        precioFinal = this.PRECIO_DIA * dias + this.turismo.getCilindrada() / 100;
        return precioFinal;
    }

    public void Cerrar() {

        LocalDateTime fechadeCierre = LocalDateTime.now();
        dias = diferenciaDias(fecha, fechadeCierre);
        if (dias == 0) {
            dias++;

        }

        System.out.println("los dias que se ha alquilado el vehiculo han sido: ");
        diferenciaDias(fecha, fechadeCierre);
        turismo.setDisponible(true);
    }

    private int diferenciaDias(LocalDateTime fecha1, LocalDateTime fecha2) {

        int diasEntre = (int) ChronoUnit.DAYS.between(fecha1, fecha2);
        return diasEntre;
    }

    @Override
    public String toString() {
        return "\n FORMATO_FECHA :" + FORMATO_FECHA
                + "\n PRECIO_DIA :" + PRECIO_DIA
                + "\n fecha :" + fecha
                + "\n dias :" + dias
                + "\n cliente :" + cliente
                + "\n turismo :" + turismo;
    }

}
