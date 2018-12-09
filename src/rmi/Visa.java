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
public class Visa implements Payment {
    DB db;
      public void CheckVisa(Patient p)
      {
          db.verifyvisanumber(p.ID, p.visa_no);
      } 

    @Override
    public void checkcash() {
    }

}
