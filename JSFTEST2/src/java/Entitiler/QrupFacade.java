/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitiler;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rusta
 */
@Stateless
public class QrupFacade extends AbstractFacade<Qrup> {

    @PersistenceContext(unitName = "JSFTEST2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public QrupFacade() {
        super(Qrup.class);
    }
    
}
