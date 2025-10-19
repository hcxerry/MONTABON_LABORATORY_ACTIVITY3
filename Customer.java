public class Customer {
    // Instance Variables
    private String name;
    private int points;

    // Static Variable
    private static int totalCustomers = 0;

    // ===== Constructors =====
    // Default Constructor
    public Customer() {
        this.name = "No Name";
        this.points = 0;
        totalCustomers++;
    }

    // Parameterized Constructor (name and points)
    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
        totalCustomers++;
    }

    // Parameterized Constructor (name only)
    public Customer(String name) {
        this.name = name;
        this.points = 0;
        totalCustomers++;
    }

    // ===== Instance Methods =====
    public void addPoints(int earnedPoints) {
        this.points += earnedPoints;
    }

    public void redeemReward() {
        if (points >= 100) {
            System.out.println("Congratulations " + name + "! You redeemed a free drink!");
            points -= 100;
            System.out.println("Remaining Points: " + points);
        } else {
            System.out.println(name + ", you need more points to redeem a free drink.");
            System.out.println("Current Points: " + points);
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Points: " + points);
        System.out.println("---------------------------");
    }

    public int getPoints() {
        return points;
    }

    // ===== Static Methods =====
    public static void displayTotalCustomers() {
        System.out.println("Total Registered Customers: " + totalCustomers);
    }

    public static void getAllowedRewardsRedemption(Customer customer) {
        int redeemable = customer.points / 100;
        System.out.println(customer.name + " can redeem " + redeemable + " free drink(s).");
    }
}
