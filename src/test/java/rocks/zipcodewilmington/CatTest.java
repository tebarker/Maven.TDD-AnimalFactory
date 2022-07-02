package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
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
    public void testSetName(){
        //Given (cat data)
        String givenName = "Nala";
        Date givenBirthDate= new Date();
        Integer givenId = 28;

        // When (a cat is constructed, we set a new name for cat, and we retrieve data from said cat)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String newName = "Sarabi";
        String retrievedName = cat.getName();

        //Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);


    }

    @Test
    public  void testSetBirthDate() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate= new Date();
        Integer givenId = 28;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setBirthDate(givenBirthDate);
        Date retrievedBirthDate = cat.getBirthDate();

        // Then
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }
    @Test
    public void testSpeak() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        Integer givenId = 28;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String expectedString = "meow!";
        String actualString = cat.speak();

        // Then
        Assert.assertEquals(expectedString, actualString);
    }
    @Test
    public void testEat() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        Integer givenId = 28;
        Integer expectedNumberOfMealsEaten = 1;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food food = new Food();
        cat.eat(food);
        Integer actualNumberOfMealsEaten = cat.getNumberOfMealsEaten();



        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void testGetId() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        Integer givenId = 28;
        Integer expectedId = 1;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Integer actualId = cat.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testAnimalInheritance() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        Integer givenId = 28;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Then
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        //Given (cat data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        Integer givenId = 28;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Then
        Assert.assertTrue(cat instanceof Mammal);
    }

}
