import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

    public abstract class GUIForm2 extends JFrame implements ActionListener {
        
        JLabel nameInfo = new JLabel("Please Enter Your Name : ");
        JLabel surnameInfo = new JLabel("Please Enter Your Surname : ");
        JLabel ageInfo = new JLabel("Please Enter Your Age : ");
        JTextField nameText = new JTextField(25);
        JTextField surnameText = new JTextField(25);
        JTextField ageText = new JTextField(25);
        
        JButton btnSubmit = new JButton("Submit");
        JButton btnClear = new JButton("Clear");
        
        GUIForm2(String title){
          setTitle(title);
          setSize(500,400);
          setLayout(new FlowLayout());
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          add(nameInfo);
          add(nameText);
          add(surnameInfo);
          add(surnameText);
          add(ageInfo);
          add(ageText);
          add(btnSubmit);
          add(btnClear);
          
          btnSubmit.addActionListener(this);
          btnClear.addActionListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            if (e.getSource() == btnSubmit) {
                
                String name,surname,ageStr;
                String output="";
                int age = 0,yearBorn =0;
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                
                name = nameText.getText();
                surname = surnameText.getText();
                ageStr = ageText.toString();
                
                try {
                    age = Integer.parseInt(ageStr);
                    yearBorn = currentYear - age;
                    output = "\n Hello " + name + " " + surname+ "\n it seems you were born in" + yearBorn;
                    JOptionPane.showMessageDialog(this, output); 
                    
                } catch (Exception ex){
                    
                JOptionPane.showMessageDialog(this,"Please Enter a number to the age field", "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    System.out.println(ex.getMessage());
                }
                        
                
            }
            else if (e.getSource() == btnClear){
                nameText.setName(""); //Empty Name Text
                surnameText.setText("");
                ageText.setText("");
                nameText.requestFocus(); // starting location of the cursor
            }
            
        }
        
    }