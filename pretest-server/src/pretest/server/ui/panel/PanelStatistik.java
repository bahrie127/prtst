/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelStatistik.java
 *
 * Created on Nov 27, 2011, 8:36:26 PM
 */
package pretest.server.ui.panel;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import pretest.entity.JawabanBs;
import pretest.entity.JawabanMc;
import pretest.entity.enuum.Jawab;
import pretest.server.PretestServer;
import pretest.server.impl.BsPretestServiceImpl;
import pretest.server.impl.McPretestServiceImpl;
import pretest.server.util.StatistikJawaban;

/**
 *
 * @author bahrie
 */
public class PanelStatistik extends javax.swing.JPanel {

    /** Creates new form PanelStatistik */
    public PanelStatistik() throws RemoteException {
        initComponents();
        bsPretestServiceImpl = new BsPretestServiceImpl();
        mcPretestServiceImpl = new McPretestServiceImpl();
        bsPretestServiceImpl.setEm(PretestServer.getEntityManager());
        mcPretestServiceImpl.setEm(PretestServer.getEntityManager());
        
        listJawabanBs=bsPretestServiceImpl.findJawabanBss();
        listJawabanMc=mcPretestServiceImpl.findJawabanMcs();
        listStatistikJawabanBs=statistikJawabanBs(listJawabanBs);
        listStatistikJawabanMc=statistikJawabanMc(listJawabanMc);
        isiTableStatistikBs();
        isiTableStatistikMc();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelStatistikBs = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableStatistikMc = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Statistik Benar Salah"));

        tabelStatistikBs.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelStatistikBs);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statistik Pilihan Ganda"));

        tableStatistikMc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableStatistikMc);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(75, Short.MAX_VALUE)))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelStatistikBs;
    private javax.swing.JTable tableStatistikMc;
    // End of variables declaration//GEN-END:variables

    private BsPretestServiceImpl bsPretestServiceImpl;
    private McPretestServiceImpl mcPretestServiceImpl;
    private List<JawabanBs> listJawabanBs;
    private List<JawabanMc> listJawabanMc;
    private List<StatistikJawaban> listStatistikJawabanBs;
    private List<StatistikJawaban> listStatistikJawabanMc;
    
    private List<StatistikJawaban> statistikJawabanBs(List<JawabanBs> jawabanBses) {
        List<StatistikJawaban> statistikJawabans = new ArrayList<StatistikJawaban>();
        if (!jawabanBses.isEmpty()) {
            int index = 0;
            do {
                int jumlahMhs=0;
                int benar=0;
                int persenBenar=0;
                int persenSalah=0;
                double nilaiTerRendah = 100;
                Long idSoal = jawabanBses.get(index).getSoalBs().getId();
                for (; index < jawabanBses.size(); index++) {
                    if (jawabanBses.get(index).getSoalBs().getId() == idSoal) {
                        jumlahMhs++;
                        if(jawabanBses.get(index).getJawab()==Jawab.B){
                            benar++;
                        }
                        
                    } else {
                        break;
                    }
                }
                persenBenar=benar*100/jumlahMhs;
                persenSalah=100-persenBenar;
                StatistikJawaban sj=new StatistikJawaban();
                sj.setIdSoal(idSoal);
                sj.setJumlahMhs(jumlahMhs);
                sj.setKe(jawabanBses.get(index-1).getSoalBs().getPertemuanPraktikum().getPertemuanKe()+"");
                sj.setParktikum(jawabanBses.get(index-1).getSoalBs().getPertemuanPraktikum().getPraktikum().getNama());
                sj.setPersenBenar(persenBenar);
                sj.setPersenSalah(persenSalah);
                statistikJawabans.add(sj);
                index++;
            } while (index < jawabanBses.size());
        }

        return statistikJawabans;
    }
    
    private List<StatistikJawaban> statistikJawabanMc(List<JawabanMc> jawabanMcs) {
        List<StatistikJawaban> statistikJawabans = new ArrayList<StatistikJawaban>();
        if (!jawabanMcs.isEmpty()) {
            int index = 0;
            do {
                int jumlahMhs=0;
                int benar=0;
                int persenBenar=0;
                int persenSalah=0;
                double nilaiTerRendah = 100;
                Long idSoal = jawabanMcs.get(index).getSoalMc().getId();
                for (; index < jawabanMcs.size(); index++) {
                    if (jawabanMcs.get(index).getSoalMc().getId() == idSoal) {
                        jumlahMhs++;
                        if(jawabanMcs.get(index).getJawab()==Jawab.B){
                            benar++;
                        }
                        
                    } else {
                        break;
                    }
                }
                persenBenar=benar*100/jumlahMhs;
                persenSalah=100-persenBenar;
                StatistikJawaban sj=new StatistikJawaban();
                sj.setIdSoal(idSoal);
                sj.setJumlahMhs(jumlahMhs);
                sj.setKe(jawabanMcs.get(index-1).getSoalMc().getPertemuanPraktikum().getPertemuanKe()+"");
                sj.setParktikum(jawabanMcs.get(index-1).getSoalMc().getPertemuanPraktikum().getPraktikum().getNama());
                sj.setPersenBenar(persenBenar);
                sj.setPersenSalah(persenSalah);
                statistikJawabans.add(sj);
                index++;
            } while (index < jawabanMcs.size());
        }

        return statistikJawabans;
    }
    
    private void isiTableStatistikBs() {
        Object data[][] = new Object[listStatistikJawabanBs.size()][6];
        int row = 0;
        for (StatistikJawaban sj : listStatistikJawabanBs) {
            data[row][0] = sj.getParktikum();
            data[row][1] = sj.getKe();
            data[row][2] = sj.getIdSoal();
            data[row][3] = sj.getPersenBenar();
            data[row][4] = sj.getPersenSalah();
            data[row][5] = sj.getJumlahMhs();
            
            row++;
        }
        String titile[] = {"Praktikum", "Ke", "id Soal", "Benar (%)", "Salah (%)", "Jumlah Mahasiswa"};
        tabelStatistikBs.setModel(new DefaultTableModel(data, titile));
        jScrollPane1.setViewportView(tabelStatistikBs);
    }
    
    private void isiTableStatistikMc() {
        Object data[][] = new Object[listStatistikJawabanMc.size()][6];
        int row = 0;
        for (StatistikJawaban sj : listStatistikJawabanMc) {
            data[row][0] = sj.getParktikum();
            data[row][1] = sj.getKe();
            data[row][2] = sj.getIdSoal();
            data[row][3] = sj.getPersenBenar();
            data[row][4] = sj.getPersenSalah();
            data[row][5] = sj.getJumlahMhs();
            
            row++;
        }
        String titile[] = {"Praktikum", "Ke", "id Soal", "Benar (%)", "Salah (%)", "Jumlah Mahasiswa"};
        tableStatistikMc.setModel(new DefaultTableModel(data, titile));
        jScrollPane2.setViewportView(tableStatistikMc);
    }
    
}
