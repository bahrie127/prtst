/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.server.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import pretest.entity.PertemuanPraktikum;
import pretest.entity.Praktikum;
import pretest.service.PraktikumService;

/**
 *
 * ini adalah class PraktikumServiceImpl
 */
public class PraktikumServiceImpl extends UnicastRemoteObject implements PraktikumService {

    EntityManager em;

    public PraktikumServiceImpl() throws RemoteException {
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(Praktikum praktikum) {
        try {
            em.getTransaction().begin();
            em.persist(praktikum);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Praktikum praktikum) {
        try {
            em.getTransaction().begin();
            em.remove(praktikum);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public Praktikum findPraktikum(Long id) {
        return (Praktikum) em.createQuery("select p from Praktikum p where p.id=:id").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<Praktikum> findPraktikums() {
        return em.createQuery("select p from Praktikum p").getResultList();
    }

    @Override
    public List<Praktikum> findPraktikums(Praktikum praktikum) {
        String where = "";
        if (praktikum.getId() != null) {
            where += " o.id = :id AND ";
        }
        if (praktikum.getNama() != null && !praktikum.getNama().isEmpty()) {
            where += " o.nama like :nama ";
        }

        where = where.trim();
        if (!where.isEmpty()) {
            where = " where " + where;
        }
        if (where.endsWith("AND")) {
            where = where.substring(0, where.length() - 3);
        }

        Query query = em.createQuery("from Praktikum o " + where + " order by o.id ");

        if (praktikum.getId() != null) {
            query.setParameter("id", praktikum.getId());
        }
        if (praktikum.getNama() != null && !praktikum.getNama().isEmpty()) {
            query.setParameter("nama", "%" + praktikum.getNama() + "%");
        }

        List list = query.getResultList();
        return list;
    }

    @Override
    public Long countPraktikums() {
        return (Long) em.createQuery("select count(o) from Praktikum o").getSingleResult();
    }

    @Override
    public void save(PertemuanPraktikum pertemuanPraktikum) {
        try {
            em.getTransaction().begin();
            if (pertemuanPraktikum.getId() == null) {
                em.persist(pertemuanPraktikum);
            } else {
                em.merge(pertemuanPraktikum);
            }
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(PertemuanPraktikum pertemuanPraktikum) {
        try {
            em.getTransaction().begin();
            em.remove(pertemuanPraktikum);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public PertemuanPraktikum findPertemuanPraktikum(Long id) {
        return (PertemuanPraktikum) em.createQuery("select p from PertemuanPraktikum p where p.id=:id").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<PertemuanPraktikum> findPertemuanPraktikums() {
        return em.createQuery("select p from PertemuanPraktikum p").getResultList();
    }

    @Override
    public List<PertemuanPraktikum> findPraktikumPertemuans(Praktikum praktikum) {
        return em.createQuery("select p from PertemuanPraktikum p where p.praktikum=:praktikum").setParameter("praktikum", praktikum).getResultList();
    }

    @Override
    public List<PertemuanPraktikum> findPertemuanPraktikums(PertemuanPraktikum pertemuanPraktikum) {
        String where = "";
        if (pertemuanPraktikum.getId() != null) {
            where += " o.id = :id AND ";
        }

        if (pertemuanPraktikum.getPraktikum() != null && pertemuanPraktikum.getPraktikum().getId() != null) {
            where += " o.praktikum.id = :praktikum ";
        }

        where = where.trim();
        if (!where.isEmpty()) {
            where = " where " + where;
        }
        if (where.endsWith("AND")) {
            where = where.substring(0, where.length() - 3);
        }

        Query query = em.createQuery("select o from PertemuanPraktikum o " + where + " order by o.id ");

        if (pertemuanPraktikum.getId() != null) {
            query.setParameter("id", pertemuanPraktikum.getId());
        }

        if (pertemuanPraktikum.getPraktikum() != null && pertemuanPraktikum.getPraktikum().getId() != null) {
            query.setParameter("praktikum", pertemuanPraktikum.getPraktikum().getId());
        }
        return query.getResultList();
    }

    @Override
    public Long countPertemuanPraktikums() {
        return (Long) em.createQuery("select count(o) from PertemuanPraktikum o").getSingleResult();
    }
}
