package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.PropertyPermission;

public class CinemaPresent {
    public String[] presentList = new String[]{"Stickers", "Notebook", "Notebook+Popcorn+Water",
            "Poster+Signature", "No_Present", "InvalidInput"};


    //x: Ticket
    //y: Popcorn/Water
    public String givePresent(int ticket, int popcorn_water) {
        if (ticket < 0 || popcorn_water < 0) {
            return presentList[presentList.length - 1];
        } else {
            if (ticket >= 3 && ticket <= 5) {
                if (popcorn_water >= 5 && popcorn_water <= 8) {
                    return presentList[0];
                } else if (popcorn_water > 8) {
                    return presentList[1];
                }
            } else if (ticket > 5) {
                if (popcorn_water >= 5 && popcorn_water <= 8) {
                    return presentList[2];
                } else if (popcorn_water > 8) {
                    return presentList[3];
                }
            }
            return presentList[4];
        }
    }
}
