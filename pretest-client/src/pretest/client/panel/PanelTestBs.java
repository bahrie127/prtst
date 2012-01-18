/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelTestBs.java
 *
 * Created on Dec 2, 2011, 9:41:14 PM
 */
package pretest.client.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import pretest.client.frame.MainFrameClient;
import pretest.client.util.SelesaiListener;
import pretest.client.util.Time;
import pretest.client.util.TimeEntity;
import pretest.entity.JawabanBs;
import pretest.entity.Mahasiswa;
import pretest.entity.NilaiBs;
import pretest.entity.PertemuanPraktikum;
import pretest.entity.SoalBs;
import pretest.entity.enuum.Jawab;
import pretest.entity.enuum.KunciBs;
import pretest.service.BsPretestService;

/**
 *
 * @author bahrie
 */
public class PanelTestBs extends javax.swing.JPanel {

    /** Creates new form PanelTestBs */
    public PanelTestBs() {
        initComponents();


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSoal = new javax.swing.JTextArea();
        radioBenar = new javax.swing.JRadioButton();
        radioSalah = new javax.swing.JRadioButton();
        buttonJawab = new javax.swing.JButton();
        labelWaktu = new javax.swing.JLabel();

        jLabel1.setText("Nomor :");

        jLabel2.setText("Soal :");

        textSoal.setColumns(20);
        textSoal.setRows(5);
        jScrollPane1.setViewportView(textSoal);

        buttonGroup.add(radioBenar);
        radioBenar.setText("Benar");

        buttonGroup.add(radioSalah);
        radioSalah.setText("Salah");

        buttonJawab.setText("Jawab");
        buttonJawab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJawabActionPerformed(evt);
            }
        });

        labelWaktu.setText("00 : 00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonJawab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(radioBenar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioSalah)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                        .addComponent(labelWaktu)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBenar)
                    .addComponent(radioSalah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonJawab)
                    .addComponent(labelWaktu))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void buttonJawabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJawabActionPerformed
    try {
        buttonJawabActionPerformed();
    } catch (RemoteException ex) {
        Logger.getLogger(PanelTestBs.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_buttonJawabActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton buttonJawab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelWaktu;
    private javax.swing.JRadioButton radioBenar;
    private javax.swing.JRadioButton radioSalah;
    private javax.swing.JTextField textNo;
    private javax.swing.JTextArea textSoal;
    // End of variables declaration//GEN-END:variables
    private PertemuanPraktikum pertemuanPraktikum;
    private BsPretestService bsPretestService;
    private Mahasiswa mhs;
    private JawabanBs jawabanBs;
    private NilaiBs nilaiBs;
    private List<SoalBs> soalBsList;
    private int jumlahSoal;
    private int noSoal;
    private double nilai;
    private int bener = 0;
    private SelesaiListener listener;
    private int s = 60, m = 59, h = 1;

    /**
     * methode
     * @return 
     */
    private boolean cekPilih() {
        if (radioBenar.isSelected() || radioSalah.isSelected()) {
            return true;
        }
        return false;
    }

    private String kunciJawaban() {
        if (radioBenar.isSelected()) {
            return "BENAR";
        }
        return "SALAH";
    }

    public void setDuration() throws RemoteException {
        //menghitung selisih waktu start dengan waktu sekarang
        if (s == 0) {
            s = 60;
            m--;
        } else {
            s--;
        }
        if (m == 0) {
            m = 60;
            h--;
        }
        Time t = new Time();
        TimeEntity te = t.timeFormat(s, m, h);
        labelWaktu.setText(te.getJam() + " : " + te.getMenit());
        if (h == -1) {
            h--;
            nilai = ((double) bener / (double) jumlahSoal) * 100;
            nilaiBs = new NilaiBs();
            nilaiBs.setMahasiswa(mhs);
            nilaiBs.setPertemuanPraktikum(pertemuanPraktikum);
            nilaiBs.setNilai(nilai);
            bsPretestService.save(nilaiBs);
            listener.selesai(nilai);
        }
    }

    public List<SoalBs> setRandomSoal(List<SoalBs> soalBses) {
        List<SoalBs> listAcak = new ArrayList<SoalBs>();
        SoalBs sb = new SoalBs();
        for (int i = 0; i < soalBses.size(); i++) {
            listAcak.add(sb);
        }
        boolean ulang = false;
        Random random = new Random();
        int n = 0, m = 0;
        int loop = 0;
        int angka = 0;
        do {
            ulang = false;
            n = random.nextInt(soalBses.size());
            for (int c = 0; c < soalBses.size(); c++) {
                if (soalBses.get(n).getId() == listAcak.get(c).getId()) {
                    ulang = true;
                    break;
                }

            }
            if (ulang) {
                continue;
            }
            listAcak.set(m, soalBses.get(n));
            m++;
        } while (m < soalBses.size());
        return listAcak;
    }

    /**
     * event
     * @throws RemoteException 
     */
    private void buttonJawabActionPerformed() throws RemoteException {
        if (cekPilih()) {
            jawabanBs = new JawabanBs();
            jawabanBs.setMahasiswa(mhs);
            jawabanBs.setSoalBs(soalBsList.get(noSoal));
            jawabanBs.setJawab(Jawab.valueOf("S"));

            if (soalBsList.get(noSoal).getKunci() == KunciBs.valueOf(kunciJawaban())) {
                bener++;
                jawabanBs.setJawab(Jawab.valueOf("B"));
            }
            bsPretestService.save(jawabanBs);

            if (noSoal < jumlahSoal - 1) {
                noSoal++;
                textNo.setText((noSoal + 1) + "");
                textSoal.setText(soalBsList.get(noSoal).getSoal());
                buttonGroup.clearSelection();
            } else {
                nilai = ((double) bener / (double) jumlahSoal) * 100;
                nilaiBs = new NilaiBs();
                nilaiBs.setMahasiswa(mhs);
                nilaiBs.setPertemuanPraktikum(pertemuanPraktikum);
                nilaiBs.setNilai(nilai);
                bsPretestService.save(nilaiBs);
                listener.selesai(nilai);
            }


        } else {
            JOptionPane.showMessageDialog(this, "jawaban tidak boleh kosong");
        }
    }

    /**
     * setter getter
     * @return 
     */
    public PertemuanPraktikum getPertemuanPraktikum() {
        return pertemuanPraktikum;
    }

    public void setPertemuanPraktikum(PertemuanPraktikum pertemuanPraktikum, Mahasiswa mhs) throws RemoteException {
        this.pertemuanPraktikum = pertemuanPraktikum;
        this.mhs = mhs;
        bsPretestService = MainFrameClient.getBsPretestService();
        soalBsList = bsPretestService.findSoalBss(pertemuanPraktikum);
        soalBsList = setRandomSoal(soalBsList);
        jumlahSoal = soalBsList.size();
        noSoal = 0;
        textNo.setText((noSoal + 1) + "");
        textSoal.setText(soalBsList.get(noSoal).getSoal());
        ActionListener al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    setDuration();
                } catch (RemoteException ex) {
                    Logger.getLogger(PanelTestBs.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        new Timer(1000, al).start();
    }

    public SelesaiListener getListener() {
        return listener;
    }

    public void setListener(SelesaiListener listener) {
        this.listener = listener;
    }
}
