/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pro_alquilervehiculos;

import Utiles.ES;

/**
 *
 * @author dam1
 */
public class PRO_AlquilerVehiculos {

    private final int MAX_ALQUILERES = 50;
    private final int MAX_CLIENTES = 50;
    private final int MAX_VEHICULOS = 50;

    private Cliente[] cliente;
    private Vehiculo[] vehiculo;
    private Alquiler[] alquileres;

    private int numVehiculos;
    private int numClientes;
    private int numAlquileres;

    //contructores
    public PRO_AlquilerVehiculos() {

        vehiculo = new Vehiculo[MAX_VEHICULOS];
        cliente = new Cliente[MAX_CLIENTES];
        alquileres = new Alquiler[MAX_ALQUILERES];

    }

    public static void main(String[] args) {

        int opcion;
        
        opcion = ES.leerentero("Introduce opcion premo", 0, 9);
        
        switch(opcion){
            case 1: getcliente(dnic);
        
        
        }
        
        
        
        
        ES.escribirLn("Cliente");
    }

    private Cliente getCliente(String dnic) {

        for (int i = 0; i < MAX_CLIENTES; i++) {
            if (cliente[i].getDni().equals(dnic)) {
                return cliente[i];

            }

        }
        return null;
    }

    private Vehiculo getVehiculo(String matricula) {

        for (int i = 0; i < MAX_VEHICULOS; i++) {
            if (vehiculo[i].getMatricula().equals(matricula)) {
                return vehiculo[i];

            }

        }
        return null;
    }

    private void añadirCliente(Cliente c) {
        boolean b = false;
        for (int i = 0; i < MAX_CLIENTES && !b; i++) {
            if (numClientes < MAX_CLIENTES) {
                if (!cliente[i].getDni().equals(c.getDni())) {
                    cliente[i] = c;
                    numClientes++;
                    b = true;
                } else {

                    ES.escribirLn("Hay dos clientes con el mismo DNI");
                }

            } else {

                ES.escribirLn("No hay hueco disponible");

            }

        }

    }

    private void añadirVehiculo(Vehiculo v) {
        boolean b = false;
        for (int i = 0; i < MAX_VEHICULOS && !b; i++) {
            if (numVehiculos < MAX_VEHICULOS) {
                if (!vehiculo[i].getMatricula().equals(v.getMatricula())) {
                    vehiculo[i] = v;
                    numVehiculos++;
                    b = true;
                } else {

                    ES.escribirLn("Hay dos vehiculos con la misma matricula");
                }

            } else {

                ES.escribirLn("No hay hueco disponible");

            }

        }

    }

    private void borrarVehiculo(Vehiculo v) {

        for (int i = 0; i < MAX_VEHICULOS; i++) {

            if (vehiculo[i].equals(v.getMatricula())) {
                vehiculo[i] = null;
                numVehiculos--;
            }

        }

    }

    private void nuevoAlquiler(Cliente c, Vehiculo v) {

        v.isDisponible();

        if (v.isDisponible() == false) {
            ES.escribirLn("El vehiculo no esta disponible");

        } else {

            new Alquiler(c, v);

            if (numAlquileres < MAX_ALQUILERES) {

                alquileres[numAlquileres] = new Alquiler(c, v);

                numAlquileres++;
            }
        }

    }

}
