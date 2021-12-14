
package runapp;


public class Animal {
    
    protected int age;
    protected String breed;
    protected boolean isDomestic = false;

    public Animal() {}
    
    public Animal (int a, boolean isD){
        this.age = a;
        this.isDomestic = isD;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsDomestic(boolean domestic) {
        this.isDomestic = domestic;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isIsDomestic() {
        return isDomestic;
    }
    
    public void move(){
        System.out.println("Animal");
    }        
}
    



