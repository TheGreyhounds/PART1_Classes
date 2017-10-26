package com.greyhounds;

public class Test {
        public static void main(String[] args) {
                Point ourPoint = new Point(10.0, -10.0);
                System.out.println("Our point has the coordinates x: " + ourPoint.getX() + " and y: " + ourPoint.getY());
                System.out.println("Our point is " + ourPoint.toString());
                
                // ERROR! Will not compile, because x is a private variable
                //ourPoint.x = 31.0;
                
                Printer ourPrinter = new Printer();
                ourPrinter.println("Hello World!");
                ourPrinter.println(new Integer(10));
                ourPrinter.println(new Double(3.14159265));
                ourPrinter.println(new Boolean(true));
                ourPrinter.println("Hello World!", "\n", "It's so nice to have method overloading!");
                
                
                OurObject ourObject = new OurObject();
                Object object = new Object();
                ourPrinter.println("Our Object: ", ourObject.toString(), " Java's Object: ", object.toString());
                
                System.out.println(ourObject.getClass() + " " + object.getClass());
                System.out.println("Hashes of the objects:");
                System.out.println("Our Object: " + ourObject.hashCode() + " Java's Object: " + object.hashCode());
                
                Outer outerObject = new Outer();
                outerObject.test();
                outerObject.showInnerX();
        }
}
