
package abstractclasses;


public class Student extends Person {
    
    private String schoolName;
    
    private int yearBorn = 2002 ;
    
    public Student (String name, int a, long allowance){
        
        super (name, a, allowance);
        
    }

    Student(int i, String suzan) {
        
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.schoolName = SchoolName;
    }

    public void calculateBirthYear(){
    
        age = currentYear - yearBorn; 
       
    }    

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAllowance(long allowance) {
        this.allowance = allowance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public long getAllowance() {
        return allowance;
    }

    @Override
    public double calculateMonthlyIncome() {
        double Monthlyallowance = 30*20;
        return Monthlyallowance;
    }

    @Override
    public double calculateWeeklyIncome() {
        double Weeklyallowance = 7*20;
        return Weeklyallowance;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    
    
}

