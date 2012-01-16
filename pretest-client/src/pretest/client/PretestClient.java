/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.client;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pretest.client.frame.MainFrameClient;
import pretest.service.BsPretestService;
import pretest.service.MahasiswaService;
import pretest.service.McPretestService;
import pretest.service.PraktikumService;

/**
 *
 * @author bahrie
 */
public class PretestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(PretestClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                new MainFrameClient().setVisible(true);
            }
        });
       
    }

}
