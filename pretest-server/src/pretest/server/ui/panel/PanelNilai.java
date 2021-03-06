/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelNilai.java
 *
 * Created on Nov 27, 2011, 8:36:19 PM
 */
package pretest.server.ui.panel;

import java.rmi.RemoteException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import pretest.entity.NilaiBs;
import pretest.entity.NilaiMc;
import pretest.entity.PertemuanPraktikum;
import pretest.entity.Setting;
import pretest.server.PretestServer;
import pretest.server.impl.BsPretestServiceImpl;
import pretest.server.impl.MahasiswaServiceImpl;
import pretest.server.impl.McPretestServiceImpl;
import pretest.server.util.NilaiUtil;

/**
 *
 * @author bahrie
 */
public class PanelNilai extends javax.swing.JPanel {

    /** Creates new form PanelNilai */
    public PanelNilai() throws RemoteException {
        initComponents();
        bsPretestServiceImpl = new BsPretestServiceImpl();
        mcPretestServiceImpl = new McPretestServiceImpl();
        bsPretestServiceImpl.setEm(PretestServer.getEntityManager());
        mcPretestServiceImpl.setEm(PretestServer.getEntityManager());
        mahasiswaServiceImpl=new MahasiswaServiceImpl();
        mahasiswaServiceImpl.setEm(PretestServer.getEntityManager());
        loadIsiTabel();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogTableBs = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSelectBs = new javax.swing.JTable();
        dialogTableMc = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableSelectMc = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBS = new javax.swing.JTable();
        buttonLihatAllData = new javax.swing.JButton();
        buttonLulus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMC = new javax.swing.JTable();
        buttonLihatDataMc = new javax.swing.JButton();
        buttonLulusMc = new javax.swing.JButton();

        tableSelectBs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableSelectBs);

        javax.swing.GroupLayout dialogTableBsLayout = new javax.swing.GroupLayout(dialogTableBs.getContentPane());
        dialogTableBs.getContentPane().setLayout(dialogTableBsLayout);
        dialogTableBsLayout.setHorizontalGroup(
            dialogTableBsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        dialogTableBsLayout.setVerticalGroup(
            dialogTableBsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        tableSelectMc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tableSelectMc);

        javax.swing.GroupLayout dialogTableMcLayout = new javax.swing.GroupLayout(dialogTableMc.getContentPane());
        dialogTableMc.getContentPane().setLayout(dialogTableMcLayout);
        dialogTableMcLayout.setHorizontalGroup(
            dialogTableMcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        dialogTableMcLayout.setVerticalGroup(
            dialogTableMcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nilai Benar Salah"));

        tabelBS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelBS);

        buttonLihatAllData.setText("Lihat Semua");
        buttonLihatAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLihatAllDataActionPerformed(evt);
            }
        });

        buttonLulus.setText("Lulus");
        buttonLulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLulusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonLulus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLihatAllData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLihatAllData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLulus)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nilai Pilihan Ganda"));

        tabelMC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelMC);

        buttonLihatDataMc.setText("Lihat Semua");
        buttonLihatDataMc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLihatDataMcActionPerformed(evt);
            }
        });

        buttonLulusMc.setText("Lulus");
        buttonLulusMc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLulusMcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonLulusMc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLihatDataMc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLihatDataMc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLulusMc)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void buttonLihatAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLihatAllDataActionPerformed
    buttonLihatAllDataActionPerformed();
}//GEN-LAST:event_buttonLihatAllDataActionPerformed

private void buttonLihatDataMcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLihatDataMcActionPerformed
    buttonLihatDataMcActionPerformed();
}//GEN-LAST:event_buttonLihatDataMcActionPerformed

private void buttonLulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLulusActionPerformed
buttonLulusActionPerformed();
}//GEN-LAST:event_buttonLulusActionPerformed

