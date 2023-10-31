/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1.serveur;

import client1.dao.IDao;
import client1.entity.Machine;
import client1.entity.Salle;
import client1.serivce.MachineService;
import client1.serivce.SalleService;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lahla
 */
public class server {
     public static void main(String[] args) {
        try {
            IDao<Machine> machineDao = new MachineService();
            IDao<Salle> salleDao = new SalleService();
            LocateRegistry.createRegistry(1099);
            Naming.bind("rmi://localhost:1099/machineDao", machineDao);
            Naming.bind("rmi://localhost:1099/salleDao", salleDao);
            System.out.println("En attente des clients");
        } catch (RemoteException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
