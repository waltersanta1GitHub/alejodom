/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quimiespel.quimiespel.fachadas;

import com.quimiespel.quimiespel.entidades.Areas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jose.santamaria
 */
@Stateless
public class AreasFacade extends AbstractFacade<Areas> {

    @PersistenceContext(unitName = "com.quimiespel_quimiespel_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AreasFacade() {
        super(Areas.class);
    }
    
}
