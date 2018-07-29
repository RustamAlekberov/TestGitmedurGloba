/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startingjpa;

import Entitiler.Qrup;
import Entitiler.Telebe;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rusta
 */
public class StartingJPA {

    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testPU");
        EntityManager em = emf.createEntityManager();
        
        Qrup obj = em.find(Qrup.class, 1);
               
        
        em.remove(obj);
        
        em.getTransaction().begin();
        em.getTransaction().commit();
        System.out.println("Melumat deyishidi!");

//        List<Qrup> list = em.createNamedQuery("Qrup.findAll", Qrup.class).getResultList();
//        
//        for (Qrup qrup : list) {
//            System.out.println(qrup.getQrupAdi()+" "+qrup.getQrupKodu());
//        }
        
//        Telebe obj = new Telebe();
//        obj.setAd("Aytac");
//        obj.setSoyad("Novruzlu");
//        obj.setYash(24);
//        obj.setIdQrup(em.find(Qrup.class, 1));
//          em.persist(obj);
//        em.getTransaction().begin();
//        em.getTransaction().commit();
//        System.out.println("Melumat yuklendi!");
//        


//List<Telebe> list = em.createNamedQuery("Telebe.findAll", Telebe.class).getResultList();
//        for (Telebe telebe : list) {
//            System.out.println(telebe.getAd()+" "+telebe.getSoyad()+" "+telebe.getIdQrup().getQrupAdi());
//        }

 
    }
    
}
