/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Ahmed
 */
public interface PharmacyInterface extends Remote{
   public void AddMedicine(Medicine m)throws RemoteException;
   public void RemoveMedicine(Medicine m)throws RemoteException;
   public void EditMedicine(Medicine m)throws RemoteException; 
}
