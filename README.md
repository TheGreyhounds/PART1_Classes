# PART1_Classes
The most powerful and fundamental tool in the Java language, the defining feature of OOP: the Class. 

NOTE: You have to compile the code in this repository on the command line differently, since it utilizes
a package structure. To compile all the code at once, you MUST run the command, exactly as written:
```
javac -cp classes/ -d classes/ src/com/greyhounds/*.java
```
which compiles all the .java files at once. The "-cp" flag is to specify where the package directory of already
compiled classes starts (when you first run this command, this directory will be empty, but afterwards will contain
class files that have already been compiled), and the "-d" flag is to specify where the .class files are supposed
to go once compiled. To run the compiled code, you MUST use the command, exactly as written:
```
java -cp classes/ com.greyhounds.Test
```
where in this case, the "-cp" flag is specifying the location of the start of the package directory, which mirrors
the directory as it is coded, and tells the java command where our compiled code is located.


There is a lot to absorb in this repository, but it is essentially a demonstration of these key features in Java:
- Creating classes outside of the class containing the main() method.
- Use of the package structure in projects, and how it is mirrored in the directory structure of the project.
- The use of the "final" identifier to make variables immutable after they have been initialized.
- Overriding of methods, like the toString() command, in subclasses (Point is a subclass of Object, like all classes).
- Overloading methods (delcaring multiple methods of the same name).
- The Object class is the root of the class heirarchy in Java, and every class in Java implicitly is a subclass of Object.
- Use of the "super" keyword to refer to a member of the superclass.
- The use of nested classes and the scope of their member variables and methods in the encapsulating class.

Remember, a class is the blueprint for a data-type, an object is an actual instance of that data-type. the class "Mug", for instance,
is only the specifications of what properties and methods the "Mug" may have, but we don't actually have a real "Mug" you can hold
in your hand until we create an instance of class Mug, and get an object.

You don't have to know all or even most of these aspects of Object Oriented Programming. In fact, some - like
nested classes - you may never use. Despite this, you should be introduced to as many Object Oriented Programming concepts
as possible so that you are at least familiar with their function and purpose as you go forward and become a better programmer. 
Much, much more has been written on the subject and is supported in Java than can be included here, however, so don't take this
repository as an overall summary of OOP, just an introduction.

If you want some real examples of Object Oriented Programming, [this](https://github.com/Yalantis/StarWars.Android/tree/master/demo/src/main/java/com/yalantis/starwarsdemo)
GitHub repository is using the Android framework, which is heavily reliant on OOP. Looking at this repository, try to look for uses
of the "@Override" annotation, and the "extends" keyword. They will explicitly tell you when a method is being overriden, or what class
is being extended (inherited).
