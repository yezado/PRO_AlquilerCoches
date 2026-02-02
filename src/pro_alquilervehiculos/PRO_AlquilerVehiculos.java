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

    private final static int MAX_ALQUILERES = 50;
    private final static int MAX_CLIENTES = 50;
    private final static int MAX_VEHICULOS = 50;

    private static Cliente[] cliente;
    private static Vehiculo[] vehiculo;
    private static Alquiler[] alquileres;

    private static int numVehiculos;
    private static int numClientes;
    private static int numAlquileres;

    //contructores
    public PRO_AlquilerVehiculos() {

        vehiculo = new Vehiculo[MAX_VEHICULOS];
        cliente = new Cliente[MAX_CLIENTES];
        alquileres = new Alquiler[MAX_ALQUILERES];

    }

    public static void main(String[] args) {

        int opcion;

        do {
            
            
            Menu();
            opcion = ES.leerentero("Introduce una opcion del menu", 0, 9);
            switch (opcion) {
                case 1:
                    String dni = ES.leerCadena("introduzca el dni del Cliente");
                    String nombre = ES.leerCadena("introduzca el nombre del Cliente");
                    String direccion = ES.leerCadena("introduzca la direccion del Cliente");
                    String localidad = ES.leerCadena("introduzca la localidad del Cliente");
                    String codigoPostal = ES.leerCadena("introduzca el codigo postal del Cliente");
                    Cliente c = new Cliente(dni, nombre, direccion, localidad, codigoPostal);
                    añadirCliente(c);
                    break;
                case 2:

                case 3:
                    String matricula = ES.leerCadena("Introduce la matricula").toUpperCase();

                    if (!Utiles.comprobarMatricula(matricula)) {
                        ES.escribirLn("Matricula incorrecta (formato 0000AAA)");
                        break;
                    } else {
                    }

                    String marca = ES.leerCadena("Introduce la marca");
                    String modelo = ES.leerCadena("Introduce el modelo");
                    int cilindrada = ES.leerEntero("Introduce la cilindrada");
                    Vehiculo v = new Vehiculo(matricula, marca, modelo, cilindrada);
                    añadirVehiculo(v);
                    break;

                case 4:
                    listarVehiculo();
                    break;
                case 5:
                    dni = "";
                    borrarCliente(dni);
                    break;

                case 6: // Borrar vehiculo
                    matricula = ES.leerCadena("Introduce la matricula del vehiculo a borrar");
                    borrarVehiculo(matricula);
                    break;

                case 7: // Abrir alquiler
                    String dnic = ES.leerCadena("Introduce el DNI del cliente");
                    matricula = ES.leerCadena("Introduce la matricula del vehiculo");

                    Cliente cli = getCliente(dnic);
                    Vehiculo veh = getVehiculo(matricula);

                    nuevoAlquiler(cli, veh);
                    break;

                case 8: // Cerrar alquiler
                    cerrarAlquiler();
                    break;

                case 9: // Listar alquileres
                    listarAlquileres();
                    break;

                case 0:
                    ES.escribirLn("Saliendo del programa...");
                    break;
            }

        } while (opcion != 0);
    }

    private static Cliente getCliente(String dnic) {

        for (int i = 0; i < MAX_CLIENTES; i++) {
            if (cliente[i].getDni().equals(dnic)) {
                return cliente[i];

            }

        }
        return null;
    }

    private static Vehiculo getVehiculo(String matricula) {

        for (int i = 0; i < MAX_VEHICULOS; i++) {
            if (vehiculo[i].getMatricula().equals(matricula)) {
                return vehiculo[i];

            }

        }
        return null;
    }

    private static void añadirCliente(Cliente c) {
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

    private static void añadirVehiculo(Vehiculo v) {
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

    private static void borrarVehiculo(String v) {

        for (int i = 0; i < MAX_VEHICULOS; i++) {

            if (vehiculo[i].getMatricula().equals(v)) {
                vehiculo[i] = null;
                numVehiculos--;
            }

        }

    }

    private static void nuevoAlquiler(Cliente c, Vehiculo v) {

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

    private static void borrarCliente(String c) {

        for (int i = 0; i < MAX_CLIENTES; i++) {

            if (cliente[i].getDni().equals(c)) {
                cliente[i] = null;
                numClientes--;
            }

        }

    }

    private static void listarCliente() {

        for (int i = 0; i < MAX_CLIENTES; i++) {

            ES.escribirLn(cliente[i].toString());

        }

    }

    private static void listarVehiculo() {

        for (int i = 0; i < MAX_VEHICULOS; i++) {

            ES.escribirLn(vehiculo[i].toString());

        }

    }

    private static void cerrarAlquiler() {

        String dnic = ES.leerCadena("DNI del cliente");
        String matricula = ES.leerCadena("Matricula del vehiculo");

        for (int i = 0; i < numAlquileres; i++) {
            if (alquileres[i].getCliente().getDni().equals(dnic)
                    && alquileres[i].getVehiculo().getMatricula().equals(matricula)) {

                alquileres[i].Cerrar();
                ES.escribirLn("Alquiler cerrado. Precio: " + alquileres[i].precioAlquiler());
                return;
            }
        }
        ES.escribirLn("No se encontro el alquiler");
    }

    private static void listarAlquileres() {
        if (numAlquileres == 0) {
            ES.escribirLn("No hay alquileres");
            return;
        }

        for (int i = 0; i < numAlquileres; i++) {
            ES.escribirLn(alquileres[i].toString());
        }
    }

    private static void Menu() {
        
        ES.escribirLn("1. Añadir cliente");
        ES.escribirLn("2. Listar clientes");
        ES.escribirLn("3. Añadir vehiculo");
        ES.escribirLn("4. Listar vehiculos");
        ES.escribirLn("5. Borrar cliente");
        ES.escribirLn("6. Borrar vehiculo");
        ES.escribirLn("7. Abrir alquiler");
        ES.escribirLn("8. Cerrar alquiler");
        ES.escribirLn("9. Listar alquileres");
        ES.escribirLn("0. Salir");
        
    }

}
