package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateNewDog() {
        // Given
        String expectedName = "Beyoncé";
        Date expectedDate = new Date();
        Integer expectedNumberOfDogs = 1;
        // When
        Dog animal = AnimalFactory.createDog(expectedName, expectedDate);
        DogHouse.add(animal);
        Integer actualNumberOfDogs = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void testCreateNewCat() {
        // Given
        String expectedName = "Bonnie";
        Date expectedDate = new Date();
        Integer expectedNumberOfCats = 1;
        // When
        Cat animal = AnimalFactory.createCat(expectedName, expectedDate);
        CatHouse.add(animal);
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();
        // Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }

}
