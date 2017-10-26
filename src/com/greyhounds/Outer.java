package com.greyhounds;

public class Outer {
        int outer_x = 100;
        
        public void test() {
                Inner inner = new Inner();
                inner.display();
        }
        
        class Inner {
                int inner_x = 10; // inner_x is local to Inner
                
                void display() {
                        System.out.println("Outer_x is equal to " + outer_x);
                }
        }
        
        public void showInnerX() {
                System.out.println("The line below in this method wouldn't compile, because inner_x is local to the Inner class.");
                //System.out.println(inner_x); 
        }
}
