package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
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
    public void testAddDog() {
        //Given (Dog data)
        String givenName = "Joey";
        Date givenBirthDate = new Date();
        int givenId = 18;
        int expectedNumberOfDogs = 0;

        //When

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertNotEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void testRemoveDogById() {
        //Given (Dog data)
        String givenName = "Benni";
        Date givenBirthDate = new Date();
        int givenId = 18;
        Dog expected = null;


        //When

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        DogHouse.remove(18);
        Dog actual = DogHouse.getDogById(18);


        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveDog() {
        //Given (Dog data)
        String givenName = "Saweetie";
        Date givenBirthDate = new Date();
        int givenId = 18;
        Dog expected = null;


        //When

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog actual = DogHouse.getDogById(18);


        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDogById() {
        //Given (Dog data)
        String givenName = "Lucy";
        Date givenBirthDate = new Date();
        int givenId = 18;

        //When

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(18);



        // Then
        Assert.assertEquals(dog, actual);
    }

    @Test
    public void testClear() {
        //Given (Dog data)
        String givenName = "Anna";
        Date givenBirthDate = new Date();
        int givenId = 18;
        int expectedNumberOfDogs = 0;


        //When

        Dog Dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(Dog);
        DogHouse.clear();
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();


        // Then
        Assert.assertEquals(0, actualNumberOfDogs);
    }
}



