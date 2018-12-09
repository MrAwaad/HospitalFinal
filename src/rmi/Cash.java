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
public  class Cash implements Payment {
   

    @Override
    public void CheckVisa(Patient p) {
    }

    @Override
    public void checkcash() {
        System.out.print("You have selected to pay by Cash");
    }
      

}
