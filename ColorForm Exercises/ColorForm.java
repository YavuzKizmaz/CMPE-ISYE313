
package colorform;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ColorForm extends JFrame implements ActionListener {

    JButton btnBlue = new JButton ("Blue");
    JButton btnGreen = new JButton ("Green");
    JButton btnRed = new JButton ("Red");
    JButton btnClear = new JButton ("Clear");
    
    public ColorForm() {
        
        
        setTitle("This form is colored");
        setSize(1050,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        add(btnRed);
        add(btnGreen);
        add(btnBlue);
        add(btnClear);
        
        JButton [] btnArray = new JButton [] {btnRed, btnGreen, btnBlue, btnClear};
        
        for (JButton eachButton : btnArray){
            eachButton.setFont(new Font("Verdana", Font.BOLD, 22));
            eachButton.setForeground(Color.WHITE);
            eachButton.setPreferredSize(new Dimension (250,50));
            eachButton.addActionListener(this);
        }
        btnRed.setBackground(Color.RED);
        btnGreen.setBackground(Color.GREEN);
        btnBlue.setBackground(Color.BLUE);
        btnClear.setBackground(Color.BLACK);
        
               
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btnRed)
            getContentPane().setBackground(Color.RED);
        
        else if (e.getSource() == btnBlue)
            getContentPane().setBackground(Color.BLUE);
        
        else if (e.getSource() == btnGreen)
            getContentPane().setBackground(Color.GREEN);
        
        else if (e.getSource()== btnClear)
            getContentPane().setBackground(Color.WHITE);
   
            
    }
    
    
    
}
