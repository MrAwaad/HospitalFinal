/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Ahmed
 */
public interface PrescriptionInterface extends Remote{
    public void setMedicines(ArrayList<Medicine> medicines)throws RemoteException ;

    public void setId(int id)throws RemoteException;
    

    public void setQuantity(int Quantity)throws RemoteException ;
        
    

    public void setDate(Date date)throws RemoteException ;
       
    

    public ArrayList<Medicine> getMedicines() throws RemoteException;
   
    

    public int getId()throws RemoteException ;
        
    

    public String getMedicineName() throws RemoteException;
        
    

    public int getQuantity()throws RemoteException ;
        
    

    public Date getDate() throws RemoteException;
      
    
    
}
