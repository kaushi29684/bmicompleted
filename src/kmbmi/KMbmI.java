/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmbmi;

import javax.swing.JOptionPane;
public class KMbmI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        String Weight;
        double W;
        
        String Height;
        double H;
        
        JOptionPane.showMessageDialog(null, "Welcome to BMI Calculater");
        // ask for height and Weight
        Weight = JOptionPane.showInputDialog(null, "Enter Your Weight In Kilograms");
        Height= JOptionPane.showInputDialog( null, "Enter Your Height in Meters");
        // Convert Variables to doubles
        
      W = Double.valueOf(Weight);
      H = Double.valueOf(Height);
      
      //Calculation
      double HH = H*H;
      double bMI = W/HH;
      
      long bmI = Math.round(bMI);
     
        System.out.println("Your BMI is: "+bmI);  
        JOptionPane.showMessageDialog(null,"Your BMI is:"+bmI);
        if (bMI>=25){
            JOptionPane.showMessageDialog(null, "You Need to Diet and Exercise!");}
        if (bMI<=25){
            JOptionPane.showMessageDialog(null, "You are in Good Shape. Keep it Up!");
        }
        
        
    }
    
}
