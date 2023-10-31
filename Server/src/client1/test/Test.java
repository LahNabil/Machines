/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1.test;

import client1.dao.IDao;
import client1.entity.Machine;
import client1.entity.Salle;
import client1.serivce.MachineService;
import client1.serivce.SalleService;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lahla
 */
public class Test {
    public static void main(String[] args) {
        try {
            IDao<Machine> machineDao = new MachineService();

            for (Machine m : machineDao.findAll()) {
                System.out.println(m);
            }

            IDao<Salle> salleDao = new SalleService();
            
            salleDao.create(new Salle("Salle1"));
            salleDao.create(new Salle("Salle2"));
            salleDao.create(new Salle("Salle3"));

            for (Salle s : salleDao.findAll()) {
                System.out.println(s);
            }

        } catch (RemoteException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
