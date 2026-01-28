public class Main {
    static void main(String[] args) {

        Restaurant r1 = new Restaurant();
        Restaurant r2 = new Restaurant(30, 3.9, 17.89, 2.7, "6:00 am - 9:00pm");

        System.out.println(r2.waitTime);
        System.out.println(r2.rating);
        System.out.println(r2.avgPrice);
        System.out.println(r2.distance);
        System.out.println(r2.hoursOpen);
    }
}
