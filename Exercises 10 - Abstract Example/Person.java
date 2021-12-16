
package abstractclasses;

public class Person {
    
    protected String fullName;
    protected int age;
    protected long allowance;
    protected long salary;
    protected int currentYear;

    public Person() {
    }
    
    public Person(String fName, int a, long allowance){
        this.age = a;
        this.fullName = fName;
        this.allowance = allowance;
        
    }
    
    public Person (String FName, long salary, int a){
        this.age = a;
        this.salary = salary;
        this.fullName = FName;
    }
    
    public double calculateWeeklyIncome(){
        
        double salary = 7*70;
        return salary;
    }
    
    public double calculateMonthlyIncome (){
        double salary = 30*70;
        return salary;
    }
    
    public double calculateYearlyIncome (){
        double salary = 365*70;
        return salary;
    }
    
    
}
