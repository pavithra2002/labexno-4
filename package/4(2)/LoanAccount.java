/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan;

import com.transact.*;
/**
 *
 * @author PAVITHRA.T
 */
public class LoanAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoanAccount omg=new LoanAccount(); 
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        
        omg.doTransaction(a,b);
        //System.out.println(args.length);
    }
    static void doTransaction(double n,double m){
     Transcation obj=new Transcation();
     System.out.println("amount credited "+obj.credit(n));
     System.out.println("amount debited "+obj.debit(m));
    }
    
}
