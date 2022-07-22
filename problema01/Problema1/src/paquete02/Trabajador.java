/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author mateovalarezoo
 */
public class Trabajador {
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public Trabajador(String cedula, String nombres, String correo, double sueldo, String mesSueldo) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.correo = correo;
        this.sueldo = sueldo;
        this.mesSueldo = mesSueldo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setMesSueldo(String mesSueldo) {
        this.mesSueldo = mesSueldo;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String  obtenerNombres() {
        return nombres;
    }

    public String  obtenerCorreo() {
        return correo;
    }

    public double  obtenerSueldo() {
        return sueldo;
    }

    public String  obtenerMesSueldo() {
        return mesSueldo;
    }
    
    
    
}
