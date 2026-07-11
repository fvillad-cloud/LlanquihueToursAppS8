/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase base (Superclase) que representa a una Persona en el sistema.
 * Contiene los atributos y comportamientos comunes que comparten todos los 
 * roles específicos (como Administradores, Colaboradores y Guías).
 * @author Francisco
 */
public class Persona {
    // Atributos privados para proteger y encapsular los datos básicos de la persona
    private String nombre;
    private String rut;
    private String telefono;

    /**
     * Constructor de la clase Persona
     * Se encarga de inicializar los datos fundamentales de cualquier registro
     * 
     * @param nombre   Nombre completo de la persona
     * @param rut      RUT de la persona
     * @param telefono Numero de contacto de la persona
     */
    
    public Persona(String nombre, String rut, String telefono) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
    /**
     * Genera una cadena de texto formateada con todos los datos básicos de la persona.
     * Este método es crucial ya que es reutilizado por las subclases.
     * 
     * @return String formateado con saltos de línea listos para impresión.
     */
    
    public String mostrarDatos(){
        return "Nombre              : "+nombre+
               "\nRUT                    : "+rut+
               "\nTelefono             : "+telefono+"\n";
    }
    
}
