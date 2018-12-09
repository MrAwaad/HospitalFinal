/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Ahmed Gamal
 */
public class Accounts extends UnicastRemoteObject implements AccountsInterface {
   
    int account_id;
    String username;
    int password;
    Patient P;
    Doctor D;
    Pharmacist Ph;
    DB db;
    public Accounts(int account_id, String username, int password) throws RemoteException {
        this.account_id = account_id;
        this.username = username;
        this.password = password;
        db.insertAccounts(this);
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
 
    
 public void Login(String x)throws RemoteException 
   {
       if(x=="Admin")
       {
           db.verifyAdmin(username, password);
       }
       else if(x=="Doctor")
       {
           db.verifyDoctor(username, password);
       }
       else if(x=="Pharmacist")
       {
           db.verifyPharmacist(username, password);
       }
       else if(x=="Patient")
       {
           db.verifyPatient(username, password);
       }
   }
   

}
