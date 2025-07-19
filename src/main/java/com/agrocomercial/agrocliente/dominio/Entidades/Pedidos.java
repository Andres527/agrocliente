/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agrocomercial.agrocliente.dominio.Entidades;

/**
 *
 * @author estudiante
 */
public class Pedidos extends EntidadBase {
    private int pedidoInt ;
    private int numeroOrden;

    /**
     * @return the pedidoInt
     */
    public int getPedidoInt() {
        return pedidoInt;
    }

    /**
     * @param pedidoInt the pedidoInt to set
     */
    public void setPedidoInt(int pedidoInt) {
        this.pedidoInt = pedidoInt;
    }

    /**
     * @return the numeroOrden
     */
    public int getNumeroOrden() {
        return numeroOrden;
    }

    /**
     * @param numeroOrden the numeroOrden to set
     */
    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }
    
}
