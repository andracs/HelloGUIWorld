/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 14/12/2021
 */
package dk.acsandras.helloguiworld.model;

import java.util.ArrayList;

public class GaveListe {
    public ArrayList<Gave> indhold = new ArrayList<>();

    public GaveListe() {
        indhold.add(new Gave("Hest", 10000));
        indhold.add(new Gave("Lego", 100));
        indhold.add(new Gave("Shotgun", 4000));
    }
}
