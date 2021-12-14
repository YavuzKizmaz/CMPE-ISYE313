
package shapeexercises.inheritance;


public class Rectangle extends Shape {
    
    public Rectangle(int a, int b){
        super (a,b);
        
    }

    @Override
    public double calculatePerimeter() {
      double perimeter = 2*(a+b);
      return perimeter;
    }

    @Override
    public double calculateArea() {
        double area = a*b;
        return area;
    }
    
    
    
}
