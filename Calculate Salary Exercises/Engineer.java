

package jackapp;

import javax.swing.JOptionPane;


public class Engineer {
    
    private String name;
    private double salary;
    private int age;
    private String JobTitle;
    
    
    public Engineer (String name, int age, double salary, String JobTitle){
        
        this.JobTitle = JobTitle;
        this.age = age;
        this.name = name;
        this.salary = salary;

    }

    Engineer() {
       
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return JobTitle;
    }
    

    public double addBonusToSalary (double bonus){
        this.salary = salary + 1000;
        return salary;
    }

    public void showSalary(){
        JOptionPane.showMessageDialog(null,salary);
    }
  
}
