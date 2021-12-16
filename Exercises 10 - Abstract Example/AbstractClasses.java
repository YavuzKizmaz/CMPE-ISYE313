
package abstractclasses;

import javax.swing.JOptionPane;


public class AbstractClasses {

   
    public static void main(String[] args) {
        
       Employee e1 = new Employee (30,"Jack");
       e1.setAge(30);
       e1.setFullName("Jack");
       e1.setJobTitle("Computer Engineer");
       e1.salary = (long) e1.calculateWeeklyIncome();
       e1.salary = (long) e1.calculateMonthlyIncome();
       e1.salary = (long) e1.calculateYearlyIncome();
       
       Student s1 = new Student (19, "Suzan");
       s1.setSchoolName("Cyprus International University");
       s1.setAge(19);
       s1.setFullName("Suzan");
       s1.setAllowance(20);
       s1.allowance = (long) s1.calculateWeeklyIncome();
       s1.allowance = (long) s1.calculateMonthlyIncome();
       
       
       
       JOptionPane.showMessageDialog(null, "\n Name : " + e1.getFullName() + "\n Age : " + e1.getAge() + 
               "\n Job Name : " + e1.getJobTitle() +
               "\n Daily Salary : 70 £ " +
               "\n Weekly Salary : " + e1.calculateWeeklyIncome() + " £" +
               "\n Monthly Salary : " + e1.calculateMonthlyIncome() + " £" +
               "\n Yearly Salary : " + e1.calculateYearlyIncome() + " £" + 
                       
                       "\n\n --------------------------------------------- \n" + 
                       "\n Name : " + s1.getFullName() + "\n Age : " + s1.getAge() + 
                       "\n School Name : " + s1.getSchoolName() + 
                       "\n Daily Allowance : 20 £ " +
                       "\n Weekly Allowance  : " + s1.calculateWeeklyIncome() + " £ " +
                       "\n Monthly Allowance : " + s1.calculateMonthlyIncome() + " £ " +
                       "\n Birth Year : " + s1.getYearBorn());
                        
        
        
        
    }
    
}
