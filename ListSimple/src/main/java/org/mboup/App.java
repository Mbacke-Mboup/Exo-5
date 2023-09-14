package org.mboup;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Nombres:\n"+repete(4, 2));

    }

    public static List<Integer> repete(int nbr, int nbrFois) {
        List<Integer> nombre = new ArrayList<>();
        for (int i = 1 ; i <= nbr; i++) {
            for (int j = 0; j < nbrFois; j++) {
                nombre.add(i);
            }

        }
        return nombre;
    }
}
