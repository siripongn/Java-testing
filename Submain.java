

import OOP.Ooptest;
import OOP.Abstrac.Dog;
import OOP.Abstrac.Pig;
import OOP.Interface.Ooppig;


class Submain {
        public static void main(String[] args) {

            Main myObj1 = new Main();  // Object 1
            myObj1.x = 40; // modify attribute Object 1 values is 40

            Main myObj2 = new Main();  // Object 2
            myObj2.x = 10; // modify attribute Object 2 values is 10

            Main myObj3 = new Main();
            myObj3.x = 20;  // will generate an error: cannot assign a value to a final variable

            System.out.println(myObj1.x);
            System.out.println(myObj2.x);
            System.out.println(myObj3.y);

            Main myObj4 = new Main();
            System.out.println("Name: " + myObj4.fname + " " + myObj4.lname);
            System.out.println("Age: " + myObj4.age);

            Main myObj5 = new Main();
            myObj5.setName("Test"); // Set the value of the name variable to "John" 
            System.out.println(myObj5.getName());

            Ooptest.myStaticMethod(); // Call the static method

            Ooptest myObj6 = new Ooptest(); // Create an object of MyClass
            myObj6.myPublicMethod(); // Call the public method


            Pig myPig1 = new Pig(); // Create a Pig object
            myPig1.animalSound();
            myPig1.sleep();

            Dog myDog = new Dog(); // Create a Pig object
            myDog.animalSound();
            myDog.sleep();

            Ooppig myPig2 = new Ooppig();  // Create a Pig object
            myPig2.animalSound();
            myPig2.sleep();

        }

}
