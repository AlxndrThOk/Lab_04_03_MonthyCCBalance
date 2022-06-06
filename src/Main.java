public class Main {
    public static void main(String[] args)
    {
        double initialBalance = 5000;
        double INTEREST_RATE = 0.17;
        System.out.println("Your initial balance was " + initialBalance);
        System.out.println("Interest due after one month is " + initialBalance * INTEREST_RATE);
        System.out.println("Interest due after two months is " + initialBalance * INTEREST_RATE * INTEREST_RATE);
    }
}