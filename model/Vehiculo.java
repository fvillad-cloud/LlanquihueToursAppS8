/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Francisco
 */
public class Vehiculo implements Registrable{

    @Override
    public String mostrarResumen() {
        return """
               Modelo  : Kia Morning
               Anio    : 2024
               Patente : JRGS-32""" ;
    }
    
}
