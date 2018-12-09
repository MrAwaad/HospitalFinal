/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;

/**
 *
 * @author Ahmed Gamal
 */
public class Admin extends Staff{
    DB db;
    private static Admin Instance;
    public Admin(int id, String un, String pass, String email, int ph) {
        super(id, un, pass, email, ph);
        db.insertAdmin(this);
    }
    public static Admin GetInstance(int id, String un, String pass, String email, int ph)
    {
        if(Instance == null)
        {
            Instance=new Admin(id, un, pass, email, ph);
        }
        return Instance;
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
    

      
    public void CreateAccount(Accounts acc)throws RemoteException 
    {
       db.insertAccounts(acc);
    }
    public void DeleteAccount(Accounts acc)throws RemoteException 
    {
        db.deleteAccounts(acc.account_id);
    }   
    
}
