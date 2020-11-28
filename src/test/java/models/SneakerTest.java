package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class SneakerTest {


    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        // then (3)
        assertEquals(expected, testSneaker.getName());
    }


    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        double expectedSize = 9.0;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport,expectedSize, expectedQty,expectedPrice);


        // (4)
        assertEquals(expectedId, testSneaker.getId());
        assertEquals(expectedName, testSneaker.getName());
        assertEquals(expectedBrand, testSneaker.getBrand());
        assertEquals(expectedSport, testSneaker.getSport());
        assertEquals(expectedSize, testSneaker.getSize());
        assertEquals(expectedQty, testSneaker.getQty());
        assertEquals(expectedPrice, testSneaker.getPrice());
    }

    @Test
    public void testGetId() {
        int expectedId = 0;
        Sneaker sneaker = new Sneaker(0,"","","",9.0,0,9.00f);
        int actualId = sneaker.getId();

        assertEquals(expectedId,actualId);
    }

    @Test
    public void testGetName() {
        String expectedName = "Buzz";
        Sneaker sneaker = new Sneaker(0,"Buzz","","",9.0,0,9.00f);
        String actualName = sneaker.getName();


        assertEquals(expectedName,actualName);
    }

    @Test
    public void testGetBrand() {
        String expectedBrand = "Adidas";
        Sneaker sneaker = new Sneaker(0,"Buzz","Adidas","",9.0,0,9.00f);
        String actualBrand = sneaker.getBrand();


        assertEquals(expectedBrand,actualBrand);
    }

    @Test
    public void testGetSport() {
        String expectedSport = "Soccer";
        Sneaker sneaker = new Sneaker(0,"Buzz","","Soccer",9.0,0,9.00f);
        String actualSport = sneaker.getSport();


        assertEquals(expectedSport,actualSport);
    }

    @Test
    public void testGetSize() {
        double expectedSize = 9.0;
        Sneaker sneaker = new Sneaker(0,"Buzz","","Soccer",9.0,0,9.00f);
        double actualSize = sneaker.getSize();

        assertEquals(expectedSize,actualSize);
    }

    @Test
    public void testGetQty() {
        int expectedQty = 0;
        Sneaker sneaker = new Sneaker(0,"Buzz","","Soccer",9.0,0,9.00f);
        int actualQty = sneaker.getQty();

        assertEquals(expectedQty,actualQty);
    }

    @Test
    public void testGetPrice() {
        double expectedPrice = 9.00;
        Sneaker sneaker = new Sneaker(0,"Buzz","","Soccer",9.0,0,9.00f);
        double actualPrice = sneaker.getPrice();

        assertEquals(expectedPrice,actualPrice);
    }
}
