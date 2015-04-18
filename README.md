Java Contract Test Example
--------------------------

This program provides an example of how to enforce Liskov's Substitution Principle with JUnit.

I use it as an illustration for a blog post.

You can build and run the program from command line. The repository contains all the neccessary files.

Use the following process to do so:

Clone the Repository
--------------------

```bash
$> git clone https://github.com/supalogix/java-liskov-example.git
```

Change to the directory
-----------------------

```bash
$> cd java-liskov-example
```

Create an output directory for the .class files
-----------------------------------------------

```bash
$> mkdir output
```

Compile all the java files
--------------------------

```bash
$> javac -d output -cp .:lib/* test/set/*.java test/set/impl/*.java
```

Run a test
----------

```bash
$> java -cp .:lib/*:output/* org.junit.runner.JUnitCore HashSetTest
```
