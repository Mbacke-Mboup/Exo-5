package org.mboup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws IOException {

        //Recevoir le path
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        String path = s + "/src/main/java/org/mboup";

        //Recevoir l'option a excuter
        Scanner input = new Scanner(System.in);
        System.out.println("Option:");
        String option = input.nextLine();


        //Excute l'option

        //Option 1
        if (option.equals("1")) {
            try {
                EcrireVide(path);
            } catch (IOException erreur) {
                System.out.println("Erreur1: " + erreur.getMessage());
            }
        }
        //Option 2
        else if (option.equals("2")) {
            try {
                EcrireParent(path);
            } catch (IOException erreur) {
                System.out.println("Erreur2: " + erreur.getMessage());
            }
        }
        //Invalid
        else {
            System.out.println("Option Invalide.");
        }
    }

    public static void EcrireVide(String path) throws IOException {
        File file = new File(path, "vide.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("Fichier Créé");
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write("");
                writer.close();
                System.out.println("Fichier Modifié");

            } catch (IOException e) {
                throw new IOException();
            }
        }

    }

    public static void EcrireParent(String path) throws IOException {
        File file = new File(path);
        File parent = new File(file.getParent(), "parent.txt");
        if (!parent.exists()) {
            file.createNewFile();
            System.out.println("Fichier Créé");
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(parent));
            writer.write("Mboup Mbacké");
            writer.close();
            System.out.println("Fichier Modifié");
        } catch (IOException e) {
            throw new IOException();
        }
    }
}