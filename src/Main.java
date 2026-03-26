import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        scanRestaurantsFile(restaurants);
        printRandomRestaurant(restaurants);
    }

    public static void scanRestaurantsFile(ArrayList<Restaurant> restaurants) throws FileNotFoundException {
        File file = new File("src/re.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String line = scan.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split(",");

            String name      = parts[0].trim();
            int waitTime     = Integer.parseInt(parts[1].trim());
            double rating    = Double.parseDouble(parts[2].trim());
            double avgPrice  = Double.parseDouble(parts[3].trim());
            double distance  = Double.parseDouble(parts[4].trim());
            String hoursOpen = parts[5].trim();

            if (rating > 5) {
                rating = -1;
            }

            restaurants.add(new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen));
        }
        scan.close();
    }

    /**
     * chooses a random Restaurant from an ArrayList and outputs the Restaurant
     * @param restaurants ArrayList of Restaurant
     */
    public static void printRandomRestaurant(ArrayList<Restaurant> restaurants) {
        Random randy = new Random();
        int numRestaurants = restaurants.size();
        int randIndex = randy.nextInt(numRestaurants);
        System.out.println(restaurants.get(randIndex));
    }
}
