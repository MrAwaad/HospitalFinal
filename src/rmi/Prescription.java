/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ahmed
 */
public class Prescription  extends UnicastRemoteObject implements PrescriptionInterface{
    ArrayList<Medicine> medicines;
    int id;
    String MedicineName;
    int Quantity;
    Date date;
    DB db;
    public Prescription(int ID, String MD,int quantity,Date Date)throws RemoteException
    {
      id=ID;
      MedicineName=MD;
      Quantity=quantity;
      date=Date;
      db.insertPrescription(this);
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Medicine> getMedicines() throws RemoteException{
        return medicines;
    }

    public int getId() {
        return id;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public Date getDate() {
        return date;
    }
    
}
