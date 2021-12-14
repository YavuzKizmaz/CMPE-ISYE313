
package shapeexercises.inheritance;


public class Shape {
    
    protected int a;
    protected int b;
    protected String shapeName;
    
    public Shape(){
        
    }
    
    public Shape(int a){
        this.a = a;
    }
    
    public Shape (int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public double calculateArea(){
        return 0;
    }
    
    public double calculatePerimeter(){
        return 0;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setName(String n) {
        this.shapeName = n;
    }

    public String getName() {
        return shapeName;
    }
    
    
    
    
    
    
    
}
