package com.greyhounds;

public class OurObject extends Object {
        
        public OurObject() {
                super();
        }
        
        @Override
        protected Object clone() throws CloneNotSupportedException {
                return super.clone();
                // Creates a new object that is the same
                // as the object being cloned, and returns it.
        }
        
		// Notice, because the method of the superclass
		// takes an argument, our overriding method has to
		// pass it the argument inside the call "super()"
        @Override
        public boolean equals(Object object) {
                return super.equals(object);
                // Determines whether one object is equal to another.
        }
        
        @Override
        protected void finalize() throws Throwable {
                super.finalize();
                // Code here is run right before
                // an unused object is garbage-collected.
        }
        
        @Override
        public int hashCode() {
                return super.hashCode();
                // Returns the hash code associated
                // with the invoking object.
        }
        
        @Override
        public String toString() {
                return super.toString();
                // Returns a String that describes the object.
        }
}
