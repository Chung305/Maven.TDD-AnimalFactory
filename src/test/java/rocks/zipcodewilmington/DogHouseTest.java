package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void getDogByIdTest(){
        String name = "Milo";
        Date birthDate = new Date();
        DogHouse.clear();

        Dog animal = AnimalFactory.createDog(name, birthDate);
        Integer expected = DogHouse.getNumberOfDogs() + 1;

        DogHouse.add(animal);


        Assert.assertEquals(expected, DogHouse.getDogById(1));


    }

    @Test
    public void testRemoveDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.remove(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAddDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When

        Integer expected =  DogHouse.getNumberOfDogs() + 1;
        DogHouse.add(animal);
        // Then
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());

    }
    @Test
    public void removeDogByIdTest(){
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();


        Integer expected = DogHouse.getNumberOfDogs();
        DogHouse.add(animal);
        DogHouse.remove(0);



        Assert.assertEquals(expected, DogHouse.getNumberOfDogs(),0);

//        Dog dog = new Dog("chung", new Date(), 2);
//        DogHouse.add(dog);
//        DogHouse.remove(dog.getId());
//        Assert.assertEquals(null, DogHouse.getDogById(dog.getId()));
    }
}


