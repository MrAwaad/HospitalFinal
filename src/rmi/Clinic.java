/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.util.ArrayList;

/**
 *
 * @author Ahmed Gamal
 */
public class Clinic {
    int ID;
    int Type;
    String Location;
    ArrayList<Doctor> doctors;
    DB db;
    public Clinic(int ID, int Type, String Location, ArrayList<Doctor> doctors) {
        this.ID = ID;
        this.Type = Type;
        this.Location = Location;
        this.doctors = doctors;
        db.insertClinic(this);
    }

    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public int getID() {
        return ID;
    }

    public int getType() {
        return Type;
    }

    public String getLocation() {
        return Location;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    
}
