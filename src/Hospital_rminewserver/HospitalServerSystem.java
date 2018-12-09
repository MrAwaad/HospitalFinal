/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_rminewserver;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import rmi.Accounts;
import rmi.AccountsInterface;
import rmi.Appointments;
import rmi.AppointmentsInterface;
import rmi.Patient;
import rmi.PatientInterface;

/**
 *
 * @author Ahmed Gamal
 */
public class HospitalServerSystem {

   
    public static void main(String[] args) throws RemoteException, AlreadyBoundException{
       
        AppointmentsInterface A = new  Appointments(1,new Date(),3);
        AccountsInterface AC= new Accounts(1,"Ahmed",7777);
        PatientInterface P=new Patient(1,"Ahmed Gamal","Ahmed","7777","ahmed@yahoo.com",2112135);
        Registry r = LocateRegistry.createRegistry(1099);
        
        
        r.bind("appoi", A);
        r.bind("Acco",AC);
        r.bind("Pat", P);
        System.out.println("The server is ready");
    }
    
}
