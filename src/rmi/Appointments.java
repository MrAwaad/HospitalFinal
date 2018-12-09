/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;



/**
 *
 * @author Ahmed Gamal
 */
public class Appointments extends UnicastRemoteObject implements AppointmentsInterface {
    DB db;
    int appointment_ID;
    Date Date;
    int Time;
    
    public Appointments(int app_id,Date date,int time)throws RemoteException
    {
        appointment_ID=app_id;
        Date=date;
        Time=time;
        db.insertAppointments(this);
    }

   

    public int getAppointment_ID() {
        return appointment_ID;
    }

    public void setAppointment_ID(int appointment_ID) {
        this.appointment_ID = appointment_ID;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }
    
     public void AddAppointment(int id)throws RemoteException
    {
       db.deleteAppointments(appointment_ID);
    }
    
    public void RemoveAppointment(int id)throws RemoteException
    {
        db.deleteAppointments(appointment_ID);
    }
    

}
