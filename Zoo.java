import model.Animal;
import model.Keeper;
import model.Manager;
import java.util.ArrayList;
import java.util.List;

//Code from edX: Software Construction: Object-Oriented Design
//https://courses.edx.org/courses/course-v1:UBCx+SoftConst2x+3T2017/course/


public class Zoo {

    public static void main(String[] args) {
        //Create a new array for list of animals
        List<Animal> animals = new ArrayList<>();
        // For loop up to 10 animals in the list
        for (int i = 0; i < 10; i++) {
          //for each item in the list add a new animal
            animals.add(new Animal());
        }
        //Providing Constuctors for your classes 
        //This is the basic idea of the call stack
        //The result of the Keeper function with the parameters from 'animals' are set to a new class 'keeper'.
        Keeper keeper = new Keeper(animals);
        //Using the new 'keeper' class from the line above, the result from Manager is being returned and set to a new class 'manager'
        Manager manager = new Manager(animals, keeper);
        //Using the new 'manager' class we can then use that result into the manage class within Manager
        manager.manage();
    }


}
