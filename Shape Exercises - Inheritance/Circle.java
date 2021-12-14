package shapeexercises.inheritance;

public class Circle extends Shape {
    
    private double PI = 3.14;
    
    public Circle (int r){
        
        super(r);
        
    }

    @Override
    public double calculatePerimeter() {
      
        double perimeter = 2*PI*a;
        return perimeter;
        
    }

    @Override
    public double calculateArea() {
        double area = PI*a*a;
        return area;
    }
    
    
    
}
