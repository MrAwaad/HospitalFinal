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
public interface DoctorInterface extends Remote {
    public void WritePrescreption( ArrayList<Medicine> Med ,int id, String MedicineName, int Quantity, Date date)throws RemoteException;
    public ArrayList<String> ViewReservation()throws RemoteException;
}
