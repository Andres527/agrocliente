/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.agrocomercial.agrocliente;

import com.agrocomercial.agrocliente.dominio.Entidades.Persona;
import com.agrocomercial.agrocliente.dominio.Entidades.TipoDocumento;

/**
 *
 * @author Yesid
 */
public class Main {

    public static void main(String[] args) {
        
        TipoDocumento cc = new TipoDocumento("CC");
        
        Persona persona = new Persona("yesid","abdo");
        
        persona.setIdentificacion("1000223");
        persona.setTipoDocumento(cc);
        
        System.out.println( persona.getNombreCompleto() + " creado " + persona.getFechaCreacion());
    }
}
