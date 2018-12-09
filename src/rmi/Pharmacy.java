/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Ahmed Gamal
 */
public class Pharmacy extends UnicastRemoteObject implements PharmacyInterface {
    DB db;
    int PharID;
    String Location;
    int phone_No;
    ArrayList<Medicine> medicine;

    public Pharmacy(int PharID, String Location, int phone_No, ArrayList<Medicine> medicine)throws RemoteException {
        this.PharID = PharID;
        this.Location = Location;
        this.phone_No = phone_No;
        this.medicine = medicine;
        db.insertPharmacy(this);
    }

    public int getPharID() {
        return PharID;
    }

    public void setPharID(int PharID) {
        this.PharID = PharID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getPhone_No() {
        return phone_No;
    }

    public void setPhone_No(int phone_No) {
        this.phone_No = phone_No;
    }

    public ArrayList<Medicine> getMedicine() {
        return medicine;
    }

    public void setMedicine(ArrayList<Medicine> medicine) {
        this.medicine = medicine;
    }
    
public void AddMedicine(Medicine m)throws RemoteException
{
    db.insertMedicine(m);
}
 public void RemoveMedicine(Medicine m)throws RemoteException
 {
    db.deleteMedicine(m.barcode);
 }
 
 public void EditMedicine(Medicine m)throws RemoteException
 {
   db.updateMedicine(m);
 
 } 
 
    
}
