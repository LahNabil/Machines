/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1.entity.service;

import client1.dao.IDao;
import client1.entity.Machine;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Lahla
 */
public class MachineService extends UnicastRemoteObject implements IDao<Machine> {

    public MachineService() throws RemoteException {
        super();
    }

    @Override
    public boolean create(Machine o) throws RemoteException {
        Session session = null;
        Transaction tx = null;
        try{
            session = HibernateUtil.getSessionFactory(
//To change body of generated methods, choose Tools | Templates.
    }catch(){
        
    }
    }
    

    @Override
    public boolean update(Machine o) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Machine o) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Machine findById(int id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Machine> findAll() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
