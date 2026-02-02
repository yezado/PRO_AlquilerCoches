/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro_alquilervehiculos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utiles {
    
    static boolean comprobarMatricula(String matricula)
    {
        boolean valido = false;
        matricula = matricula.toUpperCase();
        Pattern pat = Pattern.compile("^\\d{4}[A-Z]{3}$");
        Matcher mat = pat.matcher(matricula);
       
        valido = mat.find();
        return valido;
    }
   
    public static boolean comprobarDni(String dni)
    {
        boolean valido = false;
        String letraDni;
        int restoDni;
        final String [] letrasDni =   {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int numerosDni;
        Pattern pat = Pattern.compile("^\\d{8}[A-Z]$");
        Matcher mat = pat.matcher(dni);
       
        if (mat.find() == true)      
        {
           
            numerosDni = Integer.parseInt(dni.replaceAll("\\D+", ""));
            restoDni = numerosDni%23;
            letraDni = dni.substring(dni.length()-1);
           
            if (letraDni.equals(letrasDni[restoDni]) )
            {
                valido = true;
            }
        }
       
        return valido;
    }
   
    public static boolean comprobarCodigoPostal(String codigoPostal)
    {
        boolean valido = false;
        Pattern pat = Pattern.compile("^(?:0[1-9]|[1-4]\\d|5[0-2])\\d{3}$");
        Matcher mat = pat.matcher(codigoPostal);
       
        if (mat.find() == true)
        {
         valido = true;
        }
        return valido;
    }
    
}
