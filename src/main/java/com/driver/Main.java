package com.driver;

public class Main {
  // A.java
public class A {
    public String meth() {
        return "Invoking method from class A";
    }
}
// B.java
public class B extends A {
    // Method overriding will be done in Task 4
  @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
// Main.java
public class Main {
    public static void main(String[] args) {
        // Create an object of class B
        B obj = new B();

        // Call method 'meth' from class A using class B object
        System.out.println(obj.meth());  // Output: "Invoking method from class A"
    }
}

  
}
