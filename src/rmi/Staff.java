/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author Ahmed Gamal
 */
public class Staff {
    int ID;
    String Username;
    String Password;
    int Phone;
    String Email;
    
    Staff( int id, String un, String pass, String email, int ph)
    {
        this.ID=id;
        Username=un;
        Password=pass;
        Email=email;
        Phone=ph;
    }
}
