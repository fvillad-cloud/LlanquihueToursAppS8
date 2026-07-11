/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase que representa a un Guía Turístico dentro del sistema.
 * Hereda las características base de "Persona" e implementa la interfaz 
 * "Registrable" para definir su comportamiento de resumen.
 * @author Francisco
 */
public class GuiaTuristico extends Persona implements Registrable{
    
    // Atributo específico que almacena el área de enfoque del guía
    private String especialidad; //Historico, Gastronomico, Naturaleza, Aventuras, Ciudad, etc.

    /**
     * Constructor de la clase GuiaTuristico..
     * 
     * @param especialidad Tipo de turismo en el que se enfoca el guía.
     * @param nombre       Nombre del guía (heredado).
     * @param rut          RUT del guía (heredado).
     * @param telefono     Teléfono de contacto del guía (heredado).
     */
    public GuiaTuristico(String especialidad, String nombre, String rut, String telefono) {
        super(nombre, rut, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Implementación del método de la interfaz "Registrable"
     * 
     * @return String con los datos consolidados del guía turístico.
     */
    @Override
    public String mostrarResumen() {
        return super.mostrarDatos()+"Especialidad       : "+especialidad;
    }


    
    
}
