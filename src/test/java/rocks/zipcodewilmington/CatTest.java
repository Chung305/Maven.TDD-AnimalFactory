package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

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
    public void setNameTest(){
        //ggiven ( cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // when ( a cat is contructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String newName = "Chung";
        cat.setName(newName);

        //then
        Assert.assertEquals(newName, cat.getName());

    }

    @Test
    public void speakTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //then
        String expected = "meow!";

        Assert.assertEquals(expected, cat.speak());
    }

    @Test
    public void setBirthdayTest(){

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Date date = new Date();
        cat.setBirthDate(date);

        //then
        Assert.assertEquals(date, cat.getBirthDate());
    }

    @Test
    public void eatTest(){

        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //expected
        Integer expected = cat.getNumberOfMealsEaten() + 1;

        //action
        cat.eat(new Food());


        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());

    }

    @Test
    public void getIntegerTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Integer expected = givenId;

        Assert.assertEquals(expected, cat.getId());
    }

    @Test
    public void animalInheritanceTest(){
        Cat cat = new Cat("chung",new Date(), 45);
        Assert.assertEquals(true,  cat instanceof Mammal );
    }
    @Test
    public void mammalInheritanceTest(){
         Mammal man = new Mammal("chung", new Date(), 45) {
             @Override
             public String speak() {
                 return null;
             }
         };
        Assert.assertEquals(true, man instanceof Mammal);
    }

}
