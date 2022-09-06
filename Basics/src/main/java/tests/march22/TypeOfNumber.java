package tests.march22;

public class TypeOfNumber {
    public static void main(String[] args) {
        int num = 28;
        int res = sumOfProperDivisors(num);
        if (res == 0)
            System.out.println("Perfect Number");
        else if (res == 1) 
            System.out.println("Abundant Number");
        else if (res == -1)
            System.out.println("Deficient Number");
        else
            System.out.println("Please Enter Positive Number");
    }

    public static int sumOfProperDivisors(int num) {
        // ADD YOUR CODE HERE
    }
}

