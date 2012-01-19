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
import pretest.entity.JawabanBs;
import pretest.entity.Mahasiswa;
import pretest.entity.NilaiBs;
import pretest.entity.PertemuanPraktikum;
import pretest.entity.SoalBs;
import pretest.service.BsPretestService;

/**
 *
 * ini adalah class BsPretestServiceImpl
 */

public class BsPretestServiceImpl extends UnicastRemoteObject implements BsPretestService {

    EntityManager em;

    public BsPretestServiceImpl() throws RemoteException{
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    
    @Override
    public void save(SoalBs soalBs) {
        try {
            em.getTransaction().begin();
            if(soalBs.getId()==null)
                em.persist(soalBs);
            else
                em.merge(soalBs);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(SoalBs soalBs) {
        try {
            em.getTransaction().begin();
            em.remove(soalBs);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public SoalBs findSoalBs(Long id) {
        return (SoalBs) em.createQuery("select s from SoalBs s where s.id=:id").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<SoalBs> findSoalBss() {
        return em.createQuery("select s from SoalBs s").getResultList();
    }

    @Override
    public List<SoalBs> findSoalBss(PertemuanPraktikum pertemuanPraktikum) {
        return em.createQuery("select s from SoalBs s where s.pertemuanPraktikum=:pertemuanPraktikum order by s.id").setParameter("pertemuanPraktikum", pertemuanPraktikum).getResultList();
    }

    @Override
    public List<SoalBs> findSoalBss(SoalBs soalBs) {
        String where = "";
        if (soalBs.getId() != null) {
            where += " o.id = :id AND ";
        }

        if (soalBs.getPertemuanPraktikum() != null && soalBs.getPertemuanPraktikum().getId() != null) {
            where += " o.pertemuanPraktikum.id = :pertemuanPraktikum ";
        }

        where = where.trim();
        if (!where.isEmpty()) {
            where = " where " + where;
        }
        if (where.endsWith("AND")) {
            where = where.substring(0, where.length() - 3);
        }

        Query query = em.createQuery("select o from SoalBs o " + where + " order by o.id ");

        if (soalBs.getId() != null) {
            query.setParameter("id", soalBs.getId());
        }

        if (soalBs.getPertemuanPraktikum() != null && soalBs.getPertemuanPraktikum().getId() != null) {
            query.setParameter("pertemuanPraktikum", soalBs.getPertemuanPraktikum().getId());
        }
        return query.getResultList();
    }

    @Override
    public Long countSoalBss() {
        return (Long) em.createQuery("select count(o) from SoalBs o").getSingleResult();
    }

    @Override
    public void save(JawabanBs jawabanBs) {
        try {
            em.getTransaction().begin();
            if(jawabanBs.getId()==null)
                em.persist(jawabanBs);
            else
                em.merge(jawabanBs);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(JawabanBs jawabanBs) {
        try {
            em.getTransaction().begin();
            em.remove(jawabanBs);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public JawabanBs findJawabanBs(Long id) {
        return (JawabanBs) em.createQuery("select o from JawabanBs o where o.id=:id").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<JawabanBs> findJawabanBss() {
        return em.createQuery("select j from JawabanBs j order by j.soalBs.id").getResultList();
    }

    @Override
    public List<JawabanBs> findJawabanBss(Mahasiswa mahasiswa) {
        return em.createQuery("select j from JawabanBs j where j.mahasiswa=:mahasiswa order by j.id").setParameter("mahasiswa", mahasiswa).getResultList();
    }

    @Override
    public List<JawabanBs> findJawabanBss(SoalBs soalBs) {
        return em.createQuery("select j from JawabanBs j where j.soalBs=:soalBs order by j.id").setParameter("soalBs", soalBs).getResultList();
    }

    @Override
    public List<JawabanBs> findJawabanBss(JawabanBs jawabanBs) {
        String where = "";
        if (jawabanBs.getId() != null) {
            where += " o.id = :id AND ";
        }

        if (jawabanBs.getMahasiswa() != null && jawabanBs.getMahasiswa().getId() != null) {
            where += " o.mahasiswa.id = :mahasiswa ";
        }
        if (jawabanBs.getSoalBs() != null && jawabanBs.getSoalBs().getId() != null) {
            where += " o.soalBs.id = :soalBs ";
        }
        where = where.trim();
        if (!where.isEmpty()) {
            where = " where " + where;
        }
        if (where.endsWith("AND")) {
            where = where.substring(0, where.length() - 3);
        }

        Query query = em.createQuery("select o from JawabanBs o " + where + " order by o.id ");

        if (jawabanBs.getId() != null) {
            query.setParameter("id", jawabanBs.getId());
        }

        if (jawabanBs.getMahasiswa() != null && jawabanBs.getMahasiswa().getId() != null) {
            query.setParameter("mahasiswa", jawabanBs.getMahasiswa().getId());
        }

        if (jawabanBs.getSoalBs() != null && jawabanBs.getSoalBs().getId() != null) {
            query.setParameter("soalBs", jawabanBs.getSoalBs().getId());
        }
        return query.getResultList();
    }

    @Override
    public Long countJawabanBss() {
        return (Long) em.createQuery("select count(o) from jawabanBs o").getSingleResult();
    }

    @Override
    public void save(NilaiBs nilaiBs) {
        try {
            em.getTransaction().begin();
            if(nilaiBs.getId()==null)
                em.persist(nilaiBs);
            else
                em.merge(nilaiBs);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(NilaiBs nilaiBs) {
        try {
            em.getTransaction().begin();
            em.remove(nilaiBs);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public NilaiBs findNilaiBs(Long id) {
        return (NilaiBs) em.createQuery("select n from NilaiBs n where n.id=:id").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<NilaiBs> findNilaiBss() {
        return em.createQuery("select n from NilaiBs n order by n.pertemuanPraktikum.id").getResultList();
    }

    @Override
    public List<NilaiBs> findNilaiBss(PertemuanPraktikum pertemuanPraktikum) {
        return em.createQuery("select n from NilaiBs n where n.pertemuanPraktikum=:pertemuanPraktikum order by n.id").setParameter("pertemuanPraktikum", pertemuanPraktikum).getResultList();
    }
    
    @Override
    public List<NilaiBs> findNilaiBsLulus(PertemuanPraktikum pertemuanPraktikum) {
        return em.createQuery("select n from NilaiBs n where n.pertemuanPraktikum=:pertemuanPraktikum and n.nilai>=70 order by n.id").setParameter("pertemuanPraktikum", pertemuanPraktikum).getResultList();
    }

    @Override
    public List<NilaiBs> findNilaiBss(Mahasiswa mahasiswa) {
        return em.createQuery("select n from NilaiBs n where n.mahasiswa=:mahasiswa").setParameter("mahasiswa", mahasiswa).getResultList();
    }
    
    @Override
    public NilaiBs findNilaiBs(Mahasiswa mahasiswa, PertemuanPraktikum pertemuanPraktikum){
        return (NilaiBs) em.createQuery("select n from NilaiBs n where n.mahasiswa=:mahasiswa and n.pertemuanPraktikum=:pertemuanPraktikum").setParameter("mahasiswa", mahasiswa).setParameter("pertemuanPraktikum", pertemuanPraktikum).getSingleResult();
    }
    
    @Override
    public List<NilaiBs> findNilaiBss(Mahasiswa mahasiswa, PertemuanPraktikum pertemuanPraktikum){
        return  em.createQuery("select n from NilaiBs n where n.mahasiswa=:mahasiswa and n.pertemuanPraktikum=:pertemuanPraktikum").setParameter("mahasiswa", mahasiswa).setParameter("pertemuanPraktikum", pertemuanPraktikum).getResultList();
    }

    @Override
    public List<NilaiBs> findNilaiBss(NilaiBs nilaiBs) {
        String where = "";
        if (nilaiBs.getId() != null) {
            where += " o.id = :id AND ";
        }

        if (nilaiBs.getMahasiswa() != null && nilaiBs.getMahasiswa().getId() != null) {
            where += " o.mahasiswa.id = :mahasiswa ";
        }
        if (nilaiBs.getPertemuanPraktikum() != null && nilaiBs.getPertemuanPraktikum().getId() != null) {
            where += " o.pertemuanPraktikum.id = :pertemuanPraktikum ";
        }
        where = where.trim();
        if (!where.isEmpty()) {
            where = " where " + where;
        }
        if (where.endsWith("AND")) {
            where = where.substring(0, where.length() - 3);
        }

        Query query = em.createQuery("select o from NilaiBs o " + where + " order by o.id ");

        if (nilaiBs.getId() != null) {
            query.setParameter("id", nilaiBs.getId());
        }

        if (nilaiBs.getMahasiswa() != null && nilaiBs.getMahasiswa().getId() != null) {
            query.setParameter("mahasiswa", nilaiBs.getMahasiswa().getId());
        }

        if (nilaiBs.getPertemuanPraktikum() != null && nilaiBs.getPertemuanPraktikum().getId() != null) {
            query.setParameter("pertemuanPraktikum", nilaiBs.getPertemuanPraktikum().getId());
        }
        return query.getResultList();
    }

    @Override
    public Long countNilaiBss() {
        return (Long) em.createQuery("select count(o) from NilaiBs o").getSingleResult();
    }

    
}
