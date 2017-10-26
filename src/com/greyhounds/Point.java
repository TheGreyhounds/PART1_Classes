// Note: You HAVE to specify that this
// class is a part of this package, or
// it will not compile. This package mirrors
// this project's directory structure,
// so if the subdirectories in src/ were to 
// change, so would this package name.
package com.greyhounds;

public class Point {
        // These are called instance variables,
        // because every instance of the class has
        // a copy of them. 
	private final double x;
        private final double y;
	// In this particular case,
        // the instance variables are final, meaning
        // they are immutable and cannot be changed once set.
        
        // This is a constructor, which always has
        // the same name as the encapsulating class, and
        // is usually public.
        public Point(double x, double y) {
                // "this" is an object reference
                // to the current object being constructed
                this.x = x;
                this.y = y;
        }
        
        public double getRadiusFromOrigin() {
                return Math.sqrt(x*x + y*y);
        }
        
        public double getX() {
                return x;
        }
        
        public double getY() {
                return y;
        }
        
        @Override
        public String toString() {
                String stringOfPoint = new String("(" + x + ", " + y + ")");
                return stringOfPoint;
        }
        
}
