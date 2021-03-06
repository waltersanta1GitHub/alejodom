/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quimiespel.quimiespel.fachadas;

import com.quimiespel.quimiespel.entidades.Estadomaterial;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jose.santamaria
 */
@Stateless
public class EstadomaterialFacade extends AbstractFacade<Estadomaterial> {

    @PersistenceContext(unitName = "com.quimiespel_quimiespel_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadomaterialFacade() {
        super(Estadomaterial.class);
    }
    
}
