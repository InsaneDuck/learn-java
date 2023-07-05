package basic;

/**
 * Serialization and Deserialization
 */
import java.io.*;

class Employee implements Serializable {
    private static final long serialversionUID = 129348938L;
    transient int a;
    static int b;
    String name;
    int age;

    // Default constructor
    public Employee(String name, int age, int a, int b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }
}

class TestExceptionPropagation {

    void method1() {
        int data = 10 / 0; // generates an exception
        System.out.println(data);
    }

    void method2() {
        method1(); // doesn't catch the exception
    }

    void method3() { // method3 catches the exception
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }

    final public static void main(String args[]) {
        TestExceptionPropagation obj = new TestExceptionPropagation();
        obj.method3();
    }
}

public class SerialExample {

    public static void printdata(Employee object1) {
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }

    public static void main(String[] args) {
        Serialize();
        Deserialization();
    }

    static void Serialize()
    {
        Employee object = new Employee("ab", 20, 2, 1000);
        String filename = "file.txt";
        // Serialization
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n"
                    + "Data before Deserialization.");
            printdata(object);
            // value of static variable changed
            object.b = 2000;
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }
    static void Deserialization()
    {
        String filename = "file.txt";
        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            Employee o = (Employee) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");
            printdata(o);
            System.out.println("z = " + o.toString());
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}