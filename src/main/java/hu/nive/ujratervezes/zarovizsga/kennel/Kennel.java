package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();


    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void feedAll() {
        for (Dog actualDog : dogs) {
            actualDog.feed();
        }
    }

    public Dog findByName(String name) {
        for (Dog actualDog : dogs) {
            if (actualDog.getName().equals(name)) {
                return actualDog;
            }
        }
        throw new IllegalArgumentException("Dog not found by name: " + name);
    }

    public void playWith(String name, int hour) {
        findByName(name).play(hour);
    }

    public List<String> getHappyDogNames(int dogHappiness) {
        List<String> dogNames = new ArrayList<>();
        for (Dog actualDog : dogs) {
            if (actualDog.getHappiness() > dogHappiness) {
                dogNames.add(actualDog.getName());
            }
        }
        return dogNames;
    }
}
