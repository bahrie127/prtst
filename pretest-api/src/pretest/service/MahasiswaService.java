/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import pretest.entity.Mahasiswa;
import pretest.entity.Setting;

/**

 */
public interface MahasiswaService extends Remote {

    public boolean save(Mahasiswa mahasiswa) throws RemoteException;

    public void delete(Mahasiswa mahasiswa) throws RemoteException;

    public Mahasiswa findMahasiswa(Long id) throws RemoteException;
    
    public Mahasiswa findMahasiswa(String nim,String password) throws RemoteException;

    public List<Mahasiswa> findMahasiswas() throws RemoteException;

    public List<Mahasiswa> findMahasiswas(Mahasiswa mahasiswa) throws RemoteException;

    public Long countMahasiswas() throws RemoteException;
    
    public Setting getSetting() throws RemoteException;
    
    public void updateSetting(Setting setting) throws RemoteException;
}
