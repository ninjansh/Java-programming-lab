// demonstrate protected access specifier and usind extends
class Animal
{
    protected String name;
    protected void display()
        {
            System.out.println("I am not an animal");
        }
}
class Dog extends Animal
{
    public static void main(String []args)
    {
    Dog dog = new Dog();
    dog.display();
    dog.name="Paplesh";
    System.out.println(dog.name);
}
}
// save as "Dog.java"
