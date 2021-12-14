import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIForm extends JFrame implements ActionListener{

    JLabel myInfo = new JLabel("Please enter your name : ");
    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear");
    JTextField nameText = new JTextField(15);


        GUIForm(String title){
    setTitle(title);
    setSize(600, 400);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    add(myInfo);
    add(nameText);
    add(btnSubmit);
    add(btnClear);

    btnSubmit.addActionListener((ActionListener) this);
    btnClear.addActionListener((ActionListener) this);
}

@Override
        public void actionPerformed(ActionEvent e) {

    String name;

    if (e.getSource() == btnSubmit) {

    name = nameText.getText();
    JOptionPane.showMessageDialog(this,
    "Hello "+ name +
    " Hope you are enjoying the Java Language ");
    }

        else if (e.getSource() == btnClear) {
        }
}
}