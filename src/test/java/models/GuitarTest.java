package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuitarTest {

    @Test
    public void testConstructor() {
        int expectedId = 0;
        String expectedName = "Buzz";
        String expectedBrand = "Gibson";
        String expectedModel = "ES-335";
        int expectedQty = 0;
        float expectedPrice = 2300.00f;

        Guitar guitar = new Guitar(expectedId,expectedName,expectedBrand,expectedModel,expectedQty, expectedPrice);

        int actualId = guitar.getId();
        String actualName = guitar.getName();
        String actualBrand = guitar.getBrand();
        String actualModel = guitar.getModel();
        int actualQty = guitar.getQty();
        float actualPrice = guitar.getPrice();

        assertEquals(expectedId,actualId);
        assertEquals(expectedName, actualName);
        assertEquals(expectedBrand, actualBrand);
        assertEquals(expectedModel,actualModel);
        assertEquals(expectedQty,actualQty);
        assertEquals(expectedPrice,actualPrice);
    }


    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Buzz";

        // when (2)
        Guitar guitar = new Guitar(0,"Buzz","","",0,2300.00f);


        // then (3)
        assertEquals(expected, guitar.getName());
    }


    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Buzz";
        String expectedBrand = "Gibson";
        String expectedModel = "ES-335";
        int expectedQty = 10;
        float expectedPrice = 2300.00f;

        // (3)
        Guitar guitar = new Guitar(expectedId, expectedName, expectedBrand,
                expectedModel, expectedQty,expectedPrice);


        // (4)
        assertEquals(expectedId, guitar.getId());
        assertEquals(expectedName, guitar.getName());
        assertEquals(expectedBrand, guitar.getBrand());
        assertEquals(expectedModel, guitar.getModel());
        assertEquals(expectedQty, guitar.getQty());
        assertEquals(expectedPrice, guitar.getPrice());
    }

    @Test
    public void testGetId() {
        int expectedId = 0;
        Guitar guitar = new Guitar(0,"","","",0,9.00f);
        int actualId = guitar.getId();

        assertEquals(expectedId,actualId);
    }

    @Test
    public void testGetName() {
        String expectedName = "Buzz";
        Guitar guitar = new Guitar(0,"Buzz","","",0,9.00f);
        String actualName = guitar.getName();


        assertEquals(expectedName,actualName);
    }

    @Test
    public void testGetBrand() {
        String expectedBrand = "Gibson";
        Guitar guitar = new Guitar(0,"Buzz","Gibson","",0,9.00f);
        String actualBrand = guitar.getBrand();


        assertEquals(expectedBrand,actualBrand);
    }

    @Test
    public void testGetModel() {
        String expectedModel = "ES-335";
        Guitar guitar = new Guitar(0,"Buzz","Gibson","ES-335",0,9.00f);
        String actualModel = guitar.getModel();


        assertEquals(expectedModel,actualModel);
    }

    @Test
    public void testGetQty() {
        int expectedQty = 0;
        Guitar guitar = new Guitar(0,"Buzz","Gibson","ES-335",0,9.00f);
        int actualQty = guitar.getQty();

        assertEquals(expectedQty,actualQty);
    }

    @Test
    public void testGetPrice() {
        float expectedPrice = 2300.00f;
        Guitar guitar = new Guitar(0,"Buzz","Gibson","ES-335",0,2300.00f);
        float actualPrice = guitar.getPrice();

        assertEquals(expectedPrice,actualPrice);
    }
}
