/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pro_alquilervehiculos;

/**
 *
 * @author dam1
 */
public class PRO_AlquilerVehiculos {

    private final int MAX_ALQUILERES = 20;
    private final int MAX_CLIENTES = 10;
    private final int MAX_VEHICULOS = 40;

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

    }

    private Cliente getCliente(String dnic) {

        for (int i = 0; i < 10; i++) {
            if (cliente[i].getDni().equals(dnic)) {
                return cliente[i];

            }

        }
        return null;
    }
    
    private Cliente añadirCliente(S)

}
