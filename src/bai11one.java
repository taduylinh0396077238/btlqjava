public class bai11one {
    public static void main(String[] asgr) {
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;

        int number = lowerbound;
        while (number <= upperbound) {
            sum = sum + number;
            ++number;
        }
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
