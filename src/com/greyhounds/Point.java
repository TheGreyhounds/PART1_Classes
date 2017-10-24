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
        // a copy of them. In this particular case,
        // the instance variables are final, meaning
        // they are immutable and cannot be changed once set.
        private final int x;
        private final int y;
        
        // This is a constructor, which always has
        // the same name as the encapsulating class, and
        // is usually public.
        public Point(int x, int y) {
                // "this" is an object reference
                // to the current object being constructed
                this.x = x;
                this.y = y;
        }
        
        public int getX() {
                return x;
        }
        
        public int getY() {
                return y;
        }
}
