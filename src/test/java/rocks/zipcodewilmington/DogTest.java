package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void contructorTest(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();

        Integer givenId = 0;

        // When (a cat is constructed)
        Dog cat = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog(null,null,null);

        String expected = dog.speak();

        Assert.assertEquals(expected, dog.speak());

    }

    @Test
    public void setDateTest(){
        Dog dog = new Dog(null, null, null);
        Date date = new Date();
        dog.setBirthDate(date);

        Assert.assertEquals(date, dog.getBirthDate());
    }

    @Test
    public void eatTest(){
        Dog dog = new Dog(null, null, null);
        Integer expected = dog.getNumberOfMealsEaten() + 1;

        dog.eat(new Food());

        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());
    }


    @Test
    public void getIdTest(){
        Integer expected = 13;
        Dog dog = new Dog(null, null, expected);

        Assert.assertEquals(expected, dog.getId());

    }

    @Test
    public void animalInheritanceTest(){
        Dog dog = new Dog(null, null, null);

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest(){
        Dog dog = new Dog(null,null,null);

        Assert.assertTrue(dog instanceof Mammal);
    }
}
