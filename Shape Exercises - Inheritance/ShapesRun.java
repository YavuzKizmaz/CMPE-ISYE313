
package shapeexercises.inheritance;

import javax.swing.JOptionPane;


public class ShapesRun {

    public static void main(String[] args) {
     
        Square s = new Square (5);
        Rectangle r = new Rectangle(2,4);
        Circle c = new Circle (5);
        
        s.setName("Square");
        r.setName("Rectangle");
        c.setName("Circle");
        
        Shape shapesArray [] ={s,r,c};
        String output="";
        
        for (Shape eachShape : shapesArray){
          output += "Shape Name = " + eachShape.getName() + "\n";
            output += eachShape.getName() +" Area = " + eachShape.calculateArea() + "\n";
            output += eachShape.getName() + " Perimeter = " + eachShape.calculatePerimeter() +"\n";
            output +="---------------------------------------\n";  
        }
        
        JOptionPane.showMessageDialog(null,output);
        
    }
    
}
