import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        // Instantiate an ArrayList to hold Restaurant Object
        ArrayList<Restaurant> restaurantsList = new ArrayList<>();

        // Take user input using JOptionPane and store in a variable
        String restaurantName = JOptionPane.showInputDialog("Enter the Restaurant name, please:");
        int waitTime = Integer.parseInt(JOptionPane.showInputDialog("How long was the Restaurants wait time in minutes Ex(30):"));
        double rating = Double.parseDouble(JOptionPane.showInputDialog("What would you rate this Restaurant from 0.0 to 10.00"));
        double avgPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter average price of the restaurant Ex(12.50): "));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter the distance the restaurant in Mile Ex(5.5): "));
        String hoursOpen = JOptionPane.showInputDialog("Enter hours of operation: Ex(9:00am - 10:00pm");

        // Instantiate Restaurant object with those variables

        Restaurant userRestaurant = new Restaurant(restaurantName, waitTime, avgPrice, distance, hoursOpen);
        System.out.println(userRestaurant.toString());

        // Add user's restaurant object to the arraylist
        restaurantsList.add(userRestaurant);


    }
}