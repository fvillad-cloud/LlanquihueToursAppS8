/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase que representa a un Colaborador Externo dentro del sistema.
 * Hereda de "Persona" e implementa la interfaz "Registrable" para estandarizar su salida.
 * @author Francisco
 */
public class ColaboradorExterno extends Persona implements Registrable{
    // Atributo específico para almacenar el tipo de servicio que presta el colaborador
    private String tipoServicio;
    
    
    /**
     * Constructor de la clase ColaboradorExterno.
     * Pasa los datos generales a la clase padre mediante "super" e inicializa el atributo local.
     * 
     * @param tipoServicio Tipo de prestación o soporte que realiza el externo
     * @param nombre       Nombre del colaborador (heredado) 
     * @param rut          RUT del colaborador (heredado)
     * @param telefono     Numero de contacto del colaborador (heredado)
     */
    public ColaboradorExterno(String tipoServicio, String nombre, String rut, String telefono) {
        super(nombre, rut, telefono);
        this.tipoServicio = tipoServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    /**
     * Implementación del método requerido por la interfaz "Registrable".
     * Une los datos base de la persona con la información del atributo propio de colaborador.
     * @return String con toda la informacion resumida
     */
    @Override
    public String mostrarResumen() {
        return super.mostrarDatos() + "Tipo de Servicio : "+tipoServicio;
    }
    
    
}
