package com.study;

//1-write a lambda expression which accepts x and y no and return x^y

//interface Mathx {
//    double operation(double x, double y);
//}
//
//public class Lambda {
//    public static void main(String[] args) {
//
//        Mathx power = (x, y) -> Math.pow(x, y);
//
//        System.out.println("Power: " + power.operation(5, 5));
//    }
//}
//


//2-write a method that uses lambda expression to format a given string,
//where a space is inserted b/w each character of string.
//FOR EX, if input is "CG", then expected output is "C G".

//interface StringFormatter {
//    String format(String s);
//}
//
//public class Lambda {
//    public static void main(String[] args) {
//
//        StringFormatter formatter = s -> String.join(" ", s.split(""));
//                
//
//        System.out.println(formatter.format("CG"));
//    }
//}

//3-write a method that uses lambda exp. to accept username and password and return true or false 
// (use any custom values username and password for authentication)

//interface Auth {
//    boolean login(String user, String pass);
//}
//
//public class Lambda {
//    public static void main(String[] args) {
//
//        Auth authenticate = (u, p) -> u.equals("admin") && p.equals("1234");
//
//        System.out.println(authenticate.login("admin", "1234"));
//        System.out.println(authenticate.login("admins", "1234"));
//    }
//}


//4-write a class with main method to demonstrate instance creation using method reference
//(create any simple class with attributes and getters and setters)

//import java.util.function.Supplier;
//
//class Student {
//
//    private String name;
//
//    public Student() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//public class Lambda {
//    public static void main(String[] args) {
//
//        // Method reference to constructor
//        Supplier<Student> l1 = Student::new;
//
//        // Creating object using method reference
//        Student s = l1.get();
//
//        // Using setters
//        s.setName("Abhigyan");
//
//        // Using getters
//        System.out.println("Name: " + s.getName());
//    }
//}

//sol-2
//interface StudentsList {
//    Student create();
//}
//
//class Student {
//
//    private String name;
//
//    public Student() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//public class Lambda {
//    public static void main(String[] args) {
//
//        // Method reference to constructor using custom interface
//        StudentsList l1 = Student::new;
//
//        // Create object
//        Student s = l1.create();
//
//        s.setName("Abhigyan");
//        System.out.println("Name: " + s.getName());
//    }
//}

//5-write a method to calculate factorial of a no. Test this method using method reference feature

interface Factorial {
    int calculate(int n);
}

class CalculateFact {

    // Method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class Lambda {
    public static void main(String[] args) {

        // Method reference
        Factorial f = CalculateFact::factorial;

        // Testing
        System.out.println("Factorial of 5: " + f.calculate(5));
        
    }
}