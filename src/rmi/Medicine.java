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
public class Medicine {
    int barcode;
    String Name;
    int Price;
    String ProductionDate;
    String ExpiryDate;
    int Capacity;
    ArrayList<Medicine> m;
    DB db;
    
    Medicine(int barc,String Na,int pr,String prodd,String Expdd,int cap)
    {
        barcode=barc;
        Name=Na;
        Price=pr;
        ProductionDate=prodd;
        ExpiryDate=Expdd;
        Capacity=cap;
        db.insertMedicine(this);
    }
    
    
    public void setBarcode(int bar)
    {
        this.barcode = bar;
    }
    
     public int getBarcode()
    {
        return barcode;
    }
     
    public void setName(String name)
    {
        this.Name=name;
    }
    
     public String getName()
    {
        return Name;
    }
    
     public void setProductionDate(String pd)
     {
        this.ProductionDate=pd;
     }
     
     public String getProductionDate()
     {
         return ProductionDate;
     }
     
     public void setExpiryDate(String expd)
     {
         this.ExpiryDate=expd;
     }
     
     public String getExpiryDate()
     {
         return ExpiryDate;
     }
     
     public void setCapacity(int cap)
     {
         this.Capacity=cap;
     }
     public int getCapacity()
     {
         return Capacity;
     }
        
    public String getMedicine()
    {
        return Name;
    }
}
