// create a java program that displays the seven wonders and their location using polymorphims

import java.util.Scanner;

// Abstract class
abstract class SevenWonders {

    // Abstract methods
    abstract void showWonder();
    abstract String getLocation();

    // Normal method
    public void displayWonder() {
        System.out.println("I am from the abstract class.");
    }
}

// Wonder class
class Wonder extends SevenWonders {

    String name;
    String location;

    Wonder(String name, String location) {
        this.name = name;
        this.location = location;
    }
    @Override
    void showWonder() {
        System.out.println("Wonder: " + name);
    }
    @Override
    String getLocation() {
        return location;
    }
}

// Main class
public class seven_wonders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of SevenWonders
        SevenWonders[] wonders = new SevenWonders[7];

        // Initialize the wonders
        wonders[0] = new Wonder("Great Wall of China", "China");
        wonders[1] = new Wonder("Petra", "Jordan");
        wonders[2] = new Wonder("Christ the Redeemer", "Brazil");
        wonders[3] = new Wonder("Machu Picchu", "Peru");
        wonders[4] = new Wonder("Chichen Itza", "Mexico");
        wonders[5] = new Wonder("Roman Colosseum", "Italy");
        wonders[6] = new Wonder("Taj Mahal", "India");

        // Display the wonders and their locations
        for (SevenWonders wonder : wonders) {
            wonder.showWonder();
            System.out.println("Location: " + wonder.getLocation());
            System.out.println();
        }

        scanner.close();
    }
}
