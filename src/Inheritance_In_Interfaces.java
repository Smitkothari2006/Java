/**
 * Program to demonstrate **Inheritance in Interfaces** in Java.

 * Key Concepts:
 * 1. Interfaces in Java can extend other interfaces using the `extends` keyword.
 * 2. A class implementing a sub-interface must provide implementations for
 * all methods declared in the interface hierarchy.
 * 3. The `@Override` annotation is used to denote that the method is
 * overridden from an interface or superclass.

 * In this example:
 * - `Sample1` is a base interface with two methods.
 * - `SubSample` extends `Sample1` and adds two more methods.
 * - `Apply` is a class that implements `SubSample`, and hence provides
 * implementations for all four methods.
 */

@SuppressWarnings("unused")
interface Sample1 {
    void method1(); // Base interface method

    void method2(); // Base interface method
}

@SuppressWarnings("unused")
interface SubSample extends Sample1 {
    void method3(); // Sub-interface method

    void method4(); // Sub-interface method
}

// Class that implements the sub-interface, hence must implement all methods from both Sample1 and SubSample
class Apply implements SubSample {

    @Override
    public void method1() {
        System.out.println("I am from Method 1 (Sample1)");
    }

    @Override
    public void method2() {
        System.out.println("I am from Method 2 (Sample1)");
    }

    @Override
    public void method3() {
        System.out.println("I am from Method 3 (SubSample)");
    }

    @Override
    public void method4() {
        System.out.println("I am from Method 4 (SubSample)");
    }
}

public class Inheritance_In_Interfaces {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("=== Program to understand Inheritance in Interfaces ===");

        // Creating an instance of Apply which implements SubSample (and by inheritance, Sample1)
        Apply ap = new Apply();

        // Calling methods implemented from both interfaces
        ap.method1(); // From Sample1
        ap.method2(); // From Sample1
        ap.method3(); // From SubSample
        ap.method4(); // From SubSample
    }
}