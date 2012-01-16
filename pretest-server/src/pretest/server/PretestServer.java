/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.server;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pretest.server.impl.BsPretestServiceImpl;
import pretest.server.impl.MahasiswaServiceImpl;
import pretest.server.impl.McPretestServiceImpl;
import pretest.server.impl.PraktikumServiceImpl;
import pretest.server.ui.frame.MFrame;

/**
 *
 * @author bahrie
 */
public class PretestServer {

    
    private static EntityManager entityManager;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here
//        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //System.out.println("oke");
//        bsPretestService = (BsPretestService) appContext.getBean("bsPretestService");
//        mahasiswaService = (MahasiswaService) appContext.getBean("mahasiswaService");
//        mcPretestService = (McPretestService) appContext.getBean("mcPretestService");
//        praktikumService = (PraktikumService) appContext.getBean("praktikumService");
        entityManager=Persistence.createEntityManagerFactory("pretest-serverPU1").createEntityManager();
        
        Registry server=LocateRegistry.createRegistry(4562);
        BsPretestServiceImpl bsPretestService=new BsPretestServiceImpl();
        bsPretestService.setEm(entityManager);
        
        McPretestServiceImpl mcPretestService=new McPretestServiceImpl();
        mcPretestService.setEm(entityManager);
        
        MahasiswaServiceImpl mahasiswaService=new MahasiswaServiceImpl();
        mahasiswaService.setEm(entityManager);
        
        PraktikumServiceImpl praktikumService=new PraktikumServiceImpl();
        praktikumService.setEm(entityManager);
        
        server.rebind("bsPretestService", bsPretestService);
        server.rebind("mahasiswaService", mahasiswaService);
        server.rebind("mcPretestService", mcPretestService);
        server.rebind("praktikumService", praktikumService);
        
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PretestServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                MFrame mainFrame = new MFrame();
                mainFrame.setVisible(true);
            }
        });

    }

    
    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void setEntityManager(EntityManager entityManager) {
        PretestServer.entityManager = entityManager;
    }
    
    
}
