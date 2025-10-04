package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinemaPresentTestFlowC2 {
    private CinemaPresent cinemaPresent;

    @BeforeEach
    void setUp() {
        cinemaPresent = new CinemaPresent();
    }

    @Test
    void testP1() {
        String actual = cinemaPresent.givePresent(-1, -1);
        String expected = "InvalidInput";
        assertEquals(expected, actual);
    }

    @Test
    void testP2() {
        String actual = cinemaPresent.givePresent(3, 5);
        String expected = "Stickers";
        assertEquals(expected, actual);
    }

    @Test
    void testP3() {
        String actual = cinemaPresent.givePresent(3, 9);
        String expected = "Notebook";
        assertEquals(expected, actual);
    }



    @Test
    void testP4() {
        String actual = cinemaPresent.givePresent(3, 3);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }


    @Test
    void testP5() {
        String actual = cinemaPresent.givePresent(2, 10);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }
    @Test
    void testP6() {
        String actual = cinemaPresent.givePresent(6, 5);
        String expected = "Notebook+Popcorn+Water";
        assertEquals(expected, actual);
    }

    @Test
    void testP7() {
        String actual = cinemaPresent.givePresent(6, 4);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }

    @Test
    void testP8() {
        String actual = cinemaPresent.givePresent(6, 9);
        String expected = "Poster+Signature";
        assertEquals(expected, actual);
    }



}
