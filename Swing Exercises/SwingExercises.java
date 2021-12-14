
package objectorientedprog;

import javax.swing.JOptionPane;


public class SwingExample {
    
     public static void main(String[] args) {
     
         String name;
         int age,yearBorn = 0;
         int currentYear = 2021;
         String yearBornStr;
         
         name = JOptionPane.showInputDialog("Please Enter Your Name : ");
         yearBornStr = JOptionPane.showInputDialog("Please enter which year were born : ");
         
         
         try{
         yearBorn = Integer.parseInt(yearBornStr);
         
         age = currentYear - yearBorn;
         
         JOptionPane.showMessageDialog(null, "Your Name is " + name);
         JOptionPane.showMessageDialog(null, "Your age is : " + age);
         }
         
         
         catch(Exception err){
             
             JOptionPane.showMessageDialog(null,"Please enter a Number", "Error : Type a number to year !",
                     JOptionPane.ERROR_MESSAGE);
         }
         


         
    }
    
    
    
}
