
package people;

import javax.swing.JOptionPane;


public class People {


    public static void main(String[] args) {
       
        Person p1= new Person(21,"Name : John");
        
        Person p2= new Person();
        p2.setName("Name : Susan");
        p2.setAge(25);

        JOptionPane.showMessageDialog(null,p1.getName());
        JOptionPane.showMessageDialog(null,"John Age is : " + p1.getAge());
        JOptionPane.showMessageDialog(null," Today John's Birthday and new age is : " + p1.getAddBirthday());
        JOptionPane.showMessageDialog(null,p2.getName());
        JOptionPane.showMessageDialog(null,"Susan Age is : " + p2.getAge());

      
    }
    
}


