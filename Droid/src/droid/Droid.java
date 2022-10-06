/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package droid;

/**
 *
 * @author jcls1987
 */
public class Droid {

    /**
     * @param args the command line arguments
     */
    int batteryLevel;
    String name;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I'm the droid: " + name + ".";
    }

    //DOING DROID THINGS
    public void performTask(String task) {
        batteryLevel = batteryLevel - 10;
        System.out.println(name + " is performing task: " + task);
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.performTask("coding");
    }

}
