package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinemaPresentTestTable {
    private CinemaPresent cinemaPresent;

    @BeforeEach
    void setUp() {
        cinemaPresent = new CinemaPresent();
    }

    @Test
    public void testR01() {
        String actual = cinemaPresent.givePresent(-1, -1);
        String expected = "InvalidInput";
        assertEquals(expected, actual);
    }

    @Test
    public void testR02() {
        String actual = cinemaPresent.givePresent(-1, 3);
        String expected = "InvalidInput";
        assertEquals(expected, actual);
    }

    @Test
    public void testR03() {
        String actual = cinemaPresent.givePresent(-1, 5);
        String expected = "InvalidInput";
        assertEquals(expected, actual);
    }


    @Test
    public void testR04() {
        String actual = cinemaPresent.givePresent(-1, 9);
        String expected = "InvalidInput";
        assertEquals(expected, actual);
    }


    @Test
    public void testR05() {
        String actual = cinemaPresent.givePresent(2, -2);
        String expected = "InvalidInput";
        assertEquals(expected, actual);
    }


    @Test
    public void testR06() {
        String actual = cinemaPresent.givePresent(2, 3);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }

    @Test
    public void testR07() {
        String actual = cinemaPresent.givePresent(2, 6);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }

    @Test
    public void testR08() {
        String actual = cinemaPresent.givePresent(2, 10);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }

    @Test
    public void testR09() {
        String actual = cinemaPresent.givePresent(4, -1);
        String expected = "InvalidInput";
        assertEquals(expected, actual);
    }

    @Test
    public void testR10() {
        String actual = cinemaPresent.givePresent(4, 4);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }


    @Test
    public void testR11() {
        String actual = cinemaPresent.givePresent(4, 5);
        String expected = "Stickers";
        assertEquals(expected, actual);
    }


    @Test
    public void testR12() {
        String actual = cinemaPresent.givePresent(4, 11);
        String expected = "Notebook";
        assertEquals(expected, actual);
    }


    @Test
    public void testR13() {
        String actual = cinemaPresent.givePresent(7, -5);
        String expected = "InvalidInput";
        assertEquals(expected, actual);
    }


    @Test
    public void testR14() {
        String actual = cinemaPresent.givePresent(7, 2);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }


    @Test
    public void testR15() {
        String actual = cinemaPresent.givePresent(7, 8);
        String expected = "Notebook+Popcorn+Water";
        assertEquals(expected, actual);
    }


    @Test
    public void testR16() {
        String actual = cinemaPresent.givePresent(7, 11);
        String expected = "Poster+Signature";
        assertEquals(expected, actual);
    }


}
