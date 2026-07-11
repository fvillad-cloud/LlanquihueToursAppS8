/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase que representa a un Administrador dentro del sistema.
 * Es una subclase que hereda los atributos generales de "Persona"
 * e implementa el contrato de la interfaz "Registrable".
 * @author Francisco
 */
public class Administrador extends Persona implements Registrable{
    
    // Atributo específico de la clase Administrador
    private String area;

    /**
     * Constructor de la clase Administrador.
     * Inicializa tanto los atributos heredados de la clase padre (Persona)
     * como los atributos propios de esta clase.
     * 
     * @param area     El departamento o sección que gestiona el administrador.
     * @param nombre   Nombre de la persona (heredado).
     * @param rut      RUT de la persona (heredado).
     * @param telefono Número de contacto de la persona (heredado).
     */
    public Administrador(String area, String nombre, String rut, String telefono) {
        super(nombre,rut, telefono);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    /**
     * Implementación obligatoria del método de la interfaz "Registrable".
     * Construye un resumen textual combinando los datos generales de la persona
     * con los datos específicos del administrador.
     * 
     * @return String con la información completa consolidada.
     */
    
    @Override
    public String mostrarResumen() {
        return super.mostrarDatos()+"Area de Servicio   :"+area;
    }
    
    
}
