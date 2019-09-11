package model;

import java.util.List;

public class Manager {
    //These are set to private and also final since we do not want to make any changes after this class.
    private final List<Animal> animalsToManage;
    private final Keeper keeper;

    public Manager(List<Animal> animals, Keeper keeper) {
        this.animalsToManage = animals;
        this.keeper = keeper;
    }

    public void manage() {
      //Eventually the Try and Catch will be added within here
        keeper.feed();
    }


}
