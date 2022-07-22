/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.Trabajador;
import paquete03.Enlace;

/**
 *
 * @author mateovalarezoo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Enlace c = new Enlace();
        sc.useLocale(Locale.US);
        int op = 1;
        while ( op != 0) {
            System.out.println("1) Ingresar nueva ciudad en la base de datos");
            System.out.println("0) Salir");
            op = sc.nextInt();
            sc.nextLine();
            if ( op == 1) {
                System.out.println("Ingrese la cedula del trabajador:");
                String cedula = sc.nextLine();
                System.out.println("Ingrese los nombres del trabajador:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el correo del trabajador:");
                String correo = sc.nextLine();
                System.out.println("Ingrese el sueldo del trabajador:");
                double sueldo = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese el mes del sueldo del trabajador:");
                String mesSueldo= sc.nextLine();
                Trabajador trabajador = new Trabajador(cedula, nombre, correo, sueldo, mesSueldo );
                c.insertarTrabajador(trabajador);
            }
        }
    }
    
}
