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
import pretest.entity.JawabanMc;
import pretest.entity.Mahasiswa;
import pretest.entity.NilaiMc;
import pretest.entity.PertemuanPraktikum;
import pretest.entity.SoalMc;
import pretest.service.McPretestService;

/**
 *
 * ini adalah class McPretestServiceImpl
 */

public class McPretestServiceImpl extends UnicastRemoteObject implements McPretestService {

    EntityManager em;

    public McPretestServiceImpl() throws RemoteException {
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    

    @Override
    public void save(SoalMc soalMc) {
        try {
            em.getTransaction().begin();
            if(soalMc.getId()==null)
                em.persist(soalMc);
            else
                em.merge(soalMc);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(SoalMc soalMc) {
        try {
            em.getTransaction().begin();
            em.remove(soalMc);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public SoalMc findSoalMc(Long id) {
        return (SoalMc) em.createQuery("select s from SoalMc s where s.id=:id").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<SoalMc> findSoalMcs() {
        return em.createQuery("select s from SoalMc s").getResultList();
    }

    @Override
    public List<SoalMc> findSoalMcs(PertemuanPraktikum pertemuanPraktikum) {
        return em.createQuery("select s from SoalMc s where s.pertemuanPraktikum=:pertemuanPraktikum order by s.id").setParameter("pertemuanPraktikum", pertemuanPraktikum).getResultList();
    }

    @Override
    public List<SoalMc> findSoalMcs(SoalMc soalMc) {
        String where = "";
        if (soalMc.getId() != null) {
            where += " o.id = :id AND ";
        }

        if (soalMc.getPertemuanPraktikum() != null && soalMc.getPertemuanPraktikum().getId() != null) {
            where += " o.pertemuanPraktikum.id = :pertemuanPraktikum ";
        }

        where = where.trim();
        if (!where.isEmpty()) {
            where = " where " + where;
        }
        if (where.endsWith("AND")) {
            where = where.substring(0, where.length() - 3);
        }

        Query query = em.createQuery("select o from SoalMc o " + where + " order by o.id ");

        if (soalMc.getId() != null) {
            query.setParameter("id", soalMc.getId());
        }

        if (soalMc.getPertemuanPraktikum() != null && soalMc.getPertemuanPraktikum().getId() != null) {
            query.setParameter("pertemuanPraktikum", soalMc.getPertemuanPraktikum().getId());
        }
        return query.getResultList();
    }

    @Override
    public Long countSoalMcs() {
        return (Long) em.createQuery("select count(o) from SoalMc o").getSingleResult();
    }

    @Override
    public void save(JawabanMc jawabanMc) {
        try {
            em.getTransaction().begin();
            if(jawabanMc.getId()==null)
                em.persist(jawabanMc);
            else
                em.merge(jawabanMc);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(JawabanMc jawabanMc) {
        try {
            em.getTransaction().begin();
            em.remove(jawabanMc);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public JawabanMc findJawabanMc(Long id) {
        return (JawabanMc) em.createQuery("select o from JawabanMc o where o.id=:id").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<JawabanMc> findJawabanMcs() {
        return em.createQuery("select j from JawabanMc j order by j.soalMc.id").getResultList();
    }

    @Override
    public List<JawabanMc> findJawabanMcs(Mahasiswa mahasiswa) {
        return em.createQuery("select j from JawabanMc j where j.mahasiswa=:mahasiswa order by j.id").setParameter("mahasiswa", mahasiswa).getResultList();
    }

    @Override
    public List<JawabanMc> findJawabanMcs(SoalMc soalMc) {
        return em.createQuery("select j from JawabanMc j where j.soalMc=:soalMc order by j.id").setParameter("soalMc", soalMc).getResultList();
    }

    @Override
    public List<JawabanMc> findJawabanMcs(JawabanMc jawabanMc) {
        String where = "";
        if (jawabanMc.getId() != null) {
            where += " o.id = :id AND ";
        }

        if (jawabanMc.getMahasiswa() != null && jawabanMc.getMahasiswa().getId() != null) {
            where += " o.mahasiswa.id = :mahasiswa ";
        }
        if (jawabanMc.getSoalMc() != null && jawabanMc.getSoalMc().getId() != null) {
            where += " o.soalMc.id = :soalMc ";
        }
        where = where.trim();
        if (!where.isEmpty()) {
            where = " where " + where;
        }
        if (where.endsWith("AND")) {
            where = where.substring(0, where.length() - 3);
        }

        Query query = em.createQuery("select o from JawabanMc o " + where + " order by o.id ");

        if (jawabanMc.getId() != null) {
            query.setParameter("id", jawabanMc.getId());
        }

        if (jawabanMc.getMahasiswa() != null && jawabanMc.getMahasiswa().getId() != null) {
            query.setParameter("mahasiswa", jawabanMc.getMahasiswa().getId());
        }

        if (jawabanMc.getSoalMc() != null && jawabanMc.getSoalMc().getId() != null) {
            query.setParameter("soalMc", jawabanMc.getSoalMc().getId());
        }
        return query.getResultList();
    }

    @Override
    public Long countJawabanMcs() {
        return (Long) em.createQuery("select count(o) from jawabanMc o").getSingleResult();
    }

    @Override
    public void save(NilaiMc nilaiMc) {
        try {
            em.getTransaction().begin();
            if(nilaiMc.getId()==null)
                em.persist(nilaiMc);
            else
                em.merge(nilaiMc);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(NilaiMc nilaiMc) {
        try {
            em.getTransaction().begin();
            em.remove(nilaiMc);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public NilaiMc findNilaiMc(Long id) {
        return (NilaiMc) em.createQuery("select n from NilaiMc n where n.id=:id").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<NilaiMc> findNilaiMcs() {
        return em.createQuery("select n from NilaiMc n order by n.pertemuanPraktikum.id").getResultList();
    }

    @Override
    public List<NilaiMc> findNilaiMcs(PertemuanPraktikum pertemuanPraktikum) {
        return em.createQuery("select n from NilaiMc n where n.pertemuanPraktikum=:pertemuanPraktikum order by n.id").setParameter("pertemuanPraktikum", pertemuanPraktikum).getResultList();
    }

    @Override
    public List<NilaiMc> findNilaiMcLulus(PertemuanPraktikum pertemuanPraktikum,Double lulus) {
        return em.createQuery("select n from NilaiMc n where n.pertemuanPraktikum=:pertemuanPraktikum and n.nilai >=:lulus order by n.id").setParameter("pertemuanPraktikum", pertemuanPraktikum).setParameter("lulus", lulus).getResultList();
    }
    
    @Override
    public List<NilaiMc> findNilaiMcs(Mahasiswa mahasiswa) {
        return em.createQuery("select n from NilaiMc n where n.mahasiswa=:mahasiswa").setParameter("mahasiswa", mahasiswa).getResultList();
    }
    
    @Override
    public NilaiMc findNilaiMc(Mahasiswa mahasiswa, PertemuanPraktikum pertemuanPraktikum) throws RemoteException {
        return (NilaiMc) em.createQuery("select n from NilaiMc n where n.mahasiswa=:mahasiswa AND n.pertemuanPraktikum=:pertemuanPraktikum").setParameter("mahasiswa", mahasiswa).setParameter("pertemuanPraktikum", pertemuanPraktikum).getSingleResult();
    }
    
    @Override
    public List<NilaiMc> findNilaiMcs(Mahasiswa mahasiswa, PertemuanPraktikum pertemuanPraktikum) {
        return em.createQuery("select n from NilaiMc n where n.mahasiswa=:mahasiswa AND n.pertemuanPraktikum=:pertemuanPraktikum").setParameter("mahasiswa", mahasiswa).setParameter("pertemuanPraktikum", pertemuanPraktikum).getResultList();
    }

    @Override
    public List<NilaiMc> findNilaiMcs(NilaiMc nilaiMc) {
        String where = "";
        if (nilaiMc.getId() != null) {
            where += " o.id = :id AND ";
        }

        if (nilaiMc.getMahasiswa() != null && nilaiMc.getMahasiswa().getId() != null) {
            where += " o.mahasiswa.id = :mahasiswa ";
        }
        if (nilaiMc.getPertemuanPraktikum() != null && nilaiMc.getPertemuanPraktikum().getId() != null) {
            where += " o.pertemuanPraktikum.id = :pertemuanPraktikum ";
        }
        where = where.trim();
        if (!where.isEmpty()) {
            where = " where " + where;
        }
        if (where.endsWith("AND")) {
            where = where.substring(0, where.length() - 3);
        }

        Query query = em.createQuery("select o from NilaiMc o " + where + " order by o.id ");

        if (nilaiMc.getId() != null) {
            query.setParameter("id", nilaiMc.getId());
        }

        if (nilaiMc.getMahasiswa() != null && nilaiMc.getMahasiswa().getId() != null) {
            query.setParameter("mahasiswa", nilaiMc.getMahasiswa().getId());
        }

        if (nilaiMc.getPertemuanPraktikum() != null && nilaiMc.getPertemuanPraktikum().getId() != null) {
            query.setParameter("pertemuanPraktikum", nilaiMc.getPertemuanPraktikum().getId());
        }
        return query.getResultList();
    }

    @Override
    public Long countNilaiMcs() {
        return (Long) em.createQuery("select count(o) from NilaiMc o").getSingleResult();
    }

    
}
