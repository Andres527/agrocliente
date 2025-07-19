/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agrocomercial.agrocliente.dominio.Entidades;

import java.util.Date;



/**
 *
 * @author Yesid
 */
public class EntidadBase {
    
    private int Id;
    private final Date fechaCreacion;
    
    
    public EntidadBase(){
        this.fechaCreacion = new Date();
    }

    public Date getFechaCreacion(){
        return this.fechaCreacion;
    }
    
    public int getId() {
        return Id;
    }


    public void setId(int Id) {
        this.Id = Id;
    }
    
    
    
}
