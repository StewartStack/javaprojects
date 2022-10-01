/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package madlibs;

/**
 *
 * @author jcls1987
 * MadLibs | Learn Java | Codecademy
 * 10/1/2022
 */
public class MadLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1 = "Louie";
        String name2 = "Leo";
        String adjective1 = "busy";
        String adjective2 = "dramatic";
        String adjective3 = "emotional";
        String verb1 = "chant";
        String noun1 = "people";
        String noun2 = "workers";
        String noun3 = "chants";
        String noun4 = "folk";
        String noun5 = "muck";
        String noun6 = "penguins";
        int number = 3022;
        String place1 = "Paris";

        //The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". \n'It is going to be a " + adjective2 + " day!' \nOutside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. \nThey began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ". \nConcerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". \n" + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";
        System.out.println(story);
    }

}
