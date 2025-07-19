/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agrocomercial.agrocliente.dominio.Entidades;

/**
 *
 * @author valec

/**
 * Representa a un Comprador dentro del sistema.
 * Extiende de Persona e incluye métodos para gestión de pedidos (aún no implementados).
 * 
 * @author valec
 */
public class Comprador extends Persona {

    public Comprador(String nombre, String apellido, String identificacion) {
        super(nombre, apellido, identificacion);
    }

    /**
     * Método para crear un pedido. Aún no implementado porque no existe la clase Pedido.
     */
    public void crearPedido() {
        System.out.println("crearPedido() aún no implementado.");
    }

    /**
     * Método para cancelar un pedido. Aún no implementado porque no existe la clase Pedido.
     */
    public void cancelarPedido() {
        System.out.println("cancelarPedido() aún no implementado.");
    }
}
