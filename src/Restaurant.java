public class Restaurant {
    // Properties
    private String restaurantName;
    private int waitTime;
    private double rating;
    private double avgPrice;
    private double distance;
    private String hoursOpen;

    /// menu items

    // Constructor
    public Restaurant() {}

    public Restaurant(String restaurantName, int waitTime, double avgPrice, double distance, String hoursOpen) {
        this.restaurantName = restaurantName;
        this.waitTime = waitTime;
        this.avgPrice = avgPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;


    }
    // Getters and setters

    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getWaitTime() { return waitTime; }


    public void setWaitTime(int waitTime) {this.waitTime = waitTime;}

    public double getRating() {return rating;}


    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    public String getHoursOpen() {
        return hoursOpen;
    }

    public void setHoursOpen(String hoursOpen) {
        this.hoursOpen = hoursOpen;
    }

    @Override
    public String toString() {
        return "Restaurant Name:\t " + restaurantName +
                "\nWait Time:\t\t\t" + waitTime +
                "\nRating:\t\t\t\t" + rating +
                "\nAverage Price:\t\t" + avgPrice +
                "\nDistance:\t\t\t" + distance +
                "\nHours of Operation:" + hoursOpen;
    }
}


