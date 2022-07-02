package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

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
    public void testAddCat() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        int givenId = 28;
        int expectedNumberOfCats = 0;

        //When

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);
        int actualNumberOfCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertNotEquals(expectedNumberOfCats, actualNumberOfCats);
    }

    @Test
    public void testRemoveCatById() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        int givenId = 28;
        Cat expected = null;


        //When

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);
        CatHouse.remove(28);
        Cat actual = CatHouse.getCatById(28);


        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveCat() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        int givenId = 28;
        Cat expected = null;


        //When

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Cat actual = CatHouse.getCatById(28);


        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCatById() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        int givenId = 28;

        //When

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(28);



        // Then
        Assert.assertEquals(cat, actual);
    }

    @Test
    public void testGetNumberOfCats() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        int givenId = 28;
        int expectedNumberOfCats = 1;


        //When

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);
        int actualNumberOfCats = CatHouse.getNumberOfCats();


        // Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }
    @Test
    public void testClear() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        int givenId = 28;
        int expectedNumberOfCats = 0;


        //When

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);
        CatHouse.clear();
        int actualNumberOfCats = CatHouse.getNumberOfCats();


        // Then
        Assert.assertEquals(0, actualNumberOfCats);
    }
}
