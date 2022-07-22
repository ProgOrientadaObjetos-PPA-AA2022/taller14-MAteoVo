/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author mateovalarezoojeda
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Estudiante(){
        
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public Estudiante(String nombre, String apellido, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    
    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public double obtenerNota1() {
        return nota1;
    }

    public void establecerNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double obtenerNota2() {
        return nota2;
    }

    public void establecerNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double obtenerNota3() {
        return nota3;
    }

    public void establecerNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void establecerPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String reporte = String.format("%s %s\n\tCalificaciones:\n"
                + "\t%.1f\n"
                + "\t%.1f\n"
                + "\t%.1f\n"
                + "\tPromedio: %.2f",
                nombre,apellido, nota1, nota2, nota3, promedio);
        return reporte;
    }
}
