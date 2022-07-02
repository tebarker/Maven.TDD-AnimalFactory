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
    public void testSpeak() {
        //Given (dog data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        Integer givenId = 28;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String expectedString = "bark!";
        String actualString = dog.speak();

        // Then
        Assert.assertEquals(expectedString, actualString);
    }
    @Test
    public void testEat() {
        //Given (dog data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        Integer givenId = 28;
        Integer expectedNumberOfMealsEaten = 1;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Food food = new Food();
        dog.eat(food);
        Integer actualNumberOfMealsEaten = dog.getNumberOfMealsEaten();



        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void testGetId() {
        //Given (dog data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        Integer givenId = 28;
        Integer expectedId = 28;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Integer actualId = dog.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testAnimalInheritance() {
        //Given (dog data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        Integer givenId = 28;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Then
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        //Given (dog data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        Integer givenId = 28;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Then
        Assert.assertTrue(dog instanceof Mammal);
    }

}
