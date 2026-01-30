/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro_alquilervehiculos;

/**
 *
 * @author dam1
 */
public class Cliente {

    private String dni;

    private String nombre;

    private String direccion;

    private String localidad;

    private String codigoPostal;

    private boolean baja;

    //constructores
    public Cliente(String dni, String nombre, String direccion, String localidad, String codigoPostal) {

        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;

    }

    public Cliente(Cliente OtroCliente) {

        this.dni = OtroCliente.dni;
        this.nombre = OtroCliente.nombre;
        this.direccion = OtroCliente.direccion;
        this.localidad = OtroCliente.localidad;
        this.codigoPostal = OtroCliente.codigoPostal;

    }

    public boolean getbaja() {

        return baja;

    }

    public boolean setbaja() {

        return baja;

    }

    public String getDni() {

        return dni;

    }

    public String getNombre() {

        return nombre;

    }

    public String getDireccion() {
        return direccion;

    }

    public String getLocalidad() {

        return localidad;
    }

    public String getCodigoPostal() {

        return codigoPostal;
    }

    @Override
    public String toString() {
        String cadena = "";

        if (baja == false) {

            cadena
                    = "\n dni: " + dni
                    + "\n nombre: " + nombre
                    + "\n direccion: " + direccion
                    + "\n localidad: " + localidad
                    + "\n codigoPostal: " + codigoPostal;

        }
        return cadena;
    }

}
