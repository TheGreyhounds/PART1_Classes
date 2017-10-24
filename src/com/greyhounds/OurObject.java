package com.greyhounds;

public class OurObject extends Object {
        
        public OutObject() {
                super();
        }
        
        @Override
        protected Object clone() {
                super();
                // Creates a new object that is the same
                // as the object being cloned, and returns it.
        }
        
		// Notice, because the method of the superclass
		// takes an argument, our overriding method has to
		// pass it the argument inside the call "super()"
        @Override
        boolean equals(Object object) {
                super(object);
                // Determines whether one object is equal to another.
        }
        
        @Override
        void finalize() {
                super();
                // Code here is run right before
                // an unused object is garbage-collected.
        }
        
        @Override
        Class<OurObject> getClass() {
                super();
               // Obtains the class of an object at run time.
        }
        
        @Override
        int hashCode() {
                super();
                // Returns the hash code associated
                // with the invoking object.
        }
        
        @Override
        void notify() {
                super();
                // Resumes execution of a thread waiting
                // on the invoking object.
        }
        
        @Override
        void notifyAll() {
                super();
                // Resumes execution of all threads waiting
                // on the invoking object.
        }
        
        @Override
        String toString() {
                super();
                // Returns a String that describes the object.
        }
        
        @Override
        void wait() {
                super();
                // Waits on another thread of execution.
        }
}
