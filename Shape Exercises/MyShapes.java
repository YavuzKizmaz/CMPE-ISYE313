
package shapeexercise;

import javax.swing.JOptionPane;

public class MyShapes {


    public static void main(String[] args) {
       
        Circle myCircle = new Circle(6);
        RightAngledTriangle myTriangle = new RightAngledTriangle(5,4,9);   
        Object [] shapes = {myCircle,myTriangle};
        String output="";
        
        for (Object eachShape : shapes){
        
            if (eachShape instanceof Circle c){
            output +=  "\n Circle area = " + c.calculateArea();
            output +=  "\n Circle perimeter = " + c.calculatePerimeter();
            }
            
            if (eachShape instanceof RightAngledTriangle t){
            output +=  "\n Right Angled Triangle area = " + t.calculateArea();
            output +=  "\n Right Angled Triangle perimeter = " + t.calculatePerimeter();
            }
        }//for each
        
        JOptionPane.showMessageDialog(null, output);
    }
    
}