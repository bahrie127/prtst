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
import pretest.entity.Mahasiswa;
import pretest.entity.Setting;
import pretest.service.MahasiswaService;

/**
 *
 * ini adalah class MahasiswaServiceImpl
 */
public class MahasiswaServiceImpl extends UnicastRemoteObject implements MahasiswaService {

    EntityManager em;

    public MahasiswaServiceImpl() throws RemoteException {
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public boolean save(Mahasiswa mahasiswa) throws RemoteException {
        try {
            em.getTransaction().begin();
            if (mahasiswa.getId() == null) {
                em.persist(mahasiswa);
            } else {
                em.merge(mahasiswa);
            }
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            return false;

        }
        return true;
    }

    @Override
    public void delete(Mahasiswa mahasiswa) throws RemoteException {
        try {
            em.getTransaction().begin();
            em.remove(mahasiswa);
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public Mahasiswa findMahasiswa(Long id) throws RemoteException {
        return (Mahasiswa) em.createQuery("select m from Mahasiswa m where m.id=:id").setParameter("id", id).getSingleResult();
    }

    @Override
    public Mahasiswa findMahasiswa(String nim, String password) throws RemoteException {
        return (Mahasiswa) em.createQuery("select m from Mahasiswa m where m.nim=:nim and m.password=:password").setParameter("nim", nim).setParameter("password", password).getSingleResult();
    }

    @Override
    public List<Mahasiswa> findMahasiswas() throws RemoteException {
        return em.createQuery("select m from Mahasiswa m").getResultList();
    }

    @Override
    public List<Mahasiswa> findMahasiswas(Mahasiswa mahasiswa) throws RemoteException {
        String where = "";
        if (mahasiswa.getId() != null) {
            where += " o.id = :id AND ";
        }
        if (mahasiswa.getNim() != null && !mahasiswa.getNim().isEmpty()) {
            where += " o.nim like :nim ";
        }
        if (mahasiswa.getNama() != null && !mahasiswa.getNama().isEmpty()) {
            where += " o.nama like :nama ";
        }
        if (mahasiswa.getPassword() != null && !mahasiswa.getPassword().isEmpty()) {
            where += " o.password like :password ";
        }
        where = where.trim();
        if (!where.isEmpty()) {
            where = " where " + where;
        }
        if (where.endsWith("AND")) {
            where = where.substring(0, where.length() - 3);
        }

        Query query = em.createQuery("select o from Mahasiswa o " + where + " order by o.id ");

        if (mahasiswa.getId() != null) {
            query.setParameter("id", mahasiswa.getId());
        }
        if (mahasiswa.getNim() != null && !mahasiswa.getNim().isEmpty()) {
            query.setParameter("nim", "%" + mahasiswa.getNim() + "%");
        }
        if (mahasiswa.getNama() != null && !mahasiswa.getNama().isEmpty()) {
            query.setParameter("nama", "%" + mahasiswa.getNama() + "%");
        }
        if (mahasiswa.getPassword() != null && !mahasiswa.getPassword().isEmpty()) {
            query.setParameter("password", "%" + mahasiswa.getPassword() + "%");
        }
        List list = query.getResultList();
        return list;
    }

    @Override
    public Long countMahasiswas() throws RemoteException {
        return (Long) em.createQuery("select count(o) from Mahasiswa o").getSingleResult();
    }

    @Override
    public Setting getSetting() throws RemoteException {
        return (Setting) em.createQuery("select s from Setting s where s.id=:id").setParameter("id", Long.parseLong("1")).getSingleResult();
    }

    @Override
    public void updateSetting(Setting setting) throws RemoteException {
        try {
            em.getTransaction().begin();
            if (setting.getId() == null) {
                em.persist(setting);
            } else {
                em.merge(setting);
            }
            em.getTransaction().commit();
        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        }
    }
}
