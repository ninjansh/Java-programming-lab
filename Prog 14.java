//Demonstrate the java class using getter setter method for accessing private data members
import java.util.Scanner;



public class Person {

    private String name;

    private int age;



    public Person(String name, int age) {

        this.name = name;

        this.age = age;

    }



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }



    public int getAge() {

        return age;

    }



    public void setAge(int age) {

        this.age = age;

    }



    public void displayInfo() {

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

    }



    public static void main(String[] args) {

        

        Person person = new Person("Ansh", 30);



        System.out.println("Name: " + person.getName());

        System.out.println("Age: " + person.getAge());



        person.setName("Sasha");

        person.setAge(25);



        System.out.println("\nUpdated information:");

        person.displayInfo();

    }

}

