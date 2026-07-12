/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.List;
import model.Administrador;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Persona;

/**
 * Clase encargada de administrar y centralizar el almacenamiento de diferentes
 * tipos de personas (Administradores, Colaboradores y Guías) utilizando una sola lista.
 * @author Francisco
 */
public class GestorEntidades {
    // Atributo privado que almacena la lista de personas. 
    // Se usa la interfaz generica "List" apuntando a la clase padre "Persona".
    private List<Persona> listaEntidades;

    /**
     * Constructor de la clase.
     * Se encarga de inicializar la lista como un ArrayList vacio cuando se crea el gestor.
     */
    public GestorEntidades() {
        listaEntidades = new ArrayList<>();
    }

    /**
     * Método para registrar una nueva entidad en la lista.
     * Gracias al polimorfismo, recibe cualquier objeto que sea una "Persona" o sus hijos.
     * 
     * @param entidad Objeto de tipo Persona (puede ser Administrador, GuiaTuristico, etc.)
     */
    
    public void agregarEntidad(Persona entidad) {
        listaEntidades.add(entidad);
    }
    
    /**
     * Método que recorre la lista, identifica el tipo específico de cada objeto
     * y genera una cadena de texto "resumen" con la informacion de todas las entidades.
     * 
     * @return "resumen" con los datos formateados de todos los registros.
     */
    public String obtenerResumen(){
        // Validacion: Si la lista no tiene elementos, avisa por consola.
        
        if (listaEntidades.isEmpty()){
            System.out.println("No hay registros almacenados");
        }
        String resumen = "";
        
        // Bucle "for-each": Recorre cada elemento de la lista.
        for (Persona entidad:listaEntidades){
            if (entidad instanceof Administrador){
                Administrador admin = (Administrador) entidad;
                resumen +="=== Administrador ===\n";
                resumen += admin.mostrarResumen();
                
            }else if (entidad instanceof ColaboradorExterno){
                ColaboradorExterno colab = (ColaboradorExterno) entidad;
                resumen +="=== Colaborador Externo ===\n";
                resumen +=colab.mostrarResumen();
            }else if (entidad instanceof GuiaTuristico){
                GuiaTuristico guia = (GuiaTuristico) entidad;
                resumen +="=== Guía Turistico ===\n";
                resumen += guia.mostrarResumen();
            }
            resumen+="\n-----------------------------------------------\n";
        }
        return resumen;
    }

    public List<Persona> getListaEntidades() {
        return listaEntidades;
    }

    
    
}
