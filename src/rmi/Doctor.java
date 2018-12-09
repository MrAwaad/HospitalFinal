/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ahmed Gamal
 */
public class Doctor extends Staff implements DoctorInterface {
    DB db;
    String Specialization;
    int Time;
    ArrayList<Patient> patients;
    ArrayList<Prescription> prescription;
    ArrayList<Appointments> appointments;
    private String []Days=new String[2];

    public Doctor(int id, String un, String pass, String email, int ph) {
        super(id, un, pass, email, ph);
        db.insertDoctor(this);
    }
    
     public int getId()
    {
        return ID;
    }

    public void setId(int id)
    {
        this.ID = id;
    }

    public void setUsername(String username)
    {
        this.Username = username;
    }
    
    
    public String getUsername()
    {
        return Username;
    }

    public void setPassword(String Password)
    {
        this.Password = Password;
    }

      public String getPassword()
    {
        return Password;
    }
    
    public void setEmail(String Email)
    {
        this.Email = Email;
    }

    public String getEmail()
    {
        return Email;
    }

    
      public void setPhone(int Phone) 
    {
        this.Phone = Phone;
    }
 
    public int getPhone()
    {
        return Phone;
    }
    
    
     void setDays(String []D)
    {
        Days=D;
    }
   
      void setTime(int T)
    {
        Time=T;
    }
      
      public String[] getDays()
    {
        return Days;
    }
    
      public int getTime() {
        return Time;
    }
      
    public void WritePrescreption(Prescription p)throws RemoteException
    {
       db.insertPrescription(p);
    }
      
    public void WritePrescreption(Patient p)throws RemoteException
    {
        db.Getpatient(p.ID);
    }
    
}
    

