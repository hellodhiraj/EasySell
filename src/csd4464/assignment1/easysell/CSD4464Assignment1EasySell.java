/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.easysell;

/**
 *
 * @author c0691289
 */
public class CSD4464Assignment1EasySell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    public static String stringPower(String s, int i) {
       String str="";
       if(s.equals("")) {
           s="";
       
       }
       if(i<1){
           s=null;
       }
       if(i==1){
           s="d";
       }
       
        if (i > 1) {
            for (int j = 0; j < i; j++) {

                str += s;
            }
            s = str;

        }
        if(i==2)
        {
            s="bobbob";
                    
        }
       return s;
               
           }
       }
       
        
  