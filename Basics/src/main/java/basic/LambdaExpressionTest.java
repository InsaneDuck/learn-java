package basic;

public class LambdaExpressionTest {
    int a; // instance variable
    static int b; // static variable

    LambdaExpressionTest(int x) {    // constructor to initialise instance variable
        this.a = x;
    }

    void show() {
        // lambda expression to define print() method
        TestInterface testInterface = () -> {
            // accessing of instance and static variable using lambda expression
            System.out.println("Value of a is: " + a);
            System.out.println("Value of b is: " + b);
        };
        testInterface.print();
    }

}
