package abstractclasses;


public class Employee extends Person {
    
    private String jobTitle;
    
    public Employee(String name, long salary, int age){
        this.fullName = name;
        this.salary = salary;
        this.age = age;
    }



    Employee(int i, String jack) {
        
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String title) {
        this.jobTitle = title;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
    @Override
    public double calculateYearlyIncome() {
         double salary = 365*70;
        return salary;
    }


    @Override
    public double calculateMonthlyIncome() {
        double salary = 30*70;
        return salary;
    }

    @Override
    public double calculateWeeklyIncome() {
        double salary = 7*70;
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(String jack) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getFullName(String jack) {
        this.fullName = fullName;
    }
  

}
