/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import pretest.entity.JawabanBs;
import pretest.entity.Mahasiswa;
import pretest.entity.NilaiBs;
import pretest.entity.PertemuanPraktikum;
import pretest.entity.SoalBs;

/**
 *
 */
public interface BsPretestService extends Remote {

    /************ soal bs service ********************/
    public void save(SoalBs soalBs) throws RemoteException;

    public void delete(SoalBs soalBs) throws RemoteException;

    public SoalBs findSoalBs(Long id) throws RemoteException;

    public List<SoalBs> findSoalBss() throws RemoteException;

    public List<SoalBs> findSoalBss(PertemuanPraktikum pertemuanPraktikum) throws RemoteException;

    public List<SoalBs> findSoalBss(SoalBs soalBs) throws RemoteException;

    public Long countSoalBss() throws RemoteException;

    /************ jawaban soal bs service ********************/
    public void save(JawabanBs jawabanBs) throws RemoteException;

    public void delete(JawabanBs jawabanBs) throws RemoteException;

    public JawabanBs findJawabanBs(Long id) throws RemoteException;

    public List<JawabanBs> findJawabanBss() throws RemoteException;

    public List<JawabanBs> findJawabanBss(Mahasiswa mahasiswa) throws RemoteException;

    public List<JawabanBs> findJawabanBss(SoalBs soalBs) throws RemoteException;

    public List<JawabanBs> findJawabanBss(JawabanBs jawabanBs) throws RemoteException;

    public Long countJawabanBss() throws RemoteException;

    /************ nilai soal bs service ********************/
    public void save(NilaiBs nilaiBs) throws RemoteException;

    public void delete(NilaiBs nilaiBs) throws RemoteException;

    public NilaiBs findNilaiBs(Long id) throws RemoteException;

    public List<NilaiBs> findNilaiBss() throws RemoteException;

    public List<NilaiBs> findNilaiBss(PertemuanPraktikum pertemuanPraktikum) throws RemoteException;

    public List<NilaiBs> findNilaiBsLulus(PertemuanPraktikum pertemuanPraktikum,Double lulus) throws RemoteException;

    public List<NilaiBs> findNilaiBss(Mahasiswa mahasiswa) throws RemoteException;

    public NilaiBs findNilaiBs(Mahasiswa mahasiswa, PertemuanPraktikum pertemuanPraktikum) throws RemoteException;

    public List<NilaiBs> findNilaiBss(Mahasiswa mahasiswa, PertemuanPraktikum pertemuanPraktikum) throws RemoteException;

    public List<NilaiBs> findNilaiBss(NilaiBs nilaiBs) throws RemoteException;

    public Long countNilaiBss() throws RemoteException;
}
