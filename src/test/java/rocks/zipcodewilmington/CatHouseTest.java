package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest(){
        ArrayList<Cat> catHouse = new ArrayList<>();
        Cat chung = new Cat(null, null, null);

        catHouse.add(chung);

        Assert.assertEquals(chung, catHouse.get(0));
    }

    @Test
    public void removeIdTest(){
        CatHouse.add(new Cat("booh", new Date(), 0));
        CatHouse.add(new Cat("b00h", new Date(), 1));

        Integer before = CatHouse.getNumberOfCats() - 1;
        CatHouse.remove(0);
        Assert.assertEquals(before, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeCatTest(){
        Cat a = new Cat("bleh", new Date(), 2);
        CatHouse.add(new Cat("blwh", new Date(), 0));
        CatHouse.add(new Cat("blwh", new Date(), 1));
        CatHouse.add(a);

        Integer before = CatHouse.getNumberOfCats() - 1;
        CatHouse.remove(a);
        Assert.assertEquals(before, CatHouse.getNumberOfCats());
    }

    @Test
    public void getCatByIdTest(){

        Cat a = new Cat("bleh", new Date(), 2);
        CatHouse.add(new Cat("blwh", new Date(), 0));
        CatHouse.add(new Cat("blwh", new Date(), 1));
        CatHouse.add(a);

        Assert.assertEquals(a, CatHouse.getCatById(a.getId()));
    }

    @Test
    public void getNumberOfCatsTest(){
        CatHouse.add(new Cat("blwh", new Date(), 0));
        Integer before = CatHouse.getNumberOfCats() + 1;
        CatHouse.add(new Cat("blwh", new Date(), 1));

        Assert.assertEquals(before, CatHouse.getNumberOfCats());
    }

}
