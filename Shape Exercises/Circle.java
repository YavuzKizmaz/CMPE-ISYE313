
package shapeexercise;


public class Circle {
    
    private int r;
    private final double PI =3.14;
    private double area = 0;
    private double perimeter = 0;

    public Circle(int radius) {
        this.r = radius;
    }
    
    public double calculateArea(){
    
        area = PI * r * r;
        return area;
    }
    
    public double calculatePerimeter(){
    
        perimeter = 2 * PI * r;
        return perimeter;
    }
    
    
}