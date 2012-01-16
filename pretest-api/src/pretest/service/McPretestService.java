/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import pretest.entity.JawabanMc;
import pretest.entity.Mahasiswa;
import pretest.entity.NilaiMc;
import pretest.entity.PertemuanPraktikum;
import pretest.entity.SoalMc;

/**
 *
 */
public interface McPretestService extends Remote {

    /************ soal mc service ********************/
    public void save(SoalMc soalMc) throws RemoteException;

    public void delete(SoalMc soalMc) throws RemoteException;

    public SoalMc findSoalMc(Long id) throws RemoteException;

    public List<SoalMc> findSoalMcs() throws RemoteException;

    public List<SoalMc> findSoalMcs(PertemuanPraktikum pertemuanPraktikum) throws RemoteException;

    public List<SoalMc> findSoalMcs(SoalMc soalMc) throws RemoteException;

    public Long countSoalMcs() throws RemoteException;

    /************ jawaban soal mc service ********************/
    public void save(JawabanMc jawabanMc) throws RemoteException;

    public void delete(JawabanMc jawabanMc) throws RemoteException;

    public JawabanMc findJawabanMc(Long id) throws RemoteException;

    public List<JawabanMc> findJawabanMcs() throws RemoteException;

    public List<JawabanMc> findJawabanMcs(Mahasiswa mahasiswa) throws RemoteException;

    public List<JawabanMc> findJawabanMcs(SoalMc soalMc) throws RemoteException;

    public List<JawabanMc> findJawabanMcs(JawabanMc jawabanMc) throws RemoteException;

    public Long countJawabanMcs() throws RemoteException;

    /************ nilai soal mc service ********************/
    public void save(NilaiMc nilaiMc) throws RemoteException;

    public void delete(NilaiMc nilaiMc) throws RemoteException;

    public NilaiMc findNilaiMc(Long id) throws RemoteException;

    public List<NilaiMc> findNilaiMcs() throws RemoteException;

    public List<NilaiMc> findNilaiMcs(PertemuanPraktikum pertemuanPraktikum) throws RemoteException;

    public List<NilaiMc> findNilaiMcs(Mahasiswa mahasiswa) throws RemoteException;

    public List<NilaiMc> findNilaiMcs(NilaiMc nilaiMc) throws RemoteException;

    public Long countNilaiMcs() throws RemoteException;
}
