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

    //constructores
    private Cliente(String dni, String nombre, String direccion, String localidad, String codigoPostal) {

        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;

    }

    private Cliente(Cliente OtroCliente) {

        this.dni = OtroCliente.dni;
        this.nombre = OtroCliente.nombre;
        this.direccion = OtroCliente.direccion;
        this.localidad = OtroCliente.localidad;
        this.codigoPostal = OtroCliente.codigoPostal;

    }
    
    public String getDni(){
    
    return dni;
    
    } 
    
     public String getNombre(){
     
     return nombre;
     
     }
          
     public String getDireccion(){
     return nombre;
     
     }
     
     public String getLocalidad(){
     
     return nombre;
     }
     
     public String getCodigoPostal(){
     
     return codigoPostal;
     }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", codigoPostal=" + codigoPostal + '}';
    }
     
    
     
}
