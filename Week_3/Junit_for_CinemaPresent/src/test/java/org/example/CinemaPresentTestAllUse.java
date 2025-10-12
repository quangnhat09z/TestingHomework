package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinemaPresentTestAllUse {
    private CinemaPresent cinemaPresent;

    @BeforeEach
    void setUp() {
        cinemaPresent = new CinemaPresent();
    }

    @Test
    void testL1() {
        String actual = cinemaPresent.givePresent(-1, 5);
        String expected = "InvalidInput";
        assertEquals(expected, actual);
    }

    @Test
    void testL2() {
        String actual = cinemaPresent.givePresent(2, 1);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }

    @Test
    void testL3() {
        String actual = cinemaPresent.givePresent(3, 5);
        String expected = "Stickers";
        assertEquals(expected, actual);
    }



    @Test
    void testL4() {
        String actual = cinemaPresent.givePresent(6, 6);
        String expected = "Notebook+Popcorn+Water";
        assertEquals(expected, actual);
    }


    @Test
    void testL5() {
        String actual = cinemaPresent.givePresent(1, -5);
        String expected = "InvalidInput";
        assertEquals(expected, actual);
    }
    @Test
    void testL6() {
        String actual = cinemaPresent.givePresent(5, 9);
        String expected = "Notebook";
        assertEquals(expected, actual);
    }

    @Test
    void testL7() {
        String actual = cinemaPresent.givePresent(5, 4);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }

    @Test
    void testL8() {
        String actual = cinemaPresent.givePresent(10, 10);
        String expected = "Poster+Signature";
        assertEquals(expected, actual);
    }

    @Test
    void testL9() {
        String actual = cinemaPresent.givePresent(6, 0);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }
}
