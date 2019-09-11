package model;

public class Animal {
    // Set initial values but keep an eye on the boolean hungry
    private boolean isHungry = true;
    private boolean hungry;
    private int eaten = 0;

    // getters
    public boolean isHungry() { return hungry; }

    // REQUIRES: animal must be hungry
    //For when !isHungry then throw an exception To be added
    public int eat() {
        isHungry = false;
        eaten++;
        return eaten;
    }


}
