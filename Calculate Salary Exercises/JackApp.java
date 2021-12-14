

package jackapp;

import javax.swing.JOptionPane;

public class JackApp {

    public static void main(String[] args) {
       
        Engineer p3 = new Engineer("Name : Jack",32,2250,"Computer Engineer");

        JOptionPane.showMessageDialog(null,p3.getName());
        JOptionPane.showMessageDialog(null,"Jack Age is : " + p3.getAge());
        JOptionPane.showMessageDialog(null,"Jack Job is : " + p3.getJobTitle());
        JOptionPane.showMessageDialog(null,"Jack Salary is : " + p3.getSalary());
        JOptionPane.showMessageDialog(null, "Jack Total Salary is : " + p3.addBonusToSalary(0));
        

    }
    
}
