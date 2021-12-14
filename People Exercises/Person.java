
package people;

public class Person {

    int age ;
    String name;
    private int addBirthday;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    Person(){}

    Person(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 void setAge(int age, int i) {
        throw new UnsupportedOperationException("Not supported yet.");   
    }

    public int getAddBirthday() {
        this.addBirthday = age ;
        return age +1;
        
    }

 
}
