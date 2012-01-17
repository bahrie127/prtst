/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelTestMc.java
 *
 * Created on Dec 2, 2011, 9:41:25 PM
 */
package pretest.client.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import pretest.client.frame.MainFrameClient;
import pretest.client.util.SelesaiListener;
import pretest.client.util.Time;
import pretest.client.util.TimeEntity;
import pretest.entity.JawabanMc;
import pretest.entity.Mahasiswa;
import pretest.entity.NilaiMc;
import pretest.entity.PertemuanPraktikum;
import pretest.entity.SoalMc;
import pretest.entity.enuum.Jawab;
import pretest.entity.enuum.KunciMc;
import pretest.service.McPretestService;

/**
 *
 * @author bahrie
 */
public class PanelTestMc extends javax.swing.JPanel {

    /** Creates new form PanelTestMc */
    public PanelTestMc() {
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
        textNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSoal = new javax.swing.JTextArea();
        buttonJawab = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelWaktu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radioA = new javax.swing.JRadioButton();
        radioB = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        radioC = new javax.swing.JRadioButton();
        radioD = new javax.swing.JRadioButton();

        textSoal.setColumns(20);
        textSoal.setRows(5);
        jScrollPane1.setViewportView(textSoal);

        buttonJawab.setText("Jawab");
        buttonJawab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJawabActionPerformed(evt);
            }
        });

        jLabel2.setText("Soal :");

        jLabel1.setText("Nomor :");

        labelWaktu.setText("00 : 00");

        jLabel4.setText("A");

        jLabel6.setText("B");

        buttonGroup.add(radioA);
        radioA.setText("radioA");

        buttonGroup.add(radioB);
        radioB.setText("radioB");

        jLabel5.setText("C");

        jLabel7.setText("D");

        buttonGroup.add(radioC);
        radioC.setText("Jawaban C");

        buttonGroup.add(radioD);
        radioD.setText("Jawaban D");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonJawab, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 508, Short.MAX_VALUE)
                                .addComponent(labelWaktu))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioC, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                        .addGap(156, 156, 156))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {radioA, radioB, radioC, radioD});

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioA)
                    .addComponent(jLabel5)
                    .addComponent(radioC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radioB)
                    .addComponent(jLabel7)
                    .addComponent(radioD))
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
        Logger.getLogger(PanelTestMc.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_buttonJawabActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton buttonJawab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelWaktu;
    private javax.swing.JRadioButton radioA;
    private javax.swing.JRadioButton radioB;
    private javax.swing.JRadioButton radioC;
    private javax.swing.JRadioButton radioD;
    private javax.swing.JTextField textNo;
    private javax.swing.JTextArea textSoal;
    // End of variables declaration//GEN-END:variables
    private PertemuanPraktikum pertemuanPraktikum;
    private McPretestService mcPretestService;
    private Mahasiswa mhs;
    private NilaiMc nilaiMc;
    private JawabanMc jawabanMc;
    private List<SoalMc> soalList;
    private int jumlahSoal;
    private int noSoal;
    private double nilai;
    private int benar = 0;
    private SelesaiListener listener;
    private int s = 60, m = 59, h = 1;

    /**
     * methode
     */
    private boolean cekPilih() {
        if (radioA.isSelected() || radioB.isSelected() || radioC.isSelected() || radioD.isSelected()) {
            return true;
        }
        return false;
    }

    private String jawaban() {
        if (radioA.isSelected()) {
            return "A";
        }
        if (radioB.isSelected()) {
            return "B";
        }
        if (radioC.isSelected()) {
            return "C";
        }
        if (radioD.isSelected()) {
            return "D";
        }
        return null;
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
            nilai = ((double) benar / (double) jumlahSoal) * 100;
            nilaiMc = new NilaiMc();
            nilaiMc.setMahasiswa(mhs);
            nilaiMc.setPertemuanPraktikum(pertemuanPraktikum);
            nilaiMc.setNilai(nilai);
            mcPretestService.save(nilaiMc);
            listener.selesai(nilai);
        }
    }

    /**
     * event
     */
    private void buttonJawabActionPerformed() throws RemoteException {
        if (cekPilih()) {
            jawabanMc = new JawabanMc();
            jawabanMc.setMahasiswa(mhs);
            jawabanMc.setSoalMc(soalList.get(noSoal));
            jawabanMc.setJawab(Jawab.S);

            if (soalList.get(noSoal).getKunciMc() == KunciMc.valueOf(jawaban())) {
                benar++;
                jawabanMc.setJawab(Jawab.B);
            }
            mcPretestService.save(jawabanMc);

            if (noSoal < jumlahSoal - 1) {
                noSoal++;
                textNo.setText((noSoal+1)+"");
                textSoal.setText(soalList.get(noSoal).getSoal());
                radioA.setText(soalList.get(noSoal).getA());
                radioB.setText(soalList.get(noSoal).getB());
                radioC.setText(soalList.get(noSoal).getC());
                radioD.setText(soalList.get(noSoal).getD());
                buttonGroup.clearSelection();
            } else {
                nilai = ((double) benar / (double) jumlahSoal) * 100;
                nilaiMc = new NilaiMc();
                nilaiMc.setMahasiswa(mhs);
                nilaiMc.setPertemuanPraktikum(pertemuanPraktikum);
                nilaiMc.setNilai(nilai);
                mcPretestService.save(nilaiMc);
                listener.selesai(nilai);
            }
        } else {
            JOptionPane.showMessageDialog(this, "jawaban harus di isi");
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
        mcPretestService = MainFrameClient.getMcPretestService();
        soalList = mcPretestService.findSoalMcs(pertemuanPraktikum);
        jumlahSoal = soalList.size();
        noSoal = 0;
        textNo.setText((noSoal+1)+"");
        textSoal.setText(soalList.get(noSoal).getSoal());
        radioA.setText(soalList.get(noSoal).getA());
        radioB.setText(soalList.get(noSoal).getB());
        radioC.setText(soalList.get(noSoal).getC());
        radioD.setText(soalList.get(noSoal).getD());

        ActionListener al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    setDuration();
                } catch (RemoteException ex) {
                    Logger.getLogger(PanelTestMc.class.getName()).log(Level.SEVERE, null, ex);
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
