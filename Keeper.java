package model;

import java.util.List;

public class Keeper {

    List<Animal> animalsToFeed;

    //Unlike Python you will need to set the datatype with name when setting parameters in Java.
    // examples: int min, list<foods> foods, String[] args
    public Keeper(List<Animal> animals) {
      //initialize the total number of animals in the list that needs to be fed.
        animalsToFeed = animals;
    }
    //void is a keyword to specify that a method doesn't return anything. placeholder class. 
    public void feed() {
      // colon is just the simple way to write a for loop 
      //python example: For each animal in animalsToFeed
        for (Animal animal : animalsToFeed) {
          //ONLY for animals what are not hungry. So we can total up how much animals the Keeper has fed. 
          // AFTER exception is thrown down the following if should be removed since we will not care is animal isHungry.
            if (!animal.isHungry()) {
              //calling the class eat within animal.java which just returns the eat count for each animal (counter)
                int eatenTimes = animal.eat();
                System.out.println("Animal has been fed "+ eatenTimes);
            }
        }
    }


}
