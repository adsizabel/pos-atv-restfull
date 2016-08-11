/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.atv.restfull;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Izabel Silva
 */

@Path("cliente")
@Stateless
public class ClienteResource {
    
    @PersistenceContext()
    private EntityManager em;;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void salvar(Cliente cliente){
        em.persist(cliente);
    }
    
//    public List<Cliente> listarCliente(){
//        return clientes;
//    }
    
}
