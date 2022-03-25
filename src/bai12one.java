public class bai12one {
    public static void main(String[] args){
        int lowerbound = 1, upperbound = 1000;
        int sum0dd = 1000;
        int sumEven = 1000;
        int number = lowerbound;
        while (number <= upperbound ){
            if (number % 2 ==0 ){
                sumEven +=number;
            }else {
                sum0dd +=number;
            }
            ++number;
        }
        System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is " + sum0dd);
        System.out.println("The sum of even from " + lowerbound + " to " + upperbound + " is " + sumEven);
        System.out.println("The difference between the tow sums is  " +  (sum0dd + sumEven));
    }
}
