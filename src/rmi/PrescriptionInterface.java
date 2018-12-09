/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public interface PrescriptionInterface extends Remote{
    public void setMedicines(ArrayList<Medicine> medicines)throws RemoteException ; 
}
