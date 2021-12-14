package runapp;


public class RunClass {

    public static void main (String [] args){

       Dog Bobby = new Dog (5, true);
       Bobby.setName("Bobby");
       Bobby.setBreed("Husky");
       Bobby.birthday();
       
       System.out.println(Bobby.getName()+ "is " + Bobby.getAge() + " Years Old." );

       
       Bird bird = new Bird ();
       bird.setAge(2);
       bird.setBreed("Robin");
       bird.setIsDomestic(false);
       
       Animal myAnimals [] = {Bobby, bird};
       for (Animal eachAnimal : myAnimals) {
           eachAnimal.move();
       }

    }
}
