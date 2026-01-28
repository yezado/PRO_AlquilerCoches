/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utiles;

import java.util.Scanner;


public class ES {
    
     static public int leerentero(String _msg, int _min, int _max) {
        Scanner s = new Scanner(System.in);
        boolean datoValido = false;

        int num = 0;
        do {
            try {
                System.out.print(_msg);
                System.out.println("");
                num = Byte.parseByte(s.nextLine());

                if (num >= _min && num <= _max) {
                    datoValido = true;
                } else {
                    System.out.printf("Debe ser un n�mero entre %d y %d.\n", _min, _max);
                }
            } catch (Exception e) {
                System.out.print("El dato introducido no es correcto");
                System.out.println(" Por favor, introduzca un valor correcto.");
            }
        } while (!datoValido);

        return num;
    }

    static public int leerEntero(String _msg) {
        Scanner s = new Scanner(System.in);
        boolean datoValido = false;

        int num = 0;
        do {
            try {
                System.out.print(_msg);
                System.out.println("");
                num = Integer.parseInt(s.nextLine());

                datoValido = true;

            } catch (Exception e) {
                System.out.print("El dato introducido no es correcto");
                System.out.println(" Por favor, introduzca un valor correcto.");
            }
        } while (!datoValido);

        return num;
    }

    static public byte leerByte(String _msg) {
        Scanner s = new Scanner(System.in);
        boolean datoValido = false;

        byte num = 0;
        do {
            try {
                System.out.print(_msg);
                num = Byte.parseByte(s.nextLine());

                datoValido = true;
            } catch (Exception e) {
                System.out.print("El dato introducido no es correcto");
                System.out.println(" Por favor, introduzca un valor correcto.");
            }
        } while (!datoValido);

        return num;
    }

    static public Boolean leerBoolean(String cadena) {
        
        Scanner sb = new Scanner(System.in);
        
        String usuario;
        
        boolean decision, opcionvalida;
        
        opcionvalida = false;
        
        decision = false;

        do {
            try {

                System.out.println(cadena);
                usuario = sb.next();
                
                if (usuario.toUpperCase().equals("SI") || usuario.toUpperCase().equals("S")) {
                    opcionvalida = true;
                    decision = true;
                    
                } else if (usuario.toUpperCase().equals("NO") || usuario.toUpperCase().equals("N")) {

                    opcionvalida = false;
                    decision = false;

                }
            } catch (Exception e) {
                System.out.print("El dato introducido no es correcto");
                System.out.println(" Por favor, introduzca un valor correcto entre si o no");
            }
        } while (opcionvalida == false);

        return decision;
    }

    public static void escribirLn(String _cadena) {
        System.out.println(_cadena);
    }

    public static void escribir(String _cadena) {
        System.out.print(_cadena);
    }

    public static String leerCadena(String introduzca_el_nombre_del_pinguino__) {
        
        Scanner sb = new Scanner(System.in);
        String cadena;
        System.out.println(introduzca_el_nombre_del_pinguino__);
        
        cadena = sb.nextLine();
        
        return cadena;
    
    
    }
}
