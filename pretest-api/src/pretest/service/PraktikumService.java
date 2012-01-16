/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import pretest.entity.PertemuanPraktikum;
import pretest.entity.Praktikum;

/**
 *
 */
public interface PraktikumService extends Remote {

    public void save(Praktikum praktikum) throws RemoteException;

    public void delete(Praktikum praktikum) throws RemoteException;

    public Praktikum findPraktikum(Long id) throws RemoteException;

    public List<Praktikum> findPraktikums() throws RemoteException;

    public List<Praktikum> findPraktikums(Praktikum praktikum) throws RemoteException;

    public Long countPraktikums() throws RemoteException;

    /******************** pertemuan praktikum service ************************/
    public void save(PertemuanPraktikum pertemuanPraktikum) throws RemoteException;

    public void delete(PertemuanPraktikum pertemuanPraktikum) throws RemoteException;

    public PertemuanPraktikum findPertemuanPraktikum(Long id) throws RemoteException;

    public List<PertemuanPraktikum> findPertemuanPraktikums() throws RemoteException;

    public List<PertemuanPraktikum> findPraktikumPertemuans(Praktikum praktikum) throws RemoteException;

    public List<PertemuanPraktikum> findPertemuanPraktikums(PertemuanPraktikum pertemuanPraktikum) throws RemoteException;

    public Long countPertemuanPraktikums() throws RemoteException;
}
