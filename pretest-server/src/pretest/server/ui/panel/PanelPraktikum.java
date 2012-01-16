/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelPraktikum.java
 *
 * Created on Dec 5, 2011, 7:43:16 PM
 */
package pretest.server.ui.panel;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import pretest.entity.Praktikum;
import pretest.server.PretestServer;
import pretest.server.impl.PraktikumServiceImpl;

/**
 *
 * @author bahrie
 */
public class PanelPraktikum extends javax.swing.JPanel {

    /** Creates new form PanelPraktikum */
    public PanelPraktikum() throws RemoteException {
        initComponents();
        praktikumService=new PraktikumServiceImpl();
        praktikumService.setEm(PretestServer.getEntityManager());
      //  statusAwal();
        tablePraktikum.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                initSelectTable();
            }
        });
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
        tablePraktikum = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textPraktikum = new javax.swing.JTextField();
        buttonReload = new javax.swing.JButton();
        buttonSimpan = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabel Praktikum"));

        tablePraktikum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablePraktikum);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Praktikum"));

        jLabel1.setText("Nama");

        buttonReload.setText("Reload");
        buttonReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReloadActionPerformed(evt);
            }
        });

        buttonSimpan.setText("Tambah");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonUbah.setText("Ubah");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonReload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHapus))
                    .addComponent(textPraktikum, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textPraktikum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonReload)
                    .addComponent(buttonSimpan)
                    .addComponent(buttonUbah)
                    .addComponent(buttonHapus))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void buttonReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReloadActionPerformed
    statusAwal();
}//GEN-LAST:event_buttonReloadActionPerformed

private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
    buttonSimpanActionPerformed();
}//GEN-LAST:event_buttonSimpanActionPerformed

private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
    buttonUbahActionPerformed();
}//GEN-LAST:event_buttonUbahActionPerformed

private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
    buttonHapusActionPerformed();
}//GEN-LAST:event_buttonHapusActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonReload;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePraktikum;
    private javax.swing.JTextField textPraktikum;
    // End of variables declaration//GEN-END:variables
    private Praktikum praktikum;
    private List<Praktikum> praktikums;
    private PraktikumServiceImpl praktikumService;

    private void statusAwal() {
        clearText();
        loadAllData();
        isiTable();
        buttonHapus.setEnabled(false);
        buttonUbah.setEnabled(false);
        buttonSimpan.setEnabled(true);
    }

    private void isiTable() {
        Object data[][] = new Object[praktikums.size()][2];
        int row = 0;
        for (Praktikum p : praktikums) {
            data[row][0] = p.getId();
            data[row][1] = p.getNama();

            row++;
        }
        String titile[] = {"No", "Nama"};
        tablePraktikum.setModel(new DefaultTableModel(data, titile));
        jScrollPane1.setViewportView(tablePraktikum);
    }

    private void loadAllData() {
        
            praktikums = new ArrayList<Praktikum>();
            praktikums = praktikumService.findPraktikums();
        
    }

    private void clearText() {
        textPraktikum.setText("");
    }

    private void isiText() {
        textPraktikum.setText(praktikum.getNama());
    }

    private void initSelectTable() {
        if (tablePraktikum.getSelectedRow() >= 0) {
            praktikum = praktikums.get(tablePraktikum.getSelectedRow());
            isiText();
            buttonHapus.setEnabled(true);
            buttonUbah.setEnabled(true);
            buttonSimpan.setEnabled(false);
        }
    }

    private boolean cekText() {
        if (!textPraktikum.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    private void buttonSimpanActionPerformed() {
        if (cekText()) {
          
                praktikum = new Praktikum();
                praktikum.setNama(textPraktikum.getText().trim());

                praktikumService.save(praktikum);
                statusAwal();
           
        } else {
            JOptionPane.showMessageDialog(null, "text field tidak boleh kosong");
        }
    }

    private void buttonUbahActionPerformed() {
        if (cekText()) {
           
                praktikum.setNama(textPraktikum.getText().trim());

                praktikumService.save(praktikum);
                statusAwal();
            
        } else {
            JOptionPane.showMessageDialog(null, "text field tidak boleh kosong");
        }
    }

    private void buttonHapusActionPerformed() {
        if (tablePraktikum.getSelectedRow() >= 0) {
            
                praktikum = praktikums.get(tablePraktikum.getSelectedRow());
                praktikumService.delete(praktikum);
                JOptionPane.showMessageDialog(null, "data sudah dihapus");
            
        }
        statusAwal();
    }

    
}