private void buttonLulusMcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLulusMcActionPerformed
buttonLulusMcActionPerformed();
}//GEN-LAST:event_buttonLulusMcActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLihatAllData;
    private javax.swing.JButton buttonLihatDataMc;
    private javax.swing.JButton buttonLulus;
    private javax.swing.JButton buttonLulusMc;
    private javax.swing.JDialog dialogTableBs;
    private javax.swing.JDialog dialogTableMc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelBS;
    private javax.swing.JTable tabelMC;
    private javax.swing.JTable tableSelectBs;
    private javax.swing.JTable tableSelectMc;
    // End of variables declaration//GEN-END:variables
    private List<NilaiBs> listNilaiBs;
    private List<NilaiUtil> listNilaiUtilsBs;
    private List<NilaiUtil> listNilaiUtilsMc;
    private List<NilaiMc> listNilaiMc;
    private Setting setting;
    private BsPretestServiceImpl bsPretestServiceImpl;
    private McPretestServiceImpl mcPretestServiceImpl;
    private MahasiswaServiceImpl mahasiswaServiceImpl;

    private void loadIsiTabel() throws RemoteException {
        listNilaiBs = bsPretestServiceImpl.findNilaiBss();
        listNilaiMc = mcPretestServiceImpl.findNilaiMcs();
        setting=mahasiswaServiceImpl.getSetting();
        listNilaiUtilsBs = statistikNilaiBs(listNilaiBs);
        listNilaiUtilsMc = statistikNilaiMc(listNilaiMc);
        isiTableBs();
        isiTableMc();
    }

    private List<NilaiUtil> statistikNilaiBs(List<NilaiBs> nilaiBses) {
        List<NilaiUtil> nilaiUtils = new ArrayList<NilaiUtil>();
        if (!nilaiBses.isEmpty()) {
            int index = 0;
            do {
                double jumlahNilai = 0;
                double mean = 0;
                int jumlahMhs = 0;
                double nilaiTerTinggi = 0;
                int persenLulus = 0;
                int persenGagal = 0;
                int lulus = 0;
                double nilaiTerRendah = 100;
                Long idKe = nilaiBses.get(index).getPertemuanPraktikum().getId();
                for (; index < nilaiBses.size(); index++) {
                    Long keId=nilaiBses.get(index).getPertemuanPraktikum().getId();
                    if ( idKe.toString().equals(keId.toString())) {
                        jumlahMhs++;
                        jumlahNilai += nilaiBses.get(index).getNilai();
                        if (nilaiBses.get(index).getNilai() >= setting.getBataLulus()) {
                            lulus++;
                        }
                        if (nilaiTerTinggi < nilaiBses.get(index).getNilai()) {
                            nilaiTerTinggi = nilaiBses.get(index).getNilai();
                        }
                        if (nilaiTerRendah > nilaiBses.get(index).getNilai()) {
                            nilaiTerRendah = nilaiBses.get(index).getNilai();
                        }
                    } else {
                        break;
                    }
                }
                mean = jumlahNilai / jumlahMhs;
                
                NumberFormat nf=NumberFormat.getInstance();
                nf.setMaximumFractionDigits(2);
                String masihKoma=nf.format(mean);
                String sudahPakeNol=masihKoma.replace(',', '.');
                persenLulus = (lulus * 100 / jumlahMhs);
                persenGagal = 100 - persenLulus;
                NilaiUtil nu = new NilaiUtil();
                nu.setGagal(persenGagal);
                nu.setIdPertemuanPraktikum(idKe);
                nu.setLulus(persenLulus);
                nu.setNamaPraktikum(nilaiBses.get(index - 1).getPertemuanPraktikum().getPraktikum().getNama());
                nu.setNilaiMax(nilaiTerTinggi);
                nu.setNilaiMin(nilaiTerRendah);
                nu.setPraktikumKe(nilaiBses.get(index - 1).getPertemuanPraktikum().getPertemuanKe() + "");
                nu.setRata(Double.parseDouble(sudahPakeNol));
                nilaiUtils.add(nu);
            } while (index < nilaiBses.size());
        }

        return nilaiUtils;
    }

    private List<NilaiUtil> statistikNilaiMc(List<NilaiMc> nilaiMcs) {
        List<NilaiUtil> nilaiUtils = new ArrayList<NilaiUtil>();
        if (!nilaiMcs.isEmpty()) {
            int index = 0;
            do {
                double jumlahNilai = 0;
                double mean = 0;
                int jumlahMhs = 0;
                double nilaiTerTinggi = 0;
                int persenLulus = 0;
                int persenGagal = 0;
                int lulus = 0;
                double nilaiTerRendah = 100;
                Long idKe = nilaiMcs.get(index).getPertemuanPraktikum().getId();
                for (; index < nilaiMcs.size(); index++) {
                    Long keId=nilaiMcs.get(index).getPertemuanPraktikum().getId();
                    if (idKe.toString().equals(keId.toString())) {
                        jumlahMhs++;
                        jumlahNilai += nilaiMcs.get(index).getNilai();
                        if (nilaiMcs.get(index).getNilai() >= setting.getBataLulus()) {
                            lulus++;
                        }
                        if (nilaiTerTinggi < nilaiMcs.get(index).getNilai()) {
                            nilaiTerTinggi = nilaiMcs.get(index).getNilai();
                        }
                        if (nilaiTerRendah > nilaiMcs.get(index).getNilai()) {
                            nilaiTerRendah = nilaiMcs.get(index).getNilai();
                        }
                    } else {
                        break;
                    }
                }
                mean = jumlahNilai / jumlahMhs;
                
                NumberFormat nf=NumberFormat.getInstance();
                nf.setMaximumFractionDigits(2);
                String masihKoma=nf.format(mean);
                String sudahPakeNol=masihKoma.replace(',', '.');
                persenLulus = (lulus * 100 / jumlahMhs);
                persenGagal = 100 - persenLulus;
                NilaiUtil nu = new NilaiUtil();
                nu.setGagal(persenGagal);
                nu.setIdPertemuanPraktikum(idKe);
                nu.setLulus(persenLulus);
                nu.setNamaPraktikum(nilaiMcs.get(index - 1).getPertemuanPraktikum().getPraktikum().getNama());
                nu.setNilaiMax(nilaiTerTinggi);
                nu.setNilaiMin(nilaiTerRendah);
                nu.setPraktikumKe(nilaiMcs.get(index - 1).getPertemuanPraktikum().getPertemuanKe() + "");
                nu.setRata(Double.parseDouble(sudahPakeNol));
                nilaiUtils.add(nu);
            } while (index < nilaiMcs.size());
        }

        return nilaiUtils;
    }

    private void isiTableBs() {
        Object data[][] = new Object[listNilaiUtilsBs.size()][7];
        int row = 0;
        for (NilaiUtil nu : listNilaiUtilsBs) {
            data[row][0] = nu.getNamaPraktikum();
            data[row][1] = nu.getPraktikumKe();
            data[row][2] = nu.getLulus();
            data[row][3] = nu.getGagal();
            data[row][4] = nu.getNilaiMax();
            data[row][5] = nu.getNilaiMin();
            data[row][6] = nu.getRata();
            row++;
        }
        String titile[] = {"Praktikum", "Ke", "Lulus (%)", "Gagal (%)", "Nilai max", "Nilai min", "rata-rata"};
        tabelBS.setModel(new DefaultTableModel(data, titile));
        jScrollPane1.setViewportView(tabelBS);
    }

    private void isiTableSelectBs() {
        Object data[][] = new Object[listNilaiBs.size()][5];
        int row = 0;
        for (NilaiBs bs : listNilaiBs) {
            data[row][0] = bs.getPertemuanPraktikum().getPraktikum().getNama();
            data[row][1] = bs.getPertemuanPraktikum().getPertemuanKe();
            data[row][2] = bs.getMahasiswa().getNim();
            data[row][3] = bs.getMahasiswa().getNama();
            data[row][4] = bs.getNilai();
            row++;
        }
        String titile[] = {"Praktikum", "Ke", "Nim", "Nama", "Nilai"};
        tableSelectBs.setModel(new DefaultTableModel(data, titile));
        jScrollPane3.setViewportView(tableSelectBs);
    }

    private void isiTableSelectMc() {
        Object data[][] = new Object[listNilaiMc.size()][5];
        int row = 0;
        for (NilaiMc bs : listNilaiMc) {
            data[row][0] = bs.getPertemuanPraktikum().getPraktikum().getNama();
            data[row][1] = bs.getPertemuanPraktikum().getPertemuanKe();
            data[row][2] = bs.getMahasiswa().getNim();
            data[row][3] = bs.getMahasiswa().getNama();
            data[row][4] = bs.getNilai();
            row++;
        }
        String titile[] = {"Praktikum", "Ke", "Nim", "Nama", "Nilai"};
        tableSelectMc.setModel(new DefaultTableModel(data, titile));
        jScrollPane4.setViewportView(tableSelectMc);
    }

    private void isiTableMc() {
        Object data[][] = new Object[listNilaiUtilsMc.size()][7];
        int row = 0;
        for (NilaiUtil nu : listNilaiUtilsMc) {
            data[row][0] = nu.getNamaPraktikum();
            data[row][1] = nu.getPraktikumKe();
            data[row][2] = nu.getLulus();
            data[row][3] = nu.getGagal();
            data[row][4] = nu.getNilaiMax();
            data[row][5] = nu.getNilaiMin();
            data[row][6] = nu.getRata();
            row++;
        }
        String titile[] = {"Praktikum", "Ke", "Lulus (%)", "Gagal (%)", "Nilai max", "Nilai min", "rata-rata"};
        tabelMC.setModel(new DefaultTableModel(data, titile));
        jScrollPane2.setViewportView(tabelMC);
    }

    private void buttonLihatAllDataActionPerformed() {
        if (tabelBS.getSelectedRow() >= 0) {
            PertemuanPraktikum pp = new PertemuanPraktikum();
            pp.setId(listNilaiUtilsBs.get(tabelBS.getSelectedRow()).getIdPertemuanPraktikum());
            listNilaiBs = bsPretestServiceImpl.findNilaiBss(pp);
            isiTableSelectBs();
            dialogTableBs.setSize(500, 500);
            dialogTableBs.setLocationRelativeTo(this);
            dialogTableBs.setVisible(true);
        }
    }

    private void buttonLihatDataMcActionPerformed() {
        if (tabelMC.getSelectedRow() >= 0) {
            PertemuanPraktikum pp = new PertemuanPraktikum();
            pp.setId(listNilaiUtilsMc.get(tabelMC.getSelectedRow()).getIdPertemuanPraktikum());
            listNilaiMc = mcPretestServiceImpl.findNilaiMcs(pp);
            isiTableSelectMc();
            dialogTableMc.setSize(500, 500);
            dialogTableMc.setLocationRelativeTo(this);
            dialogTableMc.setVisible(true);
        }
    }
    
    private void buttonLulusActionPerformed(){
        if (tabelBS.getSelectedRow() >= 0) {
            PertemuanPraktikum pp = new PertemuanPraktikum();
            pp.setId(listNilaiUtilsBs.get(tabelBS.getSelectedRow()).getIdPertemuanPraktikum());
            listNilaiBs = bsPretestServiceImpl.findNilaiBsLulus(pp,setting.getBataLulus());
            isiTableSelectBs();
            dialogTableBs.setSize(500, 600);
            dialogTableBs.setLocationRelativeTo(this);
            dialogTableBs.setVisible(true);
        }
    }
    
    private void buttonLulusMcActionPerformed(){
        if (tabelMC.getSelectedRow() >= 0) {
            PertemuanPraktikum pp = new PertemuanPraktikum();
            pp.setId(listNilaiUtilsMc.get(tabelMC.getSelectedRow()).getIdPertemuanPraktikum());
            listNilaiMc = mcPretestServiceImpl.findNilaiMcLulus(pp,setting.getBataLulus());
            isiTableSelectMc();
            dialogTableMc.setSize(500, 500);
            dialogTableMc.setLocationRelativeTo(this);
            dialogTableMc.setVisible(true);
        }
    }
}
