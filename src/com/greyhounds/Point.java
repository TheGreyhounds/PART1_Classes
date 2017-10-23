// Note: You HAVE to specify that this
// class is a part of this package, or
// it will not compile. This package mirrors
// the directory structure on the machine,
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
        // is always public.
        // The constructor can
        public Point(int x, int y) {
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
