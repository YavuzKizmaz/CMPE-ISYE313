
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;



    public class GUIPictures extends JFrame implements ActionListener {

        ImageIcon imageG = new ImageIcon("src//images//golden.png");
        ImageIcon imageB = new ImageIcon("src//images//british.jpg");
        ImageIcon imageS = new ImageIcon("src//images//squirrel.png");
        
        JButton btnGolden = new JButton (imageG);
        JButton btnBritish = new JButton (imageB);
        JButton btnSquirrel = new JButton (imageS);
        
        JLabel animalLabel = new JLabel ("This is the animal you clicked");

        
     
        
    public GUIPictures(String title) {
        
        setTitle(title);
        setSize(600,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        animalLabel.setFont(new Font("Verdana", Font.BOLD, 26));
        
        JButton myButtonsArray [] = new JButton[] 
            {btnGolden,btnBritish,btnSquirrel};
        
        for (JButton eachBtn : myButtonsArray){
            eachBtn.setPreferredSize(new Dimension(100,130));
            eachBtn.addActionListener(this);
        }
        
        add(btnGolden);
        add(btnBritish);
        add(btnSquirrel);
        add(animalLabel);
        
    }

  
    @Override
    public void actionPerformed(ActionEvent e) {
        
      if (e.getSource() == btnGolden){
          animalLabel.setText("You Like Golden Retriever !");
      }  
      else if (e.getSource() == btnBritish){
          animalLabel.setText("You Like British Cat !");
      }
      else if (e.getSource() == btnSquirrel){
          animalLabel.setText("You Like Squirrel !");
      }
 
    }

  }
   
    

